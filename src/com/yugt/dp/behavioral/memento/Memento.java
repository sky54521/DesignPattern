package com.yugt.dp.behavioral.memento;

/**
 * 备忘者（用来保存备忘信息）
 * @author Administrator
 *
 */
public class Memento {
	private String name;
	private String phone;

	public Memento(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
