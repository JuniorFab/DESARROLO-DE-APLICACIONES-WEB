package com.example.demo.servicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.DDO.User;

@Service
public class UserServicio {
	//private List<User> users = new ArrayList();

	
	public UserServicio() {
		
		User user = new User(1L, "Junior", "1", "Junior@gmail.com");
		User user1 = new User(2L, "Juan", "2", "Juan@gmail.com");
		User user2 = new User(3L, "Alvaro", "3", "Alvaro@gmail.com");
		User user3 = new User(4L, "Victor", "4", "Victor@gmail.com");
		
		users.put(user.getId(), user);
		users.put(user1.getId(), user1);
		users.put(user2.getId(), user2);
		users.put(user3.getId(), user3);
		
	
		
	}

	public List<User> getUser() {
		return new ArrayList<User>(users.values());

	}

	
	
	private Map<Long,User> users=new HashMap<>(); 
	

	
	
	
	
	
	
	
	
	
	
}
