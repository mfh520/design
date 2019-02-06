import com.alibaba.fastjson.JSON;
import com.restaurant.dao.SortedPublicMenuMapper;
import com.restaurant.dao.impl.SortedPublicMenuMapperImpl;
import com.restaurant.entity.SortedMenu;
import org.junit.jupiter.api.Test;

import java.util.List;

public class daoSortedPublicMenuTest {

	@Test
	public void testSelectMenuAsPublic() {
		SortedPublicMenuMapper sortedPublicMenuMapper = new SortedPublicMenuMapperImpl();
		sortedPublicMenuMapper.selectMenuAsPublic(2);
	}

	@Test
	public void testRemovePrivateMenu() {
		SortedPublicMenuMapper sortedPublicMenuMapper = new SortedPublicMenuMapperImpl();
		sortedPublicMenuMapper.removeMenuPublic(2);
	}

	@Test
	public void testGetPrivateMenu() {
		SortedPublicMenuMapper sortedPublicMenuMapper = new SortedPublicMenuMapperImpl();
//		List<SortedMenu> orderedMenus = sortedPublicMenuMapper.selectPublicMenus(0, 2);
//		List<SortedMenu> orderedMenus = sortedPublicMenuMapper.selectPublicMenuByName("name", 0, 2);
		List<SortedMenu> orderedMenus = sortedPublicMenuMapper.selectPublicMenuBySeason("s", 0, 2);
//		List<SortedMenu> orderedMenus = sortedPublicMenuMapper.selectPublicMenuByType("t", 0, 2);
		System.out.println(JSON.toJSONString(orderedMenus));
	}

}
