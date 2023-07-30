package com.springrest.springrest.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.UserDao;
import com.springrest.springrest.entity.User;

@Service
public class UserServiceimpl implements Services {
	
	@Autowired
	private UserDao ob;
	
//	List<User> list;
	
	public UserServiceimpl() {
//		list=new ArrayList<>();
//		list.add(new User(123,859939684,"Lovesh DUtts","loveshdutta@1808","123456","359 hno. 24"));
//		list.add(new User(133,859900004,"Bunu DUtts","Bunshdutta@1808","123456789","359 hno. 24"));
	}
	@Override
	public List<User> getUser() {
//		return list;
		return ob.findAll();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public User getUser(int userId)
	{
		
		return ob.getOne(userId);
		
//		User u=null;
//		for(User i:list)
//		{
//			if(i.getId()==userId)
//			{
//				u=i;
//				break;
//			}
//		}
//		return u;
	}
	@Override
	public User addUser(User u) {
//		list.add(u);
//		return u;
		
		ob.save(u);
		return u;
	}
	@Override
	public User UpdateUser(User u) {
		
//		list.forEach(e -> {
//			if(e.getId()==u.getId())
//			{
//				e.setName(u.getName());
//				e.setAddress(u.getAddress());
//				e.setPassword(u.getPassword());
//				e.setContact_no(u.getContact_no());
//				e.setEmail_id(u.getEmail_id());
//			}
//		});
//		
//		return u;
		
		ob.save(u);
		return u;
	}
	@SuppressWarnings("deprecation")
	@Override
	public void deleteUser(int userId) {
//		list=this.list.stream().filter(e -> e.getId()!=userId).collect(Collectors.toList());
		User entity=ob.getOne(userId);
		ob.delete(entity);
		
	}

}
