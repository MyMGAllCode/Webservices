package com.security;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.domain.User;

@RestController
public class Register {
	String message="User Not Registered";
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	@ResponseBody
	public String registerUser(@ModelAttribute("user") User user){
		if(user!=null){
		message="User"+user.getName()+" with Id:"+user.getUserId()+" is Succesfull Register"	;
		}
		
		return message;
		
	}

}
