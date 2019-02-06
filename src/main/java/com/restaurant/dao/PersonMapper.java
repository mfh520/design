package com.restaurant.dao;

import com.restaurant.entity.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface PersonMapper {

    public void addPerson(Person person);
    public int isExists(String account);
    public String selectPassword(String account);
    public void changePassword(@Param("account")String account, @Param("password")String password);
    public Person selectPerson(String account);
    public void updatePerson(Person person);

}
