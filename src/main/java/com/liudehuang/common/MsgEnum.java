package com.liudehuang.common;

public enum MsgEnum implements MsgInterface{
	OPS_SUCCESS(10001,"操作成功"),
	OPS_FAILURE(10002, "操作失败"),
	INSERT_SUCCESS(10003,"插入数据成功"),
	INSERT_FAILURE(10004,"插入数据失败"),
	UPDATE_SUCCESS(10005,"更新数据成功"),
	UPDATE_FAILURE(10006,"更新数据失败"),
	DELETE_SUCCESS(10007,"删除数据成功"),
	DELETE_FAILURE(10008,"删除数据失败")
	;
	MsgEnum(int code,String message){
		this.code = code;
		this.message = message;
	}
	private int code;
	private String message;
	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	
}
