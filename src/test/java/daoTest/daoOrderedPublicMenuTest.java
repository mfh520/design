package daoTest;

import com.alibaba.fastjson.JSON;
import com.restaurant.dao.OrderedPrivateMenuMapper;
import com.restaurant.dao.OrderedPublicMenuMapper;
import com.restaurant.dao.impl.OrderedPrivateMenuMapperImpl;
import com.restaurant.dao.impl.OrderedPublicMenuMapperImpl;
import com.restaurant.entity.OrderedMenu;
import org.junit.jupiter.api.Test;

import java.util.List;

public class daoOrderedPublicMenuTest {

	@Test
	public void testOrder() {
		int menuId = 1;
		String account = "acca";
		String type = "breakfast";
		String useTime = "2019-2-5";
		int number = 1;
		OrderedPublicMenuMapper orderedPublicMenuMapper = new OrderedPublicMenuMapperImpl();
		orderedPublicMenuMapper.selectOrderedAsPublic(menuId, account, type, useTime, number);
	}

	@Test
	public void testRemove() {
		int menuId = 1;
		String account = "acca";
		String type = "breakfast";
		String useTime = "2019-2-5";
		OrderedPublicMenuMapper orderedPublicMenuMapper = new OrderedPublicMenuMapperImpl();
		orderedPublicMenuMapper.removeOrderedPublic(menuId, account, type, useTime);
	}

	@Test
	public void testCheck() {
		String account = "acca";
		String type = "breakfast";
		String useTime = "2019-2-5";
		OrderedPublicMenuMapper orderedPublicMenuMapper = new OrderedPublicMenuMapperImpl();
		List<OrderedMenu> orderedMenus = orderedPublicMenuMapper.selectOrderedPublicByCustomer(account, type, useTime);
		System.out.println(JSON.toJSONString(orderedMenus));
	}



	@Test
	public void testGetByCooker() {
		String type = "breakfast";
		String useTime = "2019-2-5";
		OrderedPublicMenuMapper orderedPublicMenuMapper = new OrderedPublicMenuMapperImpl();
		List<OrderedMenu> orderedMenus = orderedPublicMenuMapper.selectOrderedPublicMenus(type, useTime, 0, 3);
		System.out.println(JSON.toJSONString(orderedMenus));
	}


	@Test
	public void testGetNumber() {
		String type = "breakfast";
		String useTime = "2019-2-5";
		OrderedPublicMenuMapper orderedPublicMenuMapper = new OrderedPublicMenuMapperImpl();
		List<OrderedMenu> orderedMenus = orderedPublicMenuMapper.selectOrderedPublicMenuNumbers(type, useTime, 0, 3);
		System.out.println(JSON.toJSONString(orderedMenus));
	}

}
