package com.liudehuang.cartype;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;
import com.liudehuang.carType.dao.CarTypeDao;
import com.liudehuang.carType.service.CarTypeService;

public class CarTypeServiceTest {
	private ApplicationContext ac = new ClassPathXmlApplicationContext("config/spring-*.xml");
	private CarTypeService carTypeService = ac.getBean("carTypeService",CarTypeService.class);
	@Test
	public void test() throws ParseException{
		Map<String,Object> map = new HashMap<String, Object>(7);
		map.put("name", "奥迪");
		map.put("person", "高");
		map.put("lowPrice", 30);
		map.put("highPrice", 33.0);
		map.put("brand", "奥迪");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = sdf.parse("2018-01-02 18:56:00");
		Date date2 = sdf.parse("2018-01-30 16:16:50");
		map.put("time", date);
		map.put("time2", date2);
		Map<String, Object> map1 = carTypeService.search(map);
		System.out.println(map1);
		Gson gson = new Gson();
		String json = gson.toJson(map);
		System.out.println(json);
	}
}
