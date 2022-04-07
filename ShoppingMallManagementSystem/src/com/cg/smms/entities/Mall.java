package com.cg.smms.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mall")
public class Mall {
	
	//mall to malladmin
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="malladmin_id")
	private MallAdmin malladmin;

	private Mall mall;
	
	public Mall getmall() {
		return mall;
	}
	public void setmalladmin(Mall mall) {
		this.mall = mall;
	}

	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "mallName")
	private String mallName;

	@Column(name = "location")
	private String location;

	@Column(name = "shops")
	private List<Shop> shops;

	private enum categories {
		REGIONAL, SUPERREGIONAL
	}

	public Mall(MallAdmin malladmin, Mall mall, long id, String mallName, String location, List<Shop> shops) {
		super();
		this.malladmin = malladmin;
		this.mall = mall;
		this.id = id;
		this.mallName = mallName;
		this.location = location;
		this.shops = shops;
	}
	public Mall() {
		super();
	}
	public MallAdmin getMalladmin() {
		return malladmin;
	}
	public void setMalladmin(MallAdmin malladmin) {
		this.malladmin = malladmin;
	}
	public Mall getMall() {
		return mall;
	}
	public void setMall(Mall mall) {
		this.mall = mall;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Shop> getShops() {
		return shops;
	}
	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}
	
	@Override
	public String toString() {
		return "Mall [malladmin=" + malladmin + ", mall=" + mall + ", id=" + id + ", mallName=" + mallName
				+ ", location=" + location + ", shops=" + shops + "]";
	}
	
}
