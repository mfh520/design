package com.restaurant.servie;

import com.restaurant.entity.Menu;

import java.util.List;

public interface MenuService {

    public void insert(Menu menu);

    public void update(Menu menu);

    public void delete(String id);

    public Menu selectMenuDetailById(String id);

    public List<Menu> selectAllMenu();

    public List<Menu> selectMenuBySeason(String season);


    public List<Menu> selectMenuByName(String name);


}
