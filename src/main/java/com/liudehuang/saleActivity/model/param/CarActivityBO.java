package com.liudehuang.saleActivity.model.param;
//car_Type_activity参数获取类
public class CarActivityBO {
	private Integer carTypeId;
	private Integer carActivityId;
	private Integer carTypeActivityId;
	public CarActivityBO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCarTypeId() {
		return carTypeId;
	}
	public void setCarTypeId(Integer carTypeId) {
		this.carTypeId = carTypeId;
	}
	public Integer getCarActivityId() {
		return carActivityId;
	}
	public void setCarActivityId(Integer carActivityId) {
		this.carActivityId = carActivityId;
	}
	public Integer getCarTypeActivityId() {
		return carTypeActivityId;
	}
	public void setCarTypeActivityId(Integer carTypeActivityId) {
		this.carTypeActivityId = carTypeActivityId;
	}
	@Override
	public String toString() {
		return "CarTypeActivityBO [carTypeId=" + carTypeId + ", carActivityId=" + carActivityId + ", carTypeActivityId="
				+ carTypeActivityId + "]";
	}
	
}
