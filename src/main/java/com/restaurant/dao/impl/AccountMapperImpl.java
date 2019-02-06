package com.restaurant.dao.impl;

import com.restaurant.dao.AccountMapper;
import com.restaurant.entity.Account;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AccountMapperImpl implements AccountMapper {
	@Override
	public void insertAccount(Account account) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
		accountMapper.insertAccount(account);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void deleteAccount(int id) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
		accountMapper.deleteAccount(id);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void updateAccount(Account account) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
		accountMapper.updateAccount(account);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void accountPaid(int id) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
		accountMapper.accountPaid(id);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public List<Account> selectAccountByDate(String dateBegin, String dateEnd, int start, int end) {
		SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession().openSession();
		AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
		List<Account> accounts = accountMapper.selectAccountByDate(dateBegin, dateEnd, start, end);
		sqlSession.commit();
		sqlSession.close();
		return accounts;
	}
}
