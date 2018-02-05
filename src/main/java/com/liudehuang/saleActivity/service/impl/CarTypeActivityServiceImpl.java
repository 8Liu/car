package com.liudehuang.saleActivity.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liudehuang.carType.service.CarTypeService;
import com.liudehuang.common.MsgEnum;
import com.liudehuang.common.MsgTemplate;
import com.liudehuang.saleActivity.dao.CarTypeActivityDao;
import com.liudehuang.saleActivity.model.CarTypeActivity;
import com.liudehuang.saleActivity.model.param.CarActivityBO;
import com.liudehuang.saleActivity.model.param.CarBO;
import com.liudehuang.saleActivity.model.param.ActivityBO;
import com.liudehuang.saleActivity.service.CarTypeActivityService;
@Service("carTypeActivityService")
public class CarTypeActivityServiceImpl implements CarTypeActivityService{
	@Autowired
	private CarTypeActivityDao carTypeActivityDao;
	public Map<String, Object> list() {
		List<CarTypeActivity> list = carTypeActivityDao.list();
		return MsgTemplate.successMsg(list);
	}
	
	public Map<String, Object> insertCarActivity(CarTypeActivity carTypeActivity) {
		CarBO carBO = new CarBO();
		BeanUtils.copyProperties(carTypeActivity, carBO);
		//先查找出car_type_id
		CarBO car = carTypeActivityDao.findCarTypeId(carBO);
		//在获取car_activity_id
		ActivityBO activityBO = new ActivityBO();
		BeanUtils.copyProperties(carTypeActivity, activityBO);
		carTypeActivityDao.saveActivity(activityBO);
		//插入活动表
		CarActivityBO carActivityBO = new CarActivityBO();
		carActivityBO.setCarActivityId(activityBO.getCarActivityId());
		carActivityBO.setCarTypeId(car.getCarId());
		carTypeActivityDao.insertCarActivity(carActivityBO);
		return MsgTemplate.successMsg(MsgEnum.INSERT_SUCCESS);
	}
	
	public Map<String, Object> updateCarActivity(CarTypeActivity carTypeActivity) {
		CarBO carBO = new CarBO();
		BeanUtils.copyProperties(carTypeActivity, carBO);
		CarBO carTypeSaleBO = carTypeActivityDao.findCarTypeId(carBO);
		ActivityBO activityBO = new ActivityBO();
		BeanUtils.copyProperties(carTypeActivity, activityBO);
		carTypeActivityDao.updateActivity(activityBO);
		CarActivityBO carActivityBO = new CarActivityBO();
		carActivityBO.setCarActivityId(activityBO.getCarActivityId());
		carActivityBO.setCarTypeId(carBO.getCarId());
		carTypeActivityDao.updateCarActivity(carActivityBO);
		
		return MsgTemplate.successMsg(MsgEnum.UPDATE_SUCCESS);
	}
	
	
	public Map<String, Object> deleteCarActivity(CarTypeActivity carTypeActivity) {
		CarActivityBO carActivityBO = new CarActivityBO();
		BeanUtils.copyProperties(carTypeActivity, carActivityBO);
		int row = carTypeActivityDao.deleteActivity(carActivityBO.getCarActivityId());
		int col = carTypeActivityDao.deleteCarActivity(carActivityBO.getCarTypeActivityId());
		if((row+col)==2){
			return MsgTemplate.successMsg(MsgEnum.DELETE_SUCCESS);
		}
		return MsgTemplate.failMessage(MsgEnum.DELETE_FAILURE);
	}

}
