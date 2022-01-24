package com.abc.orderservices.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_service")
public class Order {

	@Id
	@Column(name="orderid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderid;
	
	@Column(name="status")
	private String status;
	
	@Column(name="orderrefnumber")
	private long orderrefnumber;

	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getOrderrefnumber() {
		return orderrefnumber;
	}

	public void setOrderrefnumber(long orderrefnumber) {
		this.orderrefnumber = orderrefnumber;
	}
	
	
	
}
