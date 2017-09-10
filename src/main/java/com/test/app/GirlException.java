package com.test.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 廖师兄 2017-01-21 14:05
 */
public class GirlException extends RuntimeException {

	private Integer code;

	public GirlException(ResultEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
