package com.liudehuang.carPart.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liudehuang.carPart.dao.CarPartDao;
import com.liudehuang.carPart.model.CarPart;
import com.liudehuang.carPart.model.param.CarPartPO;
import com.liudehuang.carPart.service.CarPartService;
import com.liudehuang.carType.service.CarTypeService;
import com.liudehuang.common.MsgEnum;
import com.liudehuang.common.MsgTemplate;
@Service("carPartService")
public class CarPartServiceImpl implements CarPartService{
	@Autowired
	private CarPartDao carPartDao;
	public Map<String, Object> list() {
		List<CarPart> list = carPartDao.list();
		if(list.isEmpty()){
			return MsgTemplate.successMsg(null);
		}
		return MsgTemplate.successMsg(list);
	}
	
	public Map<String, Object> update(CarPartPO carPartPO) {
		int row = 0;
		row = carPartDao.update(carPartPO);
		if(row==1){
			return MsgTemplate.successMsg(MsgEnum.UPDATE_SUCCESS);
		}
		return MsgTemplate.failMessage(MsgEnum.UPDATE_FAILURE);
	}
	
	public Map<String, Object> save(CarPartPO carPartPO) {
		int row = 0;
		row = carPartDao.save(carPartPO);
		if(row==1){
			return MsgTemplate.successMsg(MsgEnum.INSERT_SUCCESS);
		}
		return MsgTemplate.failMessage(MsgEnum.INSERT_FAILURE);
	}
	
	public Map<String, Object> delete(Integer carPartPOId) {
		int row = 0;
		row = carPartDao.deleteById(carPartPOId);
		if(row == 1){
			return MsgTemplate.successMsg(MsgEnum.DELETE_SUCCESS);
		}
		return MsgTemplate.failMessage(MsgEnum.DELETE_FAILURE);
	}

	public Map<String, Object> search(Map<String, Object> map) {
		List<CarPart> list = carPartDao.list();
		return MsgTemplate.successMsg(list);
	}

}
