package com.test.spring_boot_hello;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class JsonDemo {
	private long id;// 主键.
	private String name;// 测试名称.

	@JSONField(format = "yyyy-mm-dd HH:mm")
	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
