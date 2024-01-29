package com.sagility.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sagility.exception.UserNotFoundException;

@RestController
public class UserRestController {
	
	@GetMapping("user/{userid}")
	public String getUserName(@PathVariable Integer userid) throws Exception{
		if (userid == 100)
		return "Arko";
		if(userid == 200)
			return "Diskha";
		else {
			throw new UserNotFoundException ("User not found");
		}
					
		
	}

}
