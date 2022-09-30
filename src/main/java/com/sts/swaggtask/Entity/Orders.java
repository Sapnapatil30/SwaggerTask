package com.sts.swaggtask.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	private int orderId;
	private String orderDate;
	private int qtn;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getQtn() {
		return qtn;
	}
	public void setQtn(int qtn) {
		this.qtn = qtn;
	}
	public Orders(int orderId, String orderDate, int qtn) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.qtn = qtn;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", qtn=" + qtn + "]";
	}
	

}
