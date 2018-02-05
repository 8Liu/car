package com.liudehuang.carPart.dao;

import java.util.List;
import java.util.Map;

import com.liudehuang.carPart.model.CarPart;
import com.liudehuang.carPart.model.param.CarPartPO;

public interface CarPartDao {
	List<CarPart> list();
	int update(CarPartPO carPartPO);
	int save(CarPartPO carPartPO);
	int deleteById(Integer carPartPOId);
	List<CarPart> search(Map<String, Object> map);
}
