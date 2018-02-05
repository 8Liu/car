package com.liudehuang.carType.service;

import java.util.Map;

import com.liudehuang.carType.model.CarType;
import com.liudehuang.carType.model.param.CarTypePO;


public interface CarTypeService {
	Map<String, Object> list();
	Map<String, Object> update(CarType carType);
	Map<String, Object> save(CarType carType);
	Map<String, Object> deleteById(Integer carTypeBOId);
	Map<String, Object> search(Map<String, Object> map);
}
