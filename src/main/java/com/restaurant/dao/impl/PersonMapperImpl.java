package com.restaurant.dao.impl;

import com.restaurant.dao.PersonMapper;
import com.restaurant.entity.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PersonMapperImpl implements PersonMapper {
    @Override
    public void addPerson(Person person) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        personMapper.addPerson(person);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public int isExists(String account) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        int isExist = personMapper.isExists(account);
        sqlSession.close();
        return isExist;
    }

    @Override
    public String selectPassword(String account) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        String passFromDB = personMapper.selectPassword(account);
        sqlSession.close();
        return passFromDB;
    }

    @Override
    public void changePassword(String account, String password) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        personMapper.changePassword(account, password);
        sqlSession.close();
        sqlSession.commit();
    }

    @Override
    public Person selectPerson(String id) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        Person person = personMapper.selectPerson(id);
        sqlSession.close();
        return person;
    }

    @Override
    public void updatePerson(Person person) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        personMapper.updatePerson(person);
        sqlSession.commit();
        sqlSession.close();
    }
}
