package com.github.bokire.auth.common.mvc;

/**
 * 
 *  
 * @Description: SpringMVC统一返回对象   
 * @author: bokire    
 * @date:   2019年3月4日 下午4:35:28   
 * @version V1.0.0 
 *
 */
public class ResponseMessage<T> {

	private long code = -1L;
	
	private boolean success = false;
	
	private T data;
	
	private String message;

	private long time = System.currentTimeMillis();
	
	public ResponseMessage() {
	}
	
	public ResponseMessage(long code, boolean success, T data, String message) {
		this.code = code;
		this.success = success;
		this.data = data;
		this.message = message;
	}
	
	public static <T> ResponseMessage<T> success(T data) {
		return new ResponseMessage<T>(0l, true, data, null);
	}
	
	public static <T> ResponseMessage<T> fail(T data) {
		return fail(-1, data, null);
	}
	
	public static <T> ResponseMessage<T> fail(String message) {
		return fail(-1, null, message);
	}
	
	public static <T> ResponseMessage<T> fail(long code, T data, String message) {
		return new ResponseMessage<T>(-1l, false, null, message);
	}
	

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	
	
	
}
