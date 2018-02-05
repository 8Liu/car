package com.liudehuang.saleActivity.model;

import java.util.Date;


public class CarTypeActivity {
	private Integer carTypeActivityId;
	private Integer carTypeId;
	private Integer carActivityId;
	private String carName;
	private String carBrand;
	private String carSeries;
	private String carType;
	private String activityName;
	private Double carPrice;
	private Double activityPrice;
	private Date startime;
	private Date endTime;
	
	public CarTypeActivity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
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


	public Integer getCarTypeActivityId() {
		return carTypeActivityId;
	}


	public void setCarTypeActivityId(Integer carTypeActivityId) {
		this.carTypeActivityId = carTypeActivityId;
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


	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}
	public Double getActivityPrice() {
		return activityPrice;
	}
	public void setActivityPrice(Double activityPrice) {
		this.activityPrice = activityPrice;
	}
	public Date getStartime() {
		return startime;
	}
	public void setStartime(Date startime) {
		this.startime = startime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	@Override
	public String toString() {
		return "CarTypeActivity [carActivtyId=" + carTypeActivityId + ", carTypeId=" + carTypeId + ", carActivityId="
				+ carActivityId + ", carName=" + carName + ", carBrand=" + carBrand + ", carSeries=" + carSeries
				+ ", carType=" + carType + ", activityName=" + activityName + ", carPrice=" + carPrice
				+ ", activityPrice=" + activityPrice + ", startime=" + startime + ", endTime=" + endTime + "]";
	}


	
	
}
