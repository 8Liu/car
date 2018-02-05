package com.liudehuang.carPart.model.param;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class CarPartPO {
	private Integer id;
	@NotBlank
	private String name;
	@NotNull
	private Integer number;
	@NotBlank
	private String type;
	@NotNull
	private Double price;
	private Date createTime;
	@NotBlank
	private String person;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "CarPartPO [id=" + id + ", name=" + name + ", number=" + number + ", type=" + type + ", price=" + price
				+ ", createTime=" + createTime + ", person=" + person + "]";
	}
	
}
