package com.restaurant.servie;

import com.restaurant.entity.Food;
import com.restaurant.utils.BaseExecution;

import java.util.List;

public interface FoodService {

    /**
     * @author lihaimeng 2018/1/16
     * @return
     */
    public BaseExecution insertFood();

    /**
     * @author lihaimeng 2018/1/16
     * @return
     */
    public BaseExecution useFood();

    /**
     * @author lihaimeng 2018/1/16
     * @return
     */
    public BaseExecution addFoiod();


    /**
     * @author lihaimeng 2018/1/16
     * @return
     */
    public BaseExecution updateFood();

    /**
     * @author lihaimeng 2018/1/16
     * @return
     */
    public List<Food> selectFoods();


}

