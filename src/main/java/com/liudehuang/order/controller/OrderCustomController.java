package com.liudehuang.order.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.liudehuang.order.entity.OrderCustom;
import com.liudehuang.order.entity.OrderDetail;
import com.liudehuang.order.entity.Orders;
import com.liudehuang.order.entity.User;
import com.liudehuang.order.service.OrderCustomService;

@RestController
@RequestMapping("/order")
public class OrderCustomController {
	@Autowired
	private OrderCustomService orderCustomService;
	private Gson gson = new GsonBuilder().serializeNulls().create();
	@RequestMapping(value="/list",method = RequestMethod.POST)
	public Map<String, Object> findOrderUser(@RequestBody String json){
		Orders orders = gson.fromJson(json, Orders.class);
		
		return orderCustomService.findOrderUser();
		
	}
	
	@RequestMapping(value="/insert", method = RequestMethod.POST)
	public Map<String, Object> insertOrderUser(@RequestBody String json){
		System.out.println("json"+json);
		Orders orders = gson.fromJson(json, Orders.class);
		System.out.println(orders);
		return orderCustomService.insertOrderUser(orders);
		
	}
	
	@RequestMapping(value="listOrderDetail", method = RequestMethod.POST)
	public Map<String, Object> findOrdersAndOrderDetail(@RequestBody String json){
		System.out.println("json:"+json);
		OrderDetail orderDetail = gson.fromJson(json, OrderDetail.class);
		System.out.println(orderDetail);
		return orderCustomService.findOrdersAndOrderDetail();
	}
	
	@RequestMapping(value="insertOrderDetail", method = RequestMethod.POST)
	public Map<String, Object> insertOrdersAndOrderDetail(@RequestBody String json){
		System.out.println("json:"+json);
		Orders orders = gson.fromJson(json, Orders.class);
		System.out.println(orders);
		return orderCustomService.insertOrdersAndOrderDetail(orders);
	}
	
	@RequestMapping(value="listUser", method = RequestMethod.POST)
	public Map<String, Object> findUserAndItemsResultMap(@RequestBody String json){
		System.out.println("json:"+json);
		User user = gson.fromJson(json, User.class);
		return orderCustomService.findUserAndItemsResultMap();
	}
}
