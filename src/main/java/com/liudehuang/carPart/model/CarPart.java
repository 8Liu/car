package com.liudehuang.carPart.model;

import java.util.Date;

public class CarPart {
	private Integer id;
	private String name;
	private Integer number;
	private Double price;
	private String person;
	private String type;
	private Date createTime;
	public CarPart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarPart(Integer id, String name, Integer number, Double price, String person, String type, Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.price = price;
		this.person = person;
		this.type = type;
		this.createTime = createTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "CarPart [id=" + id + ", name=" + name + ", number=" + number + ", price=" + price + ", person=" + person
				+ ", type=" + type + ", createTime=" + createTime + "]";
	}
	
	
}
