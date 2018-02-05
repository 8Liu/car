package com.liudehuang.saleActivity.model.param;

import org.hibernate.validator.constraints.NotBlank;
//car_type参数获取类
public class CarBO {
	private Integer carId;
	@NotBlank
	private String carBrand;
	@NotBlank
	private String carSeries;
	@NotBlank
	private String carType;
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarSeries() {
		return carSeries;
	}
	public void setCarSeries(String carSeries) {
		this.carSeries = carSeries;
	}
	
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	@Override
	public String toString() {
		return "CarBO [carId=" + carId + ", carBrand=" + carBrand + ", carSeries=" + carSeries + ", carType=" + carType
				+ "]";
	}
	
	
	
}
