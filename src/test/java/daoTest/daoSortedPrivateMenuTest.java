package daoTest;

import com.alibaba.fastjson.JSON;
import com.restaurant.dao.SortedPrivateMenuMapper;
import com.restaurant.dao.impl.SortedPrivateMenuMapperImpl;
import com.restaurant.entity.SortedMenu;
import org.junit.jupiter.api.Test;

import java.util.List;

public class daoSortedPrivateMenuTest {

	@Test
	public void testSelectMenuAsPublic() {
		SortedPrivateMenuMapper sortedPrivateMenuMapper = new SortedPrivateMenuMapperImpl();
		sortedPrivateMenuMapper.selectMenuAsPrivate(2);
	}



	@Test
	public void testRemovePrivateMenu() {
		SortedPrivateMenuMapper sortedPrivateMenuMapper = new SortedPrivateMenuMapperImpl();
		sortedPrivateMenuMapper.removeMenuPrivate(2);
	}

	@Test
	public void testGetPrivateMenu() {
		SortedPrivateMenuMapper sortedPrivateMenuMapper = new SortedPrivateMenuMapperImpl();
//		List<SortedMenu> orderedMenus = sortedPrivateMenuMapper.selectPrivateMenus(0, 2);
		List<SortedMenu> orderedMenus = sortedPrivateMenuMapper.selectPrivateMenuByName("name", 0, 2);
//		List<SortedMenu> orderedMenus = sortedPrivateMenuMapper.selectPrivateMenuBySeason("s", 0, 2);
//		List<SortedMenu> orderedMenus = sortedPrivateMenuMapper.selectPrivateMenuByType("t", 0, 2);
		System.out.println(JSON.toJSONString(orderedMenus));
	}

}
