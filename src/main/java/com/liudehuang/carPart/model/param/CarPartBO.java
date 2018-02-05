package com.liudehuang.carPart.model.param;

import javax.validation.constraints.NotNull;

public class CarPartBO {
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
		return "CarPartBO [id=" + id + "]";
	}
	
}
