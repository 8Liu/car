package com.liudehuang.common;

import java.util.HashMap;
import java.util.Map;

import com.baidu.unbiz.fluentvalidator.ComplexResult;

public class MsgTemplate {
	public static Map<String, Object> failMessage(MsgInterface msg){
		return customMsg(false, msg.getCode(), msg.getMessage(), null);
	}
	public static Map<String, Object> customMsg(boolean success,int code,String message,Object data){
		Map<String, Object> map = new HashMap<String, Object>(4);
		map.put("success", success);
		map.put("code", code);
		map.put("message", message);
		map.put("data", data);
		return map;
	}
	public static Map<String, Object> successMsg(boolean success,int code,String message,Object data){
		return customMsg(true, code, message, data);
	}
	
	public static Map<String, Object> successMsg(Object data){
		return customMsg(true, 10000, "", data);
	}
	
	public static Map<String, Object> successMsg(MsgInterface msg){
		return customMsg(true, msg.getCode(), msg.getMessage(), null);
	}
	
	public static Map<String, Object> failureMsg(ComplexResult ret) {
        if(ret.getErrors().size() > 0){

            return customMsg(false,
                    ret.getErrors().get(0).getErrorCode() > 0 ?  ret.getErrors().get(0).getErrorCode() : 10000,
                    ret.getErrors().get(0).getErrorMsg() + "，错误字段："+ret.getErrors().get(0).getField(), null);
        }
        return customMsg(false, 10001, null, null);
    }
}
