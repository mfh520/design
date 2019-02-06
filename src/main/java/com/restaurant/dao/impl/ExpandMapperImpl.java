package com.restaurant.dao.impl;

import com.restaurant.dao.ExpandMapper;
import com.restaurant.entity.Expand;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ExpandMapperImpl implements ExpandMapper {
	@Override
	public void insert(Expand expand) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		ExpandMapper expandMapper = sqlSession.getMapper(ExpandMapper.class);
		expandMapper.insert(expand);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void deleteFromDB(int id) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		ExpandMapper expandMapper = sqlSession.getMapper(ExpandMapper.class);
		expandMapper.deleteFromDB(id);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public List<Expand> selectExpandByData(String dateBegin, String dateEnd, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		ExpandMapper expandMapper = sqlSession.getMapper(ExpandMapper.class);
		List<Expand> expands = expandMapper.selectExpandByData(dateBegin, dateEnd, start, end);
		sqlSession.close();
		return expands;
	}

	@Override
	public List<Expand> selectExpandByType(String type, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		ExpandMapper expandMapper = sqlSession.getMapper(ExpandMapper.class);
		List<Expand> expands = expandMapper.selectExpandByType(type, start, end);
		sqlSession.close();
		return expands;
	}

	@Override
	public List<Expand> selectExpands(String dateBegin, String dateEnd, String type, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		ExpandMapper expandMapper = sqlSession.getMapper(ExpandMapper.class);
		List<Expand> expands = expandMapper.selectExpands(dateBegin, dateEnd, type, start, end);
		sqlSession.close();
		return expands;
	}
}
