package vo;

import org.springframework.stereotype.Component;

/**
 * @author usky_Bowen
 */
@Component
public class UniResult<T> {

	public static Integer STATUS_OK = 200;
	public static Integer STATUS_ERROR = 500;

	public static String MESSAGE_OK = "message.result.ok";
	public static String MESSAGE_ERROR = "message.result.error";

	// @ApiModelProperty(value = "业务状态", name = "status")
	private Integer status;

	// @ApiModelProperty(value = "业务异常代码", name = "code")
	private String code;

	// @ApiModelProperty(value = "响应消息", name = "msg")
	private String msg;

	// @ApiModelProperty(value = "结果数据", name = "data")
	private T data;

	public UniResult() {
	}

	/**
	 * ok(通过结果数据，创建一个成功的通用返回结果)
	 * 
	 * @param data
	 * @return
	 */
	@SuppressWarnings("hiding")
	public <T> UniResult<T> ok(T data) {
		UniResult<T> result = new UniResult<T>(UniResult.STATUS_OK, UniResult.MESSAGE_OK, data);

		return result;
	}

	/**
	 * ok(创建一个成功的通用返回结果)
	 * 
	 * @return
	 */
	public UniResult<Object> ok() {
		UniResult<Object> result = new UniResult<Object>(UniResult.STATUS_OK, UniResult.MESSAGE_OK, null);

		return result;
	}

	/**
	 * error(创建一个失败的通用返回结果)
	 * 
	 * @return
	 */
	public UniResult<Object> error() {
		UniResult<Object> result = new UniResult<Object>(UniResult.STATUS_ERROR, UniResult.MESSAGE_ERROR, null);
		return result;
	}

	public UniResult<Object> error(String errorCode, String messagekey) {
		UniResult<Object> result = new UniResult<Object>(UniResult.STATUS_ERROR, errorCode, messagekey, null);
		return result;
	}

	/**
	 * error(指定结果信息，创建一个失败的通用返回结果)
	 * 
	 * @param msg
	 *            结果信息，使用message key能够进行国际化处理
	 * @return
	 */
	public UniResult<Object> error(String messagekey) {
		UniResult<Object> result = new UniResult<Object>(UniResult.STATUS_ERROR, messagekey, null);
		return result;
	}

	/**
	 * build(指定结果状态、结果信息，创建一个失败的通用返回结果)
	 * 
	 * @param status
	 * @param msg
	 *            结果信息，使用message key能够进行国际化处理
	 * @return
	 */
	public UniResult<Object> build(Integer status, String message) {
		UniResult<Object> result = new UniResult<Object>(status, message, null);

		return result;
	}

	public UniResult(Integer status) {
		this.status = status;
	}

	public UniResult(Integer status, String msg, T data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public UniResult(Integer status, String code, String msg, T data) {
		this.status = status;
		this.msg = msg;
		this.code = code;
		this.data = data;
	}

	public UniResult(T data) {
		this.status = STATUS_OK;
		this.msg = MESSAGE_OK;
		this.data = data;
	}

	public UniResult(T data, String msg) {
		this.status = STATUS_OK;
		this.msg = msg;
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
