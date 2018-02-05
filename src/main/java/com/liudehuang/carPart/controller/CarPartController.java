package com.liudehuang.carPart.controller;

import java.util.Map;

import javax.validation.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.baidu.unbiz.fluentvalidator.jsr303.HibernateSupportedValidator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.liudehuang.carPart.model.param.CarPartBO;
import com.liudehuang.carPart.model.param.CarPartPO;
import com.liudehuang.carPart.service.CarPartService;
import com.liudehuang.carType.model.param.CarTypePO;
import com.liudehuang.common.MsgTemplate;

@RestController
@RequestMapping("/carpart")
public class CarPartController {
	@Autowired
	private CarPartService carPartService;
	private Gson gson = new GsonBuilder().serializeNulls().create();
	@RequestMapping(value="/list",method=RequestMethod.POST)
	public Map<String,Object> list(){
		return carPartService.list();
	}
	
	@RequestMapping(value="/update",method = RequestMethod.POST)
	public Map<String, Object> update(@RequestBody(required=false) String json){
		CarPartPO carPartPO = gson.fromJson(json, CarPartPO.class);
		ComplexResult ret = FluentValidator.checkAll().failFast()
	                .on(carPartPO,
	                new HibernateSupportedValidator<CarPartPO>()
	                .setHiberanteValidator(Validation.buildDefaultValidatorFactory().getValidator()))
	                .doValidate().result(ResultCollectors.toComplex());
	    if(!ret.isSuccess()){
	        return MsgTemplate.failureMsg(ret);
	    }
	    return carPartService.update(carPartPO);
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public Map<String,Object> save(@RequestBody(required=false) String json){
		CarPartPO carPartPO = gson.fromJson(json, CarPartPO.class);
		ComplexResult ret = FluentValidator.checkAll().failFast()
	                .on(carPartPO,
	                new HibernateSupportedValidator<CarPartPO>()
	                .setHiberanteValidator(Validation.buildDefaultValidatorFactory().getValidator()))
	                .doValidate().result(ResultCollectors.toComplex());
	    if(!ret.isSuccess()){
	        return MsgTemplate.failureMsg(ret);
	    }
	    return carPartService.save(carPartPO);
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public Map<String, Object> delete(@RequestBody(required=false) String json){
		CarPartBO carPartBO = gson.fromJson(json, CarPartBO.class);
		ComplexResult ret = FluentValidator.checkAll().failFast()
	                .on(carPartBO,
	                new HibernateSupportedValidator<CarPartBO>()
	                .setHiberanteValidator(Validation.buildDefaultValidatorFactory().getValidator()))
	                .doValidate().result(ResultCollectors.toComplex());
	    if(!ret.isSuccess()){
	        return MsgTemplate.failureMsg(ret);
	    }
		return carPartService.delete(carPartBO.getId());
	}
	
	@RequestMapping(value="/search",method = RequestMethod.POST)
	public Map<String, Object> search(@RequestBody(required=false) String json){
		Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
		return carPartService.search(map);
	}
}
