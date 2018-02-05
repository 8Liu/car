package com.liudehuang.carType.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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
import com.liudehuang.carType.model.CarType;
import com.liudehuang.carType.model.param.CarTypeBO;
import com.liudehuang.carType.model.param.CarTypePO;
import com.liudehuang.carType.service.CarTypeService;
import com.liudehuang.common.MsgTemplate;
@RestController
@RequestMapping("/carType")
public class CarTypeController {
	@Autowired
	private CarTypeService carTypeService;
	private Gson gson = new GsonBuilder().serializeNulls().create();
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Map<String,Object> list(){
		return carTypeService.list();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Map<String, Object> update(@RequestBody(required = false) String json) throws UnsupportedEncodingException{
		
		CarType carType = gson.fromJson(json, CarType.class);
		ComplexResult ret = FluentValidator.checkAll().failFast()
                .on(carType,
                new HibernateSupportedValidator<CarType>()
                .setHiberanteValidator(Validation.buildDefaultValidatorFactory().getValidator()))
                .doValidate().result(ResultCollectors.toComplex());
        if(!ret.isSuccess()){
        	return MsgTemplate.failureMsg(ret);
        }
		return carTypeService.update(carType);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Map<String,Object> save(@RequestBody(required = false) String json){
		CarType carType = gson.fromJson(json, CarType.class);
		 // 参数校验
        ComplexResult ret = FluentValidator.checkAll().failFast()
                .on(carType,
                new HibernateSupportedValidator<CarType>()
                .setHiberanteValidator(Validation.buildDefaultValidatorFactory().getValidator()))
                .doValidate().result(ResultCollectors.toComplex());
        if(!ret.isSuccess()){
        	return MsgTemplate.failureMsg(ret);
        }
		return carTypeService.save(carType);
	
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Map<String,Object> deleteById(@RequestBody(required = false) String json){
		CarTypeBO carTypeBO = gson.fromJson(json, CarTypeBO.class);
		 // 参数校验
       ComplexResult ret = FluentValidator.checkAll().failFast()
               .on(carTypeBO,
               new HibernateSupportedValidator<CarTypeBO>()
               .setHiberanteValidator(Validation.buildDefaultValidatorFactory().getValidator()))
               .doValidate().result(ResultCollectors.toComplex());
       if(!ret.isSuccess()){
       	return MsgTemplate.failureMsg(ret);
       }
       return carTypeService.deleteById(carTypeBO.getId());
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public Map<String, Object> search(@RequestBody(required = false) String json){
		Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
		return carTypeService.search(map);
	}
}
