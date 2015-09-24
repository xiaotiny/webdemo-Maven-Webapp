package com.imook.action;

import ognl.Ognl;
import ognl.OgnlException;

import com.imook.pojo.TUser;
import com.imook.service.LoginService;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private LoginService loginServiceImpl;
	private TUser u;
	
	public TUser getU() {
		return u;
	}

	public void setU(TUser u) {
		this.u = u;
	}

	public LoginService getLoginServiceImpl() {
		return loginServiceImpl;
	}

	public void setLoginServiceImpl(LoginService loginServiceImpl) {
		this.loginServiceImpl = loginServiceImpl;
	}

	public String doLogin() throws OgnlException{
		
		System.out.println("Start action.......");
		u=new TUser("xiaoming", "xiaoming");
		String name=(String)ognl.Ognl.getValue("userName",u );
		String userName=name;
		String password="xiaoming";
		boolean loginResult=loginServiceImpl.getUser(userName, password);
		return loginResult?"success":"failed";
	}

}
