package com.example.demo.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.DDO.User;

@Service
public class UserServicio {
	private List<User> users = new ArrayList();

	public UserServicio() {

		User user = new User(1L, "Junior", "1", "Junior@gmail.com");
		User user1 = new User(2L, "Juan", "2", "Juan@gmail.com");
		User user2 = new User(3L, "Alvaro", "3", "Alvaro@gmail.com");
		User user3 = new User(4L, "Victor", "4", "Victor@gmail.com");

		users.add(user);
		users.add(user1);
		users.add(user2);
		users.add(user3);

	}

	public List<User> getUser() {
		return users;

	}

	public User findbyif(Long id) {
		User found = null;
		for (User u : users) {
			if (u.getId() == id) {
				found = u;
				break;
			}
			

		}
				return found;
	}
	
	public User createuser(User user) {
		users.add(user);
		return user;
		
		
	}
}
