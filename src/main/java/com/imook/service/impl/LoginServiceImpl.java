package com.imook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imook.dao.UserDAO;
import com.imook.pojo.User;
import com.imook.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserDAO userDao;
	@Override
	public boolean getUser(String userName, String password) {
		System.out.println("Start LoginServiceImpl......");
		System.out.println("userName:"+userName+" && password:"+password);
		List lst=userDao.findByName(userName);
		return lst.size()>0?true:false;
		
	}

}
