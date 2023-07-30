package com.springrest.springrest.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.entity.*;

public interface UserDao extends JpaRepository<User,Integer>{

}
