package com.liudehuang.saleActivity.model.param;

import java.util.Date;
//car_activity 参数获取类
public class ActivityBO {
	private Integer carActivityId;
	private String activityName;
	private Double activityPrice;
	private Date startime;
	private Date endTime;
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
		return "ActivityBO [carActivityId=" + carActivityId + ", activityName=" + activityName + ", activityPrice="
				+ activityPrice + ", startime=" + startime + ", endTime=" + endTime + "]";
	}
	
}
