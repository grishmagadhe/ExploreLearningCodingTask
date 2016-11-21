package com.explore.users;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.servlet.ErrorPage;

import com.explore.users.model.User;

@SpringBootApplication
public class MainApplication {

	private static final String PATH = "/error";
	public static HashMap<Integer, User> userDetails;
	
	 public static void main(String[] args) {
	      SpringApplication.run(MainApplication.class, args);
	      MainApplication.setupUsers();
	 }

	 @Bean
	    public EmbeddedServletContainerCustomizer containerCustomizer() {
	      return (container -> {
	   	   
	   	   final ErrorPage errorPage=new ErrorPage(PATH);
	   	   container.addErrorPages(errorPage);
	      });
	   }
	 private static void setupUsers(){
		 userDetails=new HashMap<Integer, User>(1);
	      
	      User one=new User(1,"Jeffrey","Archer");
	      userDetails.put(one.getId(), one);
	      
	      User two=new User(2,"Sophie","Kinsela");
	      userDetails.put(two.getId(), two);
	      
	      User three=new User(3,"Stephnie","Meyer");
	      userDetails.put(three.getId(), three);
	 }
}
