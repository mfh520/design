package com.restaurant.dao.impl;

import com.restaurant.dao.OrderedPrivateMenuMapper;
import com.restaurant.dao.SortedPrivateMenuMapper;
import com.restaurant.entity.OrderedMenu;
import com.restaurant.entity.SortedMenu;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OrderedPrivateMenuMapperImpl implements OrderedPrivateMenuMapper {


	@Override
	public void selectOrderedAsPrivate(int menuId, String account, String type, String useTime, int number) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		OrderedPrivateMenuMapper orderedPrivateMenuMapper = sqlSession.getMapper(OrderedPrivateMenuMapper.class);
		orderedPrivateMenuMapper.selectOrderedAsPrivate(menuId, account, type, useTime, number);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void removeOrderedPrivate(int menuId, String account, String type, String useTime) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		OrderedPrivateMenuMapper orderedPrivateMenuMapper = sqlSession.getMapper(OrderedPrivateMenuMapper.class);
		orderedPrivateMenuMapper.removeOrderedPrivate(menuId, account, type, useTime);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public List<OrderedMenu> selectOrderedPrivateByCustomer(String account, String type, String useTime) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		OrderedPrivateMenuMapper orderedPrivateMenuMapper = sqlSession.getMapper(OrderedPrivateMenuMapper.class);
		List<OrderedMenu> orderedMenus = orderedPrivateMenuMapper.selectOrderedPrivateByCustomer(account, type, useTime);
		sqlSession.close();
		return orderedMenus;
	}

	@Override
	public List<OrderedMenu> selectOrderedPrivateMenus(String type, String useTime,int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		OrderedPrivateMenuMapper orderedPrivateMenuMapper = sqlSession.getMapper(OrderedPrivateMenuMapper.class);
		List<OrderedMenu> orderedMenus = orderedPrivateMenuMapper.selectOrderedPrivateMenus(type, useTime, start, end);
		sqlSession.close();
		return orderedMenus;
	}


}
