package com.restaurant.dao.impl;

import com.restaurant.dao.SortedPrivateMenuMapper;
import com.restaurant.entity.SortedMenu;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SortedPrivateMenuMapperImpl implements SortedPrivateMenuMapper {


	@Override
	public int getPrivateNumber() {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPrivateMenuMapper sortedPrivateMenuMapper = sqlSession.getMapper(SortedPrivateMenuMapper.class);
		int number = sortedPrivateMenuMapper.getPrivateNumber();
		sqlSession.close();
		return number;
	}

	@Override
	public void selectMenuAsPrivate(int id) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPrivateMenuMapper sortedPrivateMenuMapper = sqlSession.getMapper(SortedPrivateMenuMapper.class);
		sortedPrivateMenuMapper.selectMenuAsPrivate(id);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void removeMenuPrivate(int id) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPrivateMenuMapper sortedPrivateMenuMapper = sqlSession.getMapper(SortedPrivateMenuMapper.class);
		sortedPrivateMenuMapper.removeMenuPrivate(id);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public List<SortedMenu> selectPrivateMenus(int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPrivateMenuMapper sortedPrivateMenuMapper = sqlSession.getMapper(SortedPrivateMenuMapper.class);
		List<SortedMenu> sortedMenus = sortedPrivateMenuMapper.selectPrivateMenus(start, end);
		sqlSession.close();
		return sortedMenus;
	}

	@Override
	public List<SortedMenu> selectPrivateMenuBySeason(String season, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPrivateMenuMapper sortedPrivateMenuMapper = sqlSession.getMapper(SortedPrivateMenuMapper.class);
		List<SortedMenu> sortedMenus = sortedPrivateMenuMapper.selectPrivateMenuBySeason(season, start, end);
		sqlSession.close();
		return sortedMenus;
	}

	@Override
	public List<SortedMenu> selectPrivateMenuByName(String name, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPrivateMenuMapper sortedPrivateMenuMapper = sqlSession.getMapper(SortedPrivateMenuMapper.class);
		List<SortedMenu> sortedMenus = sortedPrivateMenuMapper.selectPrivateMenuByName(name, start, end);
		sqlSession.close();
		return sortedMenus;
	}

	@Override
	public List<SortedMenu> selectPrivateMenuByType(String type, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPrivateMenuMapper sortedPrivateMenuMapper = sqlSession.getMapper(SortedPrivateMenuMapper.class);
		List<SortedMenu> sortedMenus = sortedPrivateMenuMapper.selectPrivateMenuByType(type, start, end);
		sqlSession.close();
		return sortedMenus;
	}
}
