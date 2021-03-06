package com.situ.ssm.entity;

import java.util.Date;

public class Student {
	private String name;
	private Integer age;
	private Date birthday;

	public Student() {
		super();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthday="
				+ birthday + "]";
	}

}
