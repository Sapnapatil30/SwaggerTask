package com.sts.swaggtask.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	private int orderId;
	private String orderDate;
	private String prodName;
	private float qtn;
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
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public float getQtn() {
		return qtn;
	}
	public void setQtn(float qtn) {
		this.qtn = qtn;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderId, String orderDate, String prodName, float qtn) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.prodName = prodName;
		this.qtn = qtn;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", prodName=" + prodName + ", qtn=" + qtn
				+ "]";
	}
	
	
	

}
