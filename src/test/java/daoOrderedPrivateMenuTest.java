import com.alibaba.fastjson.JSON;
import com.restaurant.dao.OrderedPrivateMenuMapper;
import com.restaurant.dao.impl.OrderedPrivateMenuMapperImpl;
import com.restaurant.entity.OrderedMenu;
import org.junit.jupiter.api.Test;

import java.util.List;

public class daoOrderedPrivateMenuTest {

	@Test
	public void testOrder() {
		int menuId = 1;
		String account = "acca";
		String type = "breakfast";
		String useTime = "2019-2-5";
		int number = 1;
		OrderedPrivateMenuMapper orderedPrivateMenuMapper = new OrderedPrivateMenuMapperImpl();
		orderedPrivateMenuMapper.selectOrderedAsPrivate(menuId, account, type, useTime, number);
	}

	@Test
	public void testRemove() {
		int menuId = 1;
		String account = "acca";
		String type = "breakfast";
		String useTime = "2019-2-5";
		OrderedPrivateMenuMapper orderedPrivateMenuMapper = new OrderedPrivateMenuMapperImpl();
		orderedPrivateMenuMapper.removeOrderedPrivate(menuId, account, type, useTime);
	}

	@Test
	public void testCheck() {
		String account = "acca";
		String type = "breakfast";
		String useTime = "2019-2-5";
		OrderedPrivateMenuMapper orderedPrivateMenuMapper = new OrderedPrivateMenuMapperImpl();
		List<OrderedMenu> orderedMenus = orderedPrivateMenuMapper.selectOrderedPrivateByCustomer(account, type, useTime);
		System.out.println(JSON.toJSONString(orderedMenus));
	}

	@Test
	public void testGetByCooker() {
		String type = "breakfast";
		String useTime = "2019-2-5";
		OrderedPrivateMenuMapper orderedPrivateMenuMapper = new OrderedPrivateMenuMapperImpl();
		List<OrderedMenu> orderedMenus = orderedPrivateMenuMapper.selectOrderedPrivateMenus(type, useTime, 0, 3);
		System.out.println(JSON.toJSONString(orderedMenus));
	}

}
