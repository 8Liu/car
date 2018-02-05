package com.liudehuang.carType.dao;

import java.util.List;
import java.util.Map;


import com.liudehuang.carType.model.CarType;
import com.liudehuang.carType.model.param.CarTypePO;
public interface CarTypeDao {
	List<CarType> list();
	int update(CarType carType);
	int save(CarType carType);
	int deleteById(Integer carTypeBOId);
	List<CarType> search(Map<String, Object> map);
}
