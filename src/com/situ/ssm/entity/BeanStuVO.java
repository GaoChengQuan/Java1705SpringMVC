package com.situ.ssm.entity;

import java.util.List;

public class BeanStuVO {
	private List<Student> list;

	public BeanStuVO() {
		super();
	}

	public BeanStuVO(List<Student> list) {
		super();
		this.list = list;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

}
