package com.restaurant.dao.impl;

import com.restaurant.dao.OrderedPublicMenuMapper;
import com.restaurant.dao.SortedPublicMenuMapper;
import com.restaurant.entity.OrderedMenu;
import com.restaurant.entity.SortedMenu;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OrderedPublicMenuMapperImpl implements OrderedPublicMenuMapper {

	@Override
	public void selectOrderedAsPublic(int menuId, String account, String type, String useTime, int number) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		OrderedPublicMenuMapper orderedPublicMenuMapper = sqlSession.getMapper(OrderedPublicMenuMapper.class);
		orderedPublicMenuMapper.selectOrderedAsPublic(menuId, account, type, useTime, number);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void removeOrderedPublic(int menuId, String account, String type, String useTime) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		OrderedPublicMenuMapper orderedPublicMenuMapper = sqlSession.getMapper(OrderedPublicMenuMapper.class);
		orderedPublicMenuMapper.removeOrderedPublic(menuId, account, type, useTime);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public List<OrderedMenu> selectOrderedPublicByCustomer(String account, String type, String useTime) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		OrderedPublicMenuMapper orderedPublicMenuMapper = sqlSession.getMapper(OrderedPublicMenuMapper.class);
		List<OrderedMenu> orderedMenus = orderedPublicMenuMapper.selectOrderedPublicByCustomer(account, type, useTime);
		sqlSession.close();
		return orderedMenus;
	}

	@Override
	public List<OrderedMenu> selectOrderedPublicMenus(String type, String useTime,int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		OrderedPublicMenuMapper orderedPublicMenuMapper = sqlSession.getMapper(OrderedPublicMenuMapper.class);
		List<OrderedMenu> orderedMenus = orderedPublicMenuMapper.selectOrderedPublicMenus(type, useTime, start, end);
		sqlSession.close();
		return orderedMenus;
	}

	@Override
	public List<OrderedMenu> selectOrderedPublicMenuNumbers(String type, String useTime, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		OrderedPublicMenuMapper orderedPublicMenuMapper = sqlSession.getMapper(OrderedPublicMenuMapper.class);
		List<OrderedMenu> orderedMenus = orderedPublicMenuMapper.selectOrderedPublicMenuNumbers(type, useTime, start, end);
		sqlSession.close();
		return orderedMenus;
	}


}
