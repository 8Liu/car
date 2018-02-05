package com.liudehuang.carType.controller;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Test {
	public static void main(String[] args) {
		String json = "{\"time2\":\"Jan 30, 2018 4:16:50 PM\",\"lowPrice\":30,\"person\":\"高\",\"name\":\"奥迪\",\"highPrice\":33.0,\"time\":\"Jan 2, 2018 6:56:00 PM\",\"brand\":\"奥迪\"}";
		Gson gson = new Gson();
		Map<String,Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
		System.out.println(map);
	}
}
