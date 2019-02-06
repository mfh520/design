import com.alibaba.fastjson.JSON;
import com.restaurant.dao.ExpandMapper;
import com.restaurant.dao.impl.ExpandMapperImpl;
import com.restaurant.entity.Expand;
import org.junit.jupiter.api.Test;

import java.util.List;

public class daoExpandTest {
	@Test
	public void testInsert() {
		String date = "2019-02-06";
		String type = "in";
		double money = 14.2;
		String message = "mdcd";
		Expand expand = new Expand(date, type, money, message);
		ExpandMapper expandMapper = new ExpandMapperImpl();
		expandMapper.insert(expand);
	}

	@Test
	public void testDelete() {
		int id = 1;
		ExpandMapper expandMapper = new ExpandMapperImpl();
		expandMapper.deleteFromDB(id);
	}

	@Test
	public void testGetExpandByTime() {
		String dateBegin = "2019-02-03";
		String dateEnd = "2019-02-08";
		ExpandMapper expandMapper = new ExpandMapperImpl();
		List<Expand> expands = expandMapper.selectExpandByData(dateBegin, dateEnd, 0, 4);
		System.out.println(JSON.toJSONString(expands));
	}

	@Test
	public void testGetExpandByType() {
		String type = "in";
		ExpandMapper expandMapper = new ExpandMapperImpl();
		List<Expand> expands = expandMapper.selectExpandByType(type, 0, 4);
		System.out.println(JSON.toJSONString(expands));
	}

	@Test
	public void testGetExpands() {
		String dateBegin = "2019-02-03";
		String dateEnd = "2019-02-08";
		String type = "in";
		ExpandMapper expandMapper = new ExpandMapperImpl();
		List<Expand> expands = expandMapper.selectExpands(dateBegin, dateEnd, type, 0, 4);
		System.out.println(JSON.toJSONString(expands));
	}


}
