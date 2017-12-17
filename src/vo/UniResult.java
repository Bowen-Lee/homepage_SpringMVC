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
