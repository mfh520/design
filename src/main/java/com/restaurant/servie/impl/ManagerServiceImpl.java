package com.restaurant.servie.impl;

import com.restaurant.entity.Account;
import com.restaurant.entity.Expand;
import com.restaurant.servie.ManagerService;

import java.util.List;

public class ManagerServiceImpl implements ManagerService {
	@Override
	public void insertAccount(Account account) {

	}

	@Override
	public void deleteAccount(int id) {

	}

	@Override
	public void updateAccount(Account account) {

	}

	@Override
	public void accountPaid(int id) {

	}

	@Override
	public List<Account> selectAccountByDate(String dateBegin, String dateEnd, int start, int end) {
		return null;
	}

	@Override
	public void insert(Expand expand) {

	}

	@Override
	public void deleteFromDB(int id) {

	}

	@Override
	public List<Expand> selectExpandByData(String dateBegin, String dateEnd, int start, int end) {
		return null;
	}

	@Override
	public List<Expand> selectExpandByType(String type, int start, int end) {
		return null;
	}

	@Override
	public List<Expand> selectExpands(String dateBegin, String dateEnd, String type, int start, int end) {
		return null;
	}
}
