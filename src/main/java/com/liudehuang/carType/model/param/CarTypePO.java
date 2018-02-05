package com.liudehuang.carType.model.param;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class CarTypePO {
	private Integer car_type_id;
	@NotBlank
	private String car_type_name;
	@NotNull
	private Double car_type_price;
	private Date car_type_createtime;
	@NotBlank
	private String car_type_person;
	@NotNull
	private Integer car_type_number;
	private String car_type_brand;
	public CarTypePO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getCar_type_id() {
		return car_type_id;
	}


	public void setCar_type_id(Integer car_type_id) {
		this.car_type_id = car_type_id;
	}


	public String getCar_type_name() {
		return car_type_name;
	}
	public void setCar_type_name(String car_type_name) {
		this.car_type_name = car_type_name;
	}
	public Double getCar_type_price() {
		return car_type_price;
	}
	public void setCar_type_price(Double car_type_price) {
		this.car_type_price = car_type_price;
	}
	public Date getCar_type_createtime() {
		return car_type_createtime;
	}
	public void setCar_type_createtime(Date car_type_createtime) {
		this.car_type_createtime = car_type_createtime;
	}
	public String getCar_type_person() {
		return car_type_person;
	}
	public void setCar_type_person(String car_type_person) {
		this.car_type_person = car_type_person;
	}
	public Integer getCar_type_number() {
		return car_type_number;
	}
	public void setCar_type_number(Integer car_type_number) {
		this.car_type_number = car_type_number;
	}
	public String getCar_type_brand() {
		return car_type_brand;
	}
	public void setCar_type_brand(String car_type_brand) {
		this.car_type_brand = car_type_brand;
	}


	@Override
	public String toString() {
		return "CarTypePO [car_type_id=" + car_type_id + ", car_type_name=" + car_type_name + ", car_type_price="
				+ car_type_price + ", car_type_createtime=" + car_type_createtime + ", car_type_person="
				+ car_type_person + ", car_type_number=" + car_type_number + ", car_type_brand=" + car_type_brand + "]";
	}
	
}
