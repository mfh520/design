package com.restaurant.dao.impl;

import com.restaurant.dao.MenuMapper;
import com.restaurant.entity.Menu;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuMapperImpl implements MenuMapper {

	@Override
	public int insertMenu(Menu menu) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		int id = menuMapper.insertMenu(menu);
		sqlSession.commit();
		sqlSession.close();
		return id;
	}

	@Override
	public int isExists(String name) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		int result = menuMapper.isExists(name);
		sqlSession.close();
		return result;
	}

	@Override
	public Menu checkDetail(int id) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		Menu menu = menuMapper.checkDetail(id);
		sqlSession.close();
		return menu;
	}

	@Override
	public void updateMenu(Menu menu) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		menuMapper.updateMenu(menu);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void deleteMenu(int id) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		menuMapper.deleteMenu(id);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public int selectMenuNumber() {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		int number = menuMapper.selectMenuNumber();
		sqlSession.close();
		return number;
	}

	@Override
	public List<Menu> selectMenu(int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		List<Menu> menus = menuMapper.selectMenu(start, end);
		sqlSession.close();
		return menus;
	}

	@Override
	public List<Menu> selectMenuByName(String name, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		List<Menu> menus = menuMapper.selectMenuByName(name, start, end);
		sqlSession.close();
		return menus;
	}

	@Override
	public List<Menu> selectMenuBySeason(String season, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		List<Menu> menus = menuMapper.selectMenuBySeason(season, start, end);
		sqlSession.close();
		return menus;
	}

	@Override
	public List<Menu> selectMenuByType(String type, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		List<Menu> menus = menuMapper.selectMenuByType(type, start, end);
		sqlSession.close();
		return menus;
	}
}
