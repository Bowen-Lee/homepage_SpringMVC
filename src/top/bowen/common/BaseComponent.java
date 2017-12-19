package top.bowen.common;

import org.springframework.stereotype.Service;

import vo.UniResult;

@Service
public class BaseComponent {
	
	public BaseComponent() {
		super();
	}

	/**
	 * ok(通过结果数据，创建一个成功的通用返回结果)
	 * 
	 * @param data
	 * @return
	 */
	public <T> UniResult<T> ok(T data) {
		UniResult<T> result = new UniResult<T>(true,null, "success", data);
		return result;
	}

	/**
	 * ok(创建一个成功的通用返回结果)
	 * 
	 * @return
	 */
	public <T> UniResult<T> ok() {
		UniResult<T> result = new UniResult<T>(true,null, "success", null);
		return result;
	}

	/**
	 * error(创建一个失败的通用返回结果)
	 * 
	 * @return
	 */
	public <T> UniResult<T> error() {
		UniResult<T> result = new UniResult<T>(false,null, "fail", null);
		return result;
	}

	public <T> UniResult<T> error(String errorCode, String messagekey) {
		UniResult<T> result = new UniResult<T>(true,errorCode, messagekey, null);
		return result;
	}

	/**
	 * error(指定结果信息，创建一个失败的通用返回结果)
	 * 
	 * @param msg
	 *            结果信息，使用message key能够进行国际化处理
	 * @return
	 */
	public <T> UniResult<T> error(String messagekey) {
		UniResult<T> result = new UniResult<T>(false,null, messagekey, null);
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
	public <T> UniResult<T> build(Boolean status, String message) {
		UniResult<T> result = new UniResult<T>(status,null, message, null);
		return result;
	}

}
