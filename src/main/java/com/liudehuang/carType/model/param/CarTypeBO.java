package com.liudehuang.carType.model.param;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

public class CarTypeBO {
	@NotNull
	private Integer id;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CarTypeBO [id=" + id + "]";
	}
	
}
