package com.restaurant.servie;

import com.restaurant.utils.BaseExecution;

public interface PersonService {
	public BaseExecution register(String account, String password, String name, String telephone);
	public BaseExecution login(String account, String password);
	public BaseExecution getPerson(String account);
	public BaseExecution updatePerson(String account,String name, String telephone, String password);
	public BaseExecution changePassword(String account, String oldPass, String newPass);
	public BaseExecution forgetPassword(String account, String name, String telephone, String password);


}
