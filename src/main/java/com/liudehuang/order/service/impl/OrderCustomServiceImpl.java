package com.liudehuang.order.service.impl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liudehuang.common.MsgEnum;
import com.liudehuang.common.MsgTemplate;
import com.liudehuang.order.dao.OrderCustomDao;
import com.liudehuang.order.entity.OrderCustom;
import com.liudehuang.order.entity.OrderDetail;
import com.liudehuang.order.entity.Orders;
import com.liudehuang.order.entity.User;
import com.liudehuang.order.service.OrderCustomService;
@Service("orderCustomService")
public class OrderCustomServiceImpl implements OrderCustomService{
	@Autowired
	private OrderCustomDao orderCustomDao;
	public Map<String, Object> findOrderUser() {
		List<Orders> list = orderCustomDao.findOrderUser();
		return MsgTemplate.successMsg(list);
	}
	public Map<String, Object> insertOrderUser(Orders orders) {
		User user = new User();
		user = orders.getUser();
		String relativeid = UUID.randomUUID().toString();
		user.setRelativeid(relativeid);
		orders.setRelativeid(relativeid);
		int row = orderCustomDao.insertOrder(orders);
		int col = orderCustomDao.insertUser(user);
		if((row+col)!=2){
			return MsgTemplate.successMsg(MsgEnum.INSERT_FAILURE);
		}
		return MsgTemplate.successMsg(MsgEnum.INSERT_SUCCESS);
	}
	public Map<String, Object> findOrdersAndOrderDetail() {
		List<OrderDetail> list = orderCustomDao.findOrdersAndOrderDetail();
		return MsgTemplate.successMsg(list);
	}
	public Map<String, Object> insertOrdersAndOrderDetail(Orders orders) {
		User user = new User();
		user = orders.getUser();
		int row0 = orderCustomDao.insertUser(user);
		String ordersId = UUID.randomUUID().toString();
		orders.setOrdersid(ordersId);
		int row1 = orderCustomDao.insertOrder(orders);
		List<OrderDetail> list = orders.getOrderdetails();
		int row2 = 0;
		for(OrderDetail orderDetail:list){
			orderDetail.setOrdersId(ordersId);
			row2 = orderCustomDao.insertOrderDetail(orderDetail);
		}
		if(row1==1&&row0==1&&row2==list.size()){
			return MsgTemplate.successMsg(MsgEnum.INSERT_SUCCESS);
		}
		return MsgTemplate.successMsg(MsgEnum.INSERT_SUCCESS);
	}
	public Map<String, Object> findUserAndItemsResultMap() {
		List<User> list = orderCustomDao.findUserAndItemsResultMap();
		return MsgTemplate.successMsg(list);
	}

}
