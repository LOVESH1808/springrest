package com.springrest.springrest.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.springrest.springrest.entity.User;
import com.springrest.springrest.service.Services;

@RestController
public class MyController {
	
	@Autowired
	private Services ob;
	@GetMapping("/home")
	public String home()
	{
		return "This is Hme";
	}
	
	@GetMapping("/users")
	public List<User> getUser()
	{
		return this.ob.getUser();
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId)
	{
		return this.ob.getUser(userId);
	}
	
	@PostMapping("/users")
	public User getUser(@RequestBody User u)
	{
		return this.ob.addUser(u);
	}
	
	@PutMapping("/users")
	public User addUser(@RequestBody User u)
	{
		return this.ob.UpdateUser(u);
	}
	
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable int userId)
	{
		try {
			this.ob.deleteUser(userId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
