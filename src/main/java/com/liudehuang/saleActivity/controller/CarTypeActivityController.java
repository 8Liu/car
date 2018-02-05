package com.liudehuang.saleActivity.controller;

import java.util.Map;

import javax.validation.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.baidu.unbiz.fluentvalidator.jsr303.HibernateSupportedValidator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.liudehuang.carType.model.CarType;
import com.liudehuang.common.MsgTemplate;
import com.liudehuang.saleActivity.model.CarTypeActivity;
import com.liudehuang.saleActivity.service.CarTypeActivityService;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@RestController
@RequestMapping("/carTypeActivity")
public class CarTypeActivityController {
	@Autowired
	private CarTypeActivityService carTypeActivityService;
	private Gson gson = new GsonBuilder().serializeNulls().create();
	@RequestMapping(value="/list.do",method = RequestMethod.POST)
	public Map<String, Object> list(){
		Map<String, Object> map = carTypeActivityService.list();
		return map;
	}
	
	@RequestMapping(value="/save.do", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody String json){
		CarTypeActivity carTypeActivity = gson.fromJson(json, CarTypeActivity.class);
		ComplexResult ret = FluentValidator.checkAll().failFast()
                .on(carTypeActivity,
                new HibernateSupportedValidator<CarTypeActivity>()
                .setHiberanteValidator(Validation.buildDefaultValidatorFactory().getValidator()))
                .doValidate().result(ResultCollectors.toComplex());
        if(!ret.isSuccess()){
        	return MsgTemplate.failureMsg(ret);
        }
		return carTypeActivityService.insertCarActivity(carTypeActivity);
	}
	
	@RequestMapping(value="/update.do", method = RequestMethod.POST)
	public Map<String, Object> update(@RequestBody String json){
		CarTypeActivity carTypeActivity = gson.fromJson(json, CarTypeActivity.class);
		ComplexResult ret = FluentValidator.checkAll().failFast()
                .on(carTypeActivity,
                new HibernateSupportedValidator<CarTypeActivity>()
                .setHiberanteValidator(Validation.buildDefaultValidatorFactory().getValidator()))
                .doValidate().result(ResultCollectors.toComplex());
        if(!ret.isSuccess()){
        	return MsgTemplate.failureMsg(ret);
        }
		return carTypeActivityService.updateCarActivity(carTypeActivity);
	}
	
	@RequestMapping(value="/delete.do", method = RequestMethod.POST)
	public Map<String, Object> delete(@RequestBody String json){
		CarTypeActivity carTypeActivity = gson.fromJson(json, CarTypeActivity.class);
		ComplexResult ret = FluentValidator.checkAll().failFast()
                .on(carTypeActivity,
                new HibernateSupportedValidator<CarTypeActivity>()
                .setHiberanteValidator(Validation.buildDefaultValidatorFactory().getValidator()))
                .doValidate().result(ResultCollectors.toComplex());
        if(!ret.isSuccess()){
        	return MsgTemplate.failureMsg(ret);
        }
        return carTypeActivityService.deleteCarActivity(carTypeActivity);
	}
}
