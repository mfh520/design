package com.restaurant.dao.impl;

import com.restaurant.dao.SortedPrivateMenuMapper;
import com.restaurant.dao.SortedPublicMenuMapper;
import com.restaurant.entity.SortedMenu;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SortedPublicMenuMapperImpl implements SortedPublicMenuMapper {

	@Override
	public int getPublicNumber() {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPublicMenuMapper sortedPublicMenuMapper = sqlSession.getMapper(SortedPublicMenuMapper.class);
		int number = sortedPublicMenuMapper.getPublicNumber();
		sqlSession.close();
		return number;
	}

	@Override
	public void selectMenuAsPublic(int id) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPublicMenuMapper sortedPublicMenuMapper = sqlSession.getMapper(SortedPublicMenuMapper.class);
		sortedPublicMenuMapper.selectMenuAsPublic(id);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void removeMenuPublic(int id) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPublicMenuMapper sortedPublicMenuMapper = sqlSession.getMapper(SortedPublicMenuMapper.class);
		sortedPublicMenuMapper.removeMenuPublic(id);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public List<SortedMenu> selectPublicMenus(int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPublicMenuMapper sortedPublicMenuMapper = sqlSession.getMapper(SortedPublicMenuMapper.class);
		List<SortedMenu> sortedMenus = sortedPublicMenuMapper.selectPublicMenus(start, end);
		sqlSession.close();
		return sortedMenus;
	}

	@Override
	public List<SortedMenu> selectPublicMenuBySeason(String season, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPublicMenuMapper sortedPublicMenuMapper = sqlSession.getMapper(SortedPublicMenuMapper.class);
		List<SortedMenu> sortedMenus = sortedPublicMenuMapper.selectPublicMenuBySeason(season, start, end);
		sqlSession.close();
		return sortedMenus;
	}

	@Override
	public List<SortedMenu> selectPublicMenuByName(String name, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPublicMenuMapper sortedPublicMenuMapper = sqlSession.getMapper(SortedPublicMenuMapper.class);
		List<SortedMenu> sortedMenus = sortedPublicMenuMapper.selectPublicMenuByName(name, start, end);
		sqlSession.close();
		return sortedMenus;
	}

	@Override
	public List<SortedMenu> selectPublicMenuByType(String type, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		SortedPublicMenuMapper sortedPublicMenuMapper = sqlSession.getMapper(SortedPublicMenuMapper.class);
		List<SortedMenu> sortedMenus = sortedPublicMenuMapper.selectPublicMenuByType(type, start, end);
		sqlSession.close();
		return sortedMenus;
	}

}
