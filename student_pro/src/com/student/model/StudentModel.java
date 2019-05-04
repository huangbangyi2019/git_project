package com.student.model;

public class StudentModel {

	private int id; // ID
	private String username; // 用户名
	private String password; // 密码
	private int sex; // 性别
	private String love; // 爱好
	
	public StudentModel(int id, String username, String password, int sex, String love) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.love = love;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}
}
