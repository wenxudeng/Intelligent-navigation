package edu.hust.top.util;

/**
 * 统一整个项目中Ajax请求返回的结果，未来也可用于分布式架构中各个模块间调用时返回统一的类型
 * @author 23152
 *
 * @param <T>
 */

public class ResultEntity<T> {
	
	public static final String SUCCESS = "SUCCESS";
	public static final String FAILED = "FAILED";

	//用来封装当前请求处理的结果是成功还是失败
	private String result;
	
	//返回请求失败的错误信息
	private String message;
	
	//要返回的数据
	private T data;

	/**
	 * 请求处理成功且不需要返回数据的方法
	 * @return
	 */
	public static <Type> ResultEntity<Type> successWithoutData() {
		return new ResultEntity<Type>(SUCCESS, null, null);
	}
	
	/**
	 * 请求处理成功且需要返回数据的方法
	 * @return
	 */
	public static <Type> ResultEntity<Type> successWithData(Type data) {
		return new ResultEntity<Type>(SUCCESS, null, data);
	}
	
	/**
	 * 请求处理失败的方法
	 * @param msg 失败的错误信息
	 * @return
	 */
	public static <Type> ResultEntity<Type> failed(String message){
		return new ResultEntity<Type>(FAILED, message, null);
	}

	public ResultEntity() {
	}

	public ResultEntity(String result, String message, T data) {
		super();
		this.result = result;
		this.message = message;
		this.data = data;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResultEntity [result=" + result + ", message=" + message + ", data=" + data + "]";
	}
	
	
}
