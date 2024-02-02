package com.practice.optional;

import java.util.Optional;

public class User {
	public String getUserNameById(Integer userid) {
		if (userid == 101) {
			return "Arko";
		}
		return null;
	}
	
	public Optional<String> getUserName(Integer userid) {
		String name = null;
		if (userid == 101) {
			name = "Arko";
		}
		return Optional.ofNullable(name);
	}

}
