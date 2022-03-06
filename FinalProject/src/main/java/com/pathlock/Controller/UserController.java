package com.pathlock.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pathlock.Model.Order;
import com.pathlock.Model.OrderDetails;
import com.pathlock.Model.Product;
import com.pathlock.Model.User;
import com.pathlock.Service.OrderService;
import com.pathlock.Service.ProductService;
import com.pathlock.Service.UserService;
import com.pathlock.dto.Item;

@Controller
public class UserController {

	@Autowired
	private UserService uservice;

	@Autowired
	private ProductService productservice;

	@Autowired
	private OrderService orderservice;
/*
	@GetMapping("/validateuser")
	public String ValidateUser(@ModelAttribute User user, HttpServletRequest req, Model m) {

		System.out.println();
		String usernm = user.getUserName();
		String pass = user.getUserpassword();
		User u1 = uservice.getUserByNameAndPassword(usernm, pass);
		if (u1 == null) {
			m.addAttribute("status", "Invalid username and password");
			return "firstview";
		} else {
			HttpSession session = req.getSession();
			String role = u1.getRole().getRoleType();
			ArrayList<Item> cartlist = new ArrayList<Item>();
			session.setAttribute("cartlist", cartlist);
			session.setAttribute("userrole", role);
			session.setAttribute("username", u1.getUserName());
			session.setAttribute("userid", u1.getUserId());
			session.setAttribute("total", 0.0);

			if (role.equalsIgnoreCase("admin"))
				return "redirect:/productadmin";
			else
				return "redirect:/productuser";

		}

	}
*/
	
	//
	@GetMapping("/validateuser")
	public String ValidateUser(@ModelAttribute User user, HttpServletRequest req, Model m) {

		System.out.println();
		String usernm = user.getUserName();
		String pass = user.getUserpassword();
		System.out.println("============================================="+usernm);
		System.out.println("============================================="+pass);
		List<User> u1 = uservice.getUserByName(usernm);
		if (u1 == null || u1.size()==0) 
		{
			m.addAttribute("status", "Invalid username and password");
			return "firstview";
		} 
		else
		{
			User ur=null;
			for(User uu:u1)
			{
				if(BCrypt.checkpw(pass, uu.getUserpassword()))
				{
					ur=uu;
					break;
					
				}
				
			}
			if(ur==null)
			{
				req.setAttribute("status", "Invalid Password");
				return "firstview";
			}
				
			HttpSession session = req.getSession();
		//	String role = ((User) u1).getRole().getRoleType();
			ArrayList<Item> cartlist = new ArrayList<Item>();
			session.setAttribute("cartlist", cartlist);
	    //  session.setAttribute("userrole", role);
			session.setAttribute("username", ur.getUserName());
			session.setAttribute("userid", ur.getUserId());
			session.setAttribute("total", 0.0);

			if (ur.getRole().getRoleType().equalsIgnoreCase("admin"))
              {
				return "redirect:/productadmin";
              }
			else
				return "redirect:/productuser";

		}

	}
	
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam("uname") String uname, @RequestParam("upass") String upass,
			@RequestParam("Gender") String gender, @RequestParam("uage") int age, @RequestParam("uemail") String email,
			@RequestParam("uph") long num) throws Exception {

		User ob = new User(gender, uname, upass, age, email, num);
		uservice.insertUser(ob);
		return "redirect:/go";
	}

	

	@GetMapping("/cart")
	public String addCard(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null)
			return "redirect:/firstview";
		else {
			int Pid = Integer.parseInt(request.getParameter("id"));
			Double total = (Double) session.getAttribute("total");

			Product p = productservice.getProductById(Pid);
			total = total + p.getProductPrice() * 1;
			ArrayList<Item> al = (ArrayList<Item>) session.getAttribute("cartlist");
			al.add(new Item(p.getProductId(), p.getProductName(), p.getProductPrice(), p.getProductColor(), 1));
			System.out.println("*****************************"+al);
			session.setAttribute("cartlist", al);
			session.setAttribute("total", total);

			return "forward:/productuser";
		}
	}

	@GetMapping("/viewcart")
	public String showCard(HttpServletRequest request, Model m) {
		HttpSession session = request.getSession(false);
		//System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&"+session);
		if (session == null)
			m.addAttribute("status", "Empty cart");
		else {
			ArrayList<Item> al = (ArrayList<Item>) session.getAttribute("cartlist");
			m.addAttribute("cartlist", al);
			m.addAttribute("total", session.getAttribute("total"));
		}
		return "viewcart";
	}

	@GetMapping("/placeorder")
	public String placeorder(HttpServletRequest req) {
	//	System.out.println("in place orderrrrrrrrrrrrr");
		HttpSession httpsession = req.getSession(false);

		ArrayList<Item> cart = (ArrayList<Item>) httpsession.getAttribute("cartlist");
		List<Product> plist = productservice.getAllProducts();

		int uid = (int) httpsession.getAttribute("userid");
		User u = uservice.getUserById(uid);

		Order or = new Order();
		or.setOrderDate(LocalDate.now());
		or.setUser(u);
		List<OrderDetails> or_details = or.getOrderdetails();

		for (Product p : plist) {
			for (Item item : cart) {
				if (item.getItemid() == p.getProductId()) {
					or_details.add(new OrderDetails(or, p, item.getQuantity()));
				}
			}

		}

		orderservice.addOrder(or);

		return "Final";
	}

	
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		
		if(session!=null)
		{
			session.invalidate();
		}
		
		return "firstview";
	}
	
}
