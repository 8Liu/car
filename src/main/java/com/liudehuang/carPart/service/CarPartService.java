package com.liudehuang.carPart.service;

import java.util.Map;

import com.liudehuang.carPart.model.param.CarPartPO;

public interface CarPartService {
	Map<String, Object> list();
	Map<String, Object> update(CarPartPO carPartPO);
	Map<String, Object> save(CarPartPO carPartPO);
	Map<String, Object> delete(Integer carPartPOId);
	Map<String, Object> search(Map<String, Object> map);
}
