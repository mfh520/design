package com.restaurant.servie.impl;

import com.restaurant.entity.Menu;
import com.restaurant.entity.OrderedMenu;
import com.restaurant.entity.SortedMenu;
import com.restaurant.servie.CookerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookerServiceImpl implements CookerService {
	@Override
	public void addMenu(Menu menu) {

	}

	@Override
	public void removeMenu(int id) {

	}

	@Override
	public void updateMenu(Menu menu) {

	}

	@Override
	public void checkDetail(int id) {

	}

	@Override
	public List<Menu> selectMenu(int start, int end) {
		return null;
	}

	@Override
	public List<Menu> selectMenuByName(String name, int start, int end) {
		return null;
	}

	@Override
	public List<Menu> selectMenuBySeason(String season, int start, int end) {
		return null;
	}

	@Override
	public List<Menu> selectMenuByType(String type, int start, int end) {
		return null;
	}

	@Override
	public void selectMenuAsPublic(int id) {

	}

	@Override
	public void removeMenuPublic(int id) {

	}

	@Override
	public List<SortedMenu> selectPublicMenus(int start, int end) {
		return null;
	}

	@Override
	public List<SortedMenu> selectPublicMenuBySeason(String season, int start, int end) {
		return null;
	}

	@Override
	public List<SortedMenu> selectPublicMenuByName(String name, int start, int end) {
		return null;
	}

	@Override
	public List<SortedMenu> selectPublicMenuByType(String type, int start, int end) {
		return null;
	}

	@Override
	public void selectMenuAsPrivate(int id) {

	}

	@Override
	public void removeMenuPrivate(int id) {

	}

	@Override
	public List<SortedMenu> selectPrivateMenus(int start, int end) {
		return null;
	}

	@Override
	public List<SortedMenu> selectPrivateMenuBySeason(String season, int start, int end) {
		return null;
	}

	@Override
	public List<SortedMenu> selectPrivateMenuByName(String name, int start, int end) {
		return null;
	}

	@Override
	public List<SortedMenu> selectPrivateMenuByType(String type, int start, int end) {
		return null;
	}

	@Override
	public List<OrderedMenu> selectOrderedPrivateMenus(String type, String useTime, int start, int end) {
		return null;
	}

	@Override
	public List<OrderedMenu> selectOrderedPublicMenus(String type, String useTime, int start, int end) {
		return null;
	}

	@Override
	public List<OrderedMenu> selectOrderedPublicMenuNumbers(String type, String useTime, int start, int end) {
		return null;
	}
}
