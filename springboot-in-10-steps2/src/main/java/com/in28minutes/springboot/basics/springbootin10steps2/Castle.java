package com.in28minutes.springboot.basics.springbootin10steps2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Castle {

	@Id
//	@GeneratedValue
	private int id;
	private String name;
	

	public Castle() {
		super();
	}

	public Castle(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Castle [name=" + name + "]";
	}
	
	
}
