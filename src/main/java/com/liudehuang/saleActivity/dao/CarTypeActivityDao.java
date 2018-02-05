package com.liudehuang.saleActivity.dao;

import java.util.List;
import java.util.Map;

import com.liudehuang.saleActivity.model.CarTypeActivity;
import com.liudehuang.saleActivity.model.param.CarActivityBO;
import com.liudehuang.saleActivity.model.param.CarBO;
import com.liudehuang.saleActivity.model.param.ActivityBO;

public interface CarTypeActivityDao {
	//查询car_type_activity中的数据
	public List<CarTypeActivity> list();
	//向car_type_activity中添加数据
	public int insertCarActivity(CarActivityBO carActivityBO);
	//根据车型、品牌、类型查询汽车id
	public CarBO findCarTypeId(CarBO carBO);
	
	//向car_activity插入数据
	public int saveActivity(ActivityBO activityBO);
	
	//修改car_type_Activity中的数据
	public int updateCarActivity(CarActivityBO carActivityBO);
	
	//修改car_activity中的数据
	public int updateActivity(ActivityBO activityBO);
	
	//删除car_activity中的数据
	public int deleteActivity(Integer carActivityId);
	
	//删除car_type_activity中的数据
	public int deleteCarActivity(Integer carTypeActivityId);
	
	//模糊查询
	public List<CarTypeActivity> search(Map<String, Object> map);
}
