package daoTest;

import com.alibaba.fastjson.JSON;
import com.restaurant.dao.FoodMapper;
import com.restaurant.dao.impl.FoodMapperImpl;
import com.restaurant.entity.Food;
import org.junit.jupiter.api.Test;

import java.util.List;

public class daoFoodTest {
	@Test
	public void insert() {
		String date = "2019-02-05";
		String name = "name";
		int security = 10;
		String foodType = "we";
		int number = 13;
		String measure = "ge";
		int useFlag = 1;
		Food food = new Food(name, date, security, foodType, number, measure, useFlag);
		FoodMapper foodMapper = new FoodMapperImpl();
		foodMapper.insert(food);
	}

	@Test
	public void testRemove() {
		FoodMapper foodMapper = new FoodMapperImpl();
		foodMapper.remove(1);
	}

	@Test
	public void testUsed() {
		FoodMapper foodMapper = new FoodMapperImpl();
		foodMapper.used(1);
	}

	@Test
	public void testUpdate() {
		int id  = 1;
		String date = "2019-02-05";
		String name = "name ?";
		int security = 10;
		String foodType = "weA";
		int number = 13;
		String measure = "ge";
		int useFlag = 1;
		Food food = new Food(id, name, date, security, foodType, number, measure, useFlag);
		FoodMapper foodMapper = new FoodMapperImpl();
		foodMapper.update(food);
	}

	@Test
	public void testSelect() {
		FoodMapper foodMapper = new FoodMapperImpl();
		List<Food> foods = foodMapper.select(0, 4);
		System.out.println(JSON.toJSONString(foods));
	}

	@Test
	public void testTotal() {
		FoodMapper foodMapper = new FoodMapperImpl();
		List<Food> foods = foodMapper.total("2019-02-03", "2019-02-08", 0, 4);
		System.out.println(JSON.toJSONString(foods));
	}

}
