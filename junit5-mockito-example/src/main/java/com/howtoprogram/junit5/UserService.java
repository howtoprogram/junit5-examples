package com.howtoprogram.junit5;
public class UserService {
	
	private final UserManager userManager;
	
	public UserService(){
		this(new UserManager());
	}
	
	public UserService(UserManager userManager){
		this.userManager = userManager;
	}
	
	public void save(String name){
		userManager.save(name);
	}
	
	public int getuserCount(){
		try{
			return userManager.getUserCount();
		}
		catch (Exception e){
			return -1;
		}
	}

}