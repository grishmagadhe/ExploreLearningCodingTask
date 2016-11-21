package com.explore.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:httpErrorCodes.properties")
public class ErrorService {
	
   @Autowired
   private Environment env;
 
   public String generateErrorMessage(final int error_code){
	 String message="";
	   switch(error_code){  
		   case 400: message=env.getProperty("400");
		   			 break;
		   case 401: message=env.getProperty("401");
		   			 break;
		   case 403: message=env.getProperty("403");
 			 		 break;
		   case 404: message=env.getProperty("404");
		   			 break;
		   case 405: message=env.getProperty("405");
			 		 break;
		   case 406: message=env.getProperty("406");
			 		 break;
		   case 407: message=env.getProperty("407");
			 		 break; 
		   case 408: message=env.getProperty("408");
			 		 break;
		   case 409: message=env.getProperty("409");
			 		 break;
		   case 411: message=env.getProperty("411");
		   			 break;
		   case 412: message=env.getProperty("412");
			 		 break;
		   case 413: message=env.getProperty("413");
			 		 break;
		   case 414: message=env.getProperty("414");
			 		 break;
		   case 415: message=env.getProperty("415");
			 		 break;
		   case 416: message=env.getProperty("416");
			 		 break;
		   case 417: message=env.getProperty("417");
			 		 break;
		   case 421: message=env.getProperty("421");
			 		 break;
		   case 422: message=env.getProperty("422");
			 		 break;
		   case 423: message=env.getProperty("423");
			 		 break;
		   case 424: message=env.getProperty("424");
			 		 break;
		   case 428: message=env.getProperty("428");
			 		 break;
		   case 429: message=env.getProperty("429");
			 		 break;
		   case 431: message=env.getProperty("431");
			 		 break;
		   case 444: message=env.getProperty("444");
			 		 break;
		   case 499: message=env.getProperty("499");
			 		 break;
		   case 500: message=env.getProperty("500");
		   			 break;
		   case 501: message=env.getProperty("405");
			 		 break;
		   case 502: message=env.getProperty("502");
			 		 break;
		   case 503: message=env.getProperty("503");
			 		 break;
		   case 504: message=env.getProperty("504");
			 		 break;
		   case 505: message=env.getProperty("505");
			 		 break;
		   case 506: message=env.getProperty("506");
			 		 break;
		   case 507: message=env.getProperty("507");
			 		 break;
		   case 508: message=env.getProperty("508");
			 		 break;
		   case 510: message=env.getProperty("510");
			 		 break;
		   case 511: message=env.getProperty("511");
			 		 break;
		   case 599: message=env.getProperty("599");
			 		 break;
	   }
	 return message;
    }
}
