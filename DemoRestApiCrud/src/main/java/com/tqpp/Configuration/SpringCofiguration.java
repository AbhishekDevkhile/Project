package com.tqpp.Configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableTransactionManagement
@EnableWebMvc
@ComponentScan("com.tqpp")
@Configuration
@PropertySource("classpath:application-properties")
public class SpringCofiguration {
	
	@Autowired
	private Environment environment;
	
	
	@ResponseBody
	@Bean
	public InternalResourceViewResolver viewresolver()
	{
		InternalResourceViewResolver i=new InternalResourceViewResolver();
		i.setPrefix("/WEB-INF/JSP/");
		i.setSuffix(".jsp");
		return i;
		 
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sessionfactory=new LocalSessionFactoryBean();
		sessionfactory.setDataSource(datasource());
		sessionfactory.setHibernateProperties(gethibernateProperties());
		sessionfactory.setPackagesToScan("com.tqpp.Model"); 
		return  sessionfactory;
	}
	
	//create obj of Properties
	public Properties gethibernateProperties()
	 {
		 Properties p=new Properties();
		 p.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		 p.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		 p.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		return p;
		 
	 }
	
	//create object of datasource()
	
	public DriverManagerDataSource datasource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUrl(environment.getRequiredProperty("jdbc.url"));
		datasource.setDriverClassName(environment.getRequiredProperty("jdbc.drivername"));		
		datasource.setUsername(environment.getRequiredProperty("jdbc.username"));
		datasource.setPassword(environment.getRequiredProperty("jdbc.password"));
		return datasource;
	}
	
	@Bean
	public HibernateTransactionManager transactionmanager(SessionFactory ob)
	{
		HibernateTransactionManager tx=new HibernateTransactionManager();
		tx.setSessionFactory(ob);
		return tx;
		
	}
	
	

}
