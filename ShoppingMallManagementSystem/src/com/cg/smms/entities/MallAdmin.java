package com.cg.smms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mallAdmin")
public class MallAdmin {
	
	//mall to malladmin
	@OneToOne(mappedBy="malladmin")
	private Mall mall;
	
	//user to malladmin
	@OneToOne(mappedBy="malladmin")
	private User user;
	
	@Id
	@Column(name="malladmin_id")
	private long mall_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phone")
	private long phone;

	public MallAdmin(Mall mall, User user, long mall_id, String name, String password, long phone) {
		super();
		this.mall = mall;
		this.user = user;
		this.mall_id = mall_id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public MallAdmin() {
		super();
	}

	public Mall getMall() {
		return mall;
	}

	public void setMall(Mall mall) {
		this.mall = mall;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getMall_id() {
		return mall_id;
	}

	public void setMall_id(long mall_id) {
		this.mall_id = mall_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "MallAdmin [mall=" + mall + ", user=" + user + ", mall_id=" + mall_id + ", name=" + name + ", password="
				+ password + ", phone=" + phone + "]";
	}

	

}