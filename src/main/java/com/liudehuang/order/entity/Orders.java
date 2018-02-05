package com.liudehuang.order.entity;

import java.util.Date;
import java.util.List;

public class Orders {
	/** 主键订单Id */
    protected Integer id;
    /** 下单用户id */
    protected Integer userid;
    /** 订单号 */
    protected String number;
    /** 创建订单时间 */
    protected Date createTime;
    /** 备注 */
    protected String note;
    /*关联用户id*/
    protected String relativeid;
    /*关联orderDetail的id*/
    protected String ordersid;
    // 用户信息
    protected User user;
    // 订单明细
    protected List<OrderDetail> orderdetails;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<OrderDetail> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(List<OrderDetail> orderdetails) {
		this.orderdetails = orderdetails;
	}
	
	public String getRelativeid() {
		return relativeid;
	}
	public void setRelativeid(String relativeid) {
		this.relativeid = relativeid;
	}
	
	public String getOrdersid() {
		return ordersid;
	}
	public void setOrdersid(String ordersid) {
		this.ordersid = ordersid;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", userid=" + userid + ", number=" + number + ", createTime=" + createTime
				+ ", note=" + note + ", relativeid=" + relativeid + ", ordersid=" + ordersid + ", user=" + user
				+ ", orderdetails=" + orderdetails + "]";
	}
	
	
}
