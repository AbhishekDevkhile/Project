<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <meta charset="utf-8">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</style>
</head>
<body style="margin-left:400px;margin-top:100px;" >

<form action="validateuser" method="get" >
<section class="vh-100 gradient-custom" style="align-self: center">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">
               <h2 class="fw-bold mb-2 text-uppercase">Shopping Cart!!</h2> 
              <h2 class="fw-bold mb-2 text-uppercase">Login</h2>
              <p class="text-white-50 mb-5">Please enter your Username and password!</p> 

              <div class="form-outline form-white mb-4" >
                <input type="text" name="userName" id="typeEmailX" class="form-control form-control-lg" />
                <label class="form-label" for="typeEmailX">Username</label>
              </div>
              <div class="form-outline form-white mb-4">
                <input type="password" name="userpassword" id="typePasswordX" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">Password</label>
              </div>
              <button class="btn btn-outline-light btn-lg px-5" type="submit">Login</button>
            </div>
            <div>
              <p class="mb-0">Don't have an account? <a href="signup" class="text-white-50 fw-bold">Sign Up</a></p>
            </div>
           
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</form>

</body>
</html>