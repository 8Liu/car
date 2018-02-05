package com.liudehuang.saleActivity.service;

import java.util.Map;

import com.liudehuang.saleActivity.model.CarTypeActivity;
import com.liudehuang.saleActivity.model.param.CarActivityBO;

public interface CarTypeActivityService {
	Map<String, Object> list();
	Map<String, Object> insertCarActivity(CarTypeActivity carTypeActivity);
	Map<String, Object> updateCarActivity(CarTypeActivity carTypeActivity);
	Map<String, Object> deleteCarActivity(CarTypeActivity carTypeActivity);
}
