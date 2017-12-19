package vo;

/**
 * @author usky_Bowen
 */
public class UniResult<T> {
	// @ApiModelProperty(value = "业务状态", name = "status")
	private boolean status;

	// @ApiModelProperty(value = "业务异常代码", name = "code")
	private String code;

	// @ApiModelProperty(value = "响应消息", name = "msg")
	private String msg;

	// @ApiModelProperty(value = "结果数据", name = "data")
	private T data;

	public UniResult(boolean status, String code, String msg, T data) {
		super();
		this.status = status;
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
}
