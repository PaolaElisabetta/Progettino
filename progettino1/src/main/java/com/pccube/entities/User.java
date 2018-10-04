package com.pccube.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column
	private String userName;
	
	@Column
	private String password;
	
	@Column
	private String type;
	
	@OneToMany
	private List<Task> tasks = new ArrayList<>();

	
	public User() {}
	
	
	public User(String userName, String password, String type, List<Task> tasks) {
		super();
		this.userName = userName;
		this.password = password;
		this.type = type;
		this.tasks = tasks;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	
}
