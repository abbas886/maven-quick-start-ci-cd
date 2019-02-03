package com.stackroute.noteapp.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroute.noteapp.model.User;


public class UserServiceTestCase {
	
	
	private static User user;
	
	private static UserService userService;
	
	private static AnnotationConfigApplicationContext context;
	
	//in the assignment - xml -> bean.xml;
	
	//private ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("bean.xml");
	
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cgi");
		context.refresh();
		
		user = (User)context.getBean("user");
		userService = (UserService)context.getBean("userService");
		
		initialize();
	
	}
	
	private static void initialize() {
		user = new User();
		user.setId("sreevani");
		user.setPassowrd("sreevani");
		user.setName("sreevani");
		 userService.save(user);
		 
		 user = new User();
			user.setId("kumar");
			user.setPassowrd("kumar");
			user.setName("kumar");
			 userService.save(user);
			 
			 user = new User();
				user.setId("gayathri");
				user.setPassowrd("gayathri");
				user.setName("gayathri");
				 userService.save(user);
		
	}

	@Test
	public void saveUserSuccessTestCase()
	{
		user = new User();
		user.setId("shankar");
		user.setPassowrd("shankar");
		user.setName("shankar");
		 assertTrue(userService.save(user));
		
		
	}
	
	
	
	@Test
	public void saveUserFailureTestCase()
	{
		user = new User();
		user.setId("gayathri");
		user.setPassowrd("gayathri");
		user.setName("gayathri");
		 assertFalse(userService.save(user));
		
		
	}
	
	
	@Test
	public void getSuccessUserTestCase()
	{
	  User user =   userService.get("kumar");
	  assertNotNull(user);
	  //check other fields also.
	  
	  assertEquals("kumar", user.getName());
	  
	}
	
	
	@Test
	public void getSuccessFailureTestCase()
	{
	  User user =   userService.get("abbas");
	  assertNull(user);
	  
	}
	
	
   //validateUserSuccess
	
	//validateUserFailure
	
	
	//deleteUserSuccess
	
	//deleteUserFailure
	
	
	//getAllUsers
	@Test
	public void getAllUsersTestCase()
	{
		List<User> userList = userService.get();
		
		assertEquals(10, userList.size());
		//you should compare fields also...
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
