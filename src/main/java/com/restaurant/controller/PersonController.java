package com.restaurant.controller;

import com.alibaba.fastjson.JSON;
import com.restaurant.entity.IPerson;
import com.restaurant.entity.Person;
import com.restaurant.servie.impl.PersonServiceImpl;
import com.restaurant.utils.BaseExecution;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController implements IPerson {


    private PersonServiceImpl personServiceImpl = new PersonServiceImpl();


    /**
     * @author lihaimeng 208/1/14
     * @param account
     * @param password
     * @return
     */
    @Override
    @ResponseBody
    @RequestMapping(value = "html/registor", method = RequestMethod.POST)
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
    public BaseExecution login(@RequestParam("account") String account, @RequestParam("password") String password) {
        BaseExecution baseExecution = personServiceImpl.login(account, password);
        return baseExecution;
    }


    public BaseExecution getPerson(@RequestParam("account")String account) {
		BaseExecution baseExecution = personServiceImpl.getPerson(account);
		return baseExecution;
	}

	/**
	 * @author lihaimeng 2018/2/3
	 *
	 */
	public BaseExecution changePassword(@RequestParam("account") String account, @RequestParam("oldPassword") String oldPassword,
										@RequestParam("newPassword") String newPassword) {
		BaseExecution baseExecution = personServiceImpl.changePassword(account, oldPassword, newPassword);
		return baseExecution;
	}


	public BaseExecution forgetPassword(@RequestParam("account") String account, @RequestParam("name") String name,
										@RequestParam("telephone") String telephone, @RequestParam("password") String password) {
		BaseExecution baseExecution = personServiceImpl.forgetPassword(account, name, telephone, password);
		return baseExecution;
	}

	public BaseExecution updatePerson(@RequestParam("account") String account, @RequestParam("name") String name,
										@RequestParam("telephone") String telephone, @RequestParam("password") String password) {
		BaseExecution baseExecution = personServiceImpl.updatePerson(account, name, telephone, password);
		return baseExecution;
	}



	@Test
    public void test() {
//        System.out.println(JSON.toJSONString(register("lizi", "sdf")));
        System.out.println(JSON.toJSONString(login("lizi", "sdf")));
    }



    /**
     * @author lihaimeng 2018/1/14
     * @param account
     * @return
     */
    private static boolean exist(String account) {
        return true;
    }
}
