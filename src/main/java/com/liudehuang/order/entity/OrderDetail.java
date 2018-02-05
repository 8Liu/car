package com.liudehuang.order.entity;

public class OrderDetail {
	 /** 主鍵，訂單明细表Id */
    private Integer id;
    /** 訂單Id */
    private String ordersId;
    /** 商品id */
    private String itemsId;
    /** 商品购买数量 */
    private Integer itemsNum;
    // 明细对应的商品信息
    private Items items;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(String ordersId) {
		this.ordersId = ordersId;
	}
	
	public String getItemsId() {
		return itemsId;
	}
	public void setItemsId(String itemsId) {
		this.itemsId = itemsId;
	}
	public Integer getItemsNum() {
		return itemsNum;
	}
	public void setItemsNum(Integer itemsNum) {
		this.itemsNum = itemsNum;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", ordersId=" + ordersId + ", itemsId=" + itemsId + ", itemsNum=" + itemsNum
				+ ", items=" + items + "]";
	}
	
	
}
