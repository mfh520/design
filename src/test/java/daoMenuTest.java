import com.alibaba.fastjson.JSON;
import com.restaurant.dao.MenuMapper;
import com.restaurant.dao.impl.MenuMapperImpl;
import com.restaurant.entity.Menu;
import org.junit.jupiter.api.Test;

import java.util.List;

public class daoMenuTest {

	@Test
	public void testInsert() {
		MenuMapper menuMapper = new MenuMapperImpl();
		Menu menu = new Menu("forth", "type", 13, "Sp");
		int id = menuMapper.insertMenu(menu);
		System.out.println(id);
	}

	@Test
	public void testSelect() {
		MenuMapper menuMapper = new MenuMapperImpl();
		Menu menu = menuMapper.checkDetail(1);
		System.out.println(JSON.toJSONString(menu));
	}

	@Test
	public void testUpdate() {
		MenuMapper menuMapper = new MenuMapperImpl();
		Menu menu = new Menu(1, "name", "type?", 133., "Sps");
		menuMapper.updateMenu(menu);
		System.out.println(JSON.toJSONString(menu));
	}

	@Test
	public void testDelete() {
		MenuMapper menuMapper = new MenuMapperImpl();
		menuMapper.deleteMenu(1);
	}

	@Test
	public void testSelectMenu() {
		MenuMapper menuMapper = new MenuMapperImpl();
		List<Menu> menus = menuMapper.selectMenu(0, 3);
		System.out.println(JSON.toJSONString(menus));
	}

	@Test
	public void testSelectMenuByName() {
		MenuMapper menuMapper = new MenuMapperImpl();
		String name = "name";
		List<Menu> menus = menuMapper.selectMenuByName(name, 0, 3);
		System.out.println(JSON.toJSONString(menus));
	}

	@Test
	public void testSelectMenuByType() {
		MenuMapper menuMapper = new MenuMapperImpl();
		String type = "?";
		List<Menu> menus = menuMapper.selectMenuByType(type, 0, 3);
		System.out.println(JSON.toJSONString(menus));
	}


	@Test
	public void testSelectMenuBySeason() {
		MenuMapper menuMapper = new MenuMapperImpl();
		String season= "s";
		List<Menu> menus = menuMapper.selectMenuBySeason(season, 0, 3);
		System.out.println(JSON.toJSONString(menus));
	}

}
