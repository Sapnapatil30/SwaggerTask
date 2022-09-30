package com.sts.swaggtask.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int prodId;
	private String prodName;
	private String prodCatagory;
	private float prodPrice;
	
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCatagory() {
		return prodCatagory;
	}
	public void setProdCatagory(String prodCatagory) {
		this.prodCatagory = prodCatagory;
	}
	public float getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}
	public Product(int prodId, String prodName, String prodCatagory, float prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCatagory = prodCatagory;
		this.prodPrice = prodPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCatagory=" + prodCatagory
				+ ", prodPrice=" + prodPrice + "]";
	}
	
}
