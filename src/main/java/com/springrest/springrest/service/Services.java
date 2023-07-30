package com.springrest.springrest.service;
import java.util.*;

import com.springrest.springrest.entity.User;
public interface Services {
	
	public List<User> getUser();
	public User getUser(int userId);
	public User addUser(User u);
	public User UpdateUser(User u);
	public void deleteUser(int userId);
}
