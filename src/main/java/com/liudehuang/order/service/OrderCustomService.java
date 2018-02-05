package com.liudehuang.order.service;

import java.util.Map;

import com.liudehuang.order.entity.OrderCustom;
import com.liudehuang.order.entity.OrderDetail;
import com.liudehuang.order.entity.Orders;

public interface OrderCustomService {
	Map<String, Object> findOrderUser();
	Map<String, Object> insertOrderUser(Orders orders);
	Map<String, Object> findOrdersAndOrderDetail();
	Map<String, Object> insertOrdersAndOrderDetail(Orders orders);
	Map<String, Object> findUserAndItemsResultMap();
}
