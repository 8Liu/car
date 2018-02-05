package com.liudehuang.carPart.controller;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.liudehuang.carPart.model.param.CarPartPO;

public class GsonTest {

	public static void main(String[] args) {
		Gson gson = new GsonBuilder().serializeNulls().create();
		CarPartPO carpart = new CarPartPO();
		carpart.setCreateTime(new Date());
		carpart.setName("蓄电池");
		carpart.setId(2);
		carpart.setNumber(500);
		carpart.setPrice(0.035);
		carpart.setPerson("刘伟");
		carpart.setType("本田");
		String json = gson.toJson(carpart);
		System.out.println(json);
	}

}
