package com.restaurant.servie;

import com.restaurant.entity.Menu;
import com.restaurant.entity.OrderedMenu;
import com.restaurant.entity.SortedMenu;

import java.util.List;

public interface CookerService {

	// menu
	public void addMenu(Menu menu);
	public void removeMenu(int id);
	public void updateMenu(Menu menu);
	public void checkDetail(int id);
	public List<Menu> selectMenu(int start, int end);
	public List<Menu> selectMenuByName(String name, int start, int end);
	public List<Menu> selectMenuBySeason(String season, int start, int end);
	public List<Menu> selectMenuByType(String type, int start, int end);

	// Sorted
	public void selectMenuAsPublic(int id);
	public void removeMenuPublic(int id);
	public List<SortedMenu> selectPublicMenus(int start, int end);
	public List<SortedMenu> selectPublicMenuBySeason(String season, int start, int end);
	public List<SortedMenu> selectPublicMenuByName(String name, int start, int end);
	public List<SortedMenu> selectPublicMenuByType(String type, int start, int end);

	public void selectMenuAsPrivate(int id);
	public void removeMenuPrivate(int id);
	public List<SortedMenu> selectPrivateMenus(int start, int end);
	public List<SortedMenu> selectPrivateMenuBySeason(String season, int start, int end);
	public List<SortedMenu> selectPrivateMenuByName(String name, int start, int end);
	public List<SortedMenu> selectPrivateMenuByType(String type, int start, int end);


	//ordered
	public List<OrderedMenu> selectOrderedPrivateMenus(String type, String useTime, int start, int end);
	public List<OrderedMenu> selectOrderedPublicMenus(String type, String useTime,int start, int end);
	public List<OrderedMenu> selectOrderedPublicMenuNumbers(String type, String useTime, int start, int end);





}
