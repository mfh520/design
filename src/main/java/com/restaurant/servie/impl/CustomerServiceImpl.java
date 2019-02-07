package com.restaurant.servie.impl;

import com.restaurant.entity.OrderedMenu;
import com.restaurant.servie.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
	@Override
	public void selectOrderedAsPublic(int menuId, String account, String type, String useTime, int number) {

	}

	@Override
	public void removeOrderedPublic(int menuId, String account, String type, String useTime) {

	}

	@Override
	public List<OrderedMenu> selectOrderedPublicByCustomer(String account, String type, String useTime) {
		return null;
	}

	@Override
	public void selectOrderedAsPrivate(int menuId, String account, String type, String useTime, int number) {

	}

	@Override
	public void removeOrderedPrivate(int menuId, String account, String type, String useTime) {

	}

	@Override
	public List<OrderedMenu> selectOrderedPrivateByCustomer(String account, String type, String useTime) {
		return null;
	}
}
