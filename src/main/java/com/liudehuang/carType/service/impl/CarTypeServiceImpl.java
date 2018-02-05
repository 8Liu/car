package com.liudehuang.carType.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liudehuang.carType.dao.CarTypeDao;
import com.liudehuang.carType.model.CarType;
import com.liudehuang.carType.model.param.CarTypePO;
import com.liudehuang.carType.service.CarTypeService;
import com.liudehuang.common.MsgEnum;
import com.liudehuang.common.MsgTemplate;
@Service("carTypeService")
public class CarTypeServiceImpl implements CarTypeService{
	@Autowired
	private CarTypeDao carTypeDao;
	public Map<String, Object> list() {
		List<CarType> list = carTypeDao.list();
		if(list.isEmpty()){
			return MsgTemplate.successMsg(null);
		}
		return MsgTemplate.successMsg(list);
	}
	
	public Map<String, Object> update(CarType carType) {
		int row = 0;
		row = carTypeDao.update(carType);
		if(row==1){
			return MsgTemplate.successMsg(MsgEnum.UPDATE_SUCCESS);
		}
		return MsgTemplate.failMessage(MsgEnum.UPDATE_FAILURE);
	}
	
	public Map<String, Object> save(CarType carType){
		int row = 0;
		row = carTypeDao.save(carType);
		if(row==1){
			return MsgTemplate.successMsg(MsgEnum.INSERT_SUCCESS);
		}
		return MsgTemplate.failMessage(MsgEnum.INSERT_FAILURE);
	}

	public Map<String, Object> deleteById(Integer carTypeBOId) {
		int row = 0;
		row = carTypeDao.deleteById(carTypeBOId);
		if(row==1){
			return MsgTemplate.successMsg(MsgEnum.DELETE_SUCCESS);
		}
		return MsgTemplate.failMessage(MsgEnum.DELETE_FAILURE);
	}

	public Map<String, Object> search(Map<String, Object> map) {
		List<CarType> list = carTypeDao.search(map);
		return MsgTemplate.successMsg(list);
				
	}
	
}
