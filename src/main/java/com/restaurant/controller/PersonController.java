package com.restaurant.controller;

import com.restaurant.servie.impl.PersonServiceImpl;
import com.restaurant.utils.BaseExecution;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RequestMapping("/user")
public class PersonController {


    private PersonServiceImpl personServiceImpl = new PersonServiceImpl();


    /**
     * @author lihaimeng 2018/1/14
     * @param account
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/registor.do", method = RequestMethod.POST)
    public BaseExecution register(@RequestParam("account") String account, @RequestParam("password") String password,
                                  @RequestParam("name") String name, @RequestParam("telephone") String telephone) {
        BaseExecution baseExecution = personServiceImpl.register(account, password, name, telephone);
        return baseExecution;
    }

    /**
     * @author lihaimeng 2018/1/14
     * @param account
     * @param password
     * @return
     */
	@ResponseBody
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public BaseExecution login(@RequestParam("account") String account, @RequestParam("password") String password) {
        BaseExecution baseExecution = personServiceImpl.login(account, password);
        return baseExecution;
    }

	@ResponseBody
	@RequestMapping(value = "/getPerson.do", method = RequestMethod.POST)
    public BaseExecution getPerson(@RequestParam("account")String account) {
		BaseExecution baseExecution = personServiceImpl.getPerson(account);
		return baseExecution;
	}

	/**
	 * @author lihaimeng 2018/2/3
	 *
	 */
	@ResponseBody
	@RequestMapping(value = "/changePassword.do", method = RequestMethod.POST)
	public BaseExecution changePassword(@RequestParam("account") String account, @RequestParam("oldPassword") String oldPassword,
										@RequestParam("newPassword") String newPassword) {
		BaseExecution baseExecution = personServiceImpl.changePassword(account, oldPassword, newPassword);
		return baseExecution;
	}

	@ResponseBody
	@RequestMapping(value = "/forgetPassword.do", method = RequestMethod.POST)
	public BaseExecution forgetPassword(@RequestParam("account") String account, @RequestParam("name") String name,
										@RequestParam("telephone") String telephone, @RequestParam("password") String password) {
		BaseExecution baseExecution = personServiceImpl.forgetPassword(account, name, telephone, password);
		return baseExecution;
	}

	@ResponseBody
	@RequestMapping(value = "/updatePerson.do", method = RequestMethod.POST)
	public BaseExecution updatePerson(@RequestParam("account") String account, @RequestParam("name") String name,
										@RequestParam("telephone") String telephone, @RequestParam("password") String password) {
		BaseExecution baseExecution = personServiceImpl.updatePerson(account, name, telephone, password);
		return baseExecution;
	}

}
