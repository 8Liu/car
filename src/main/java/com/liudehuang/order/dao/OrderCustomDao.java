package com.liudehuang.order.dao;

import java.util.List;

import com.liudehuang.order.entity.OrderDetail;
import com.liudehuang.order.entity.Orders;
import com.liudehuang.order.entity.User;

public interface OrderCustomDao {
	List<Orders> findOrderUser();
	int insertUser(User user);
	int insertOrder(Orders orders);
	List<OrderDetail> findOrdersAndOrderDetail();
	int insertOrderDetail(OrderDetail OrderDetail);
	List<User> findUserAndItemsResultMap();
}
