package com.sts.swaggtask.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.swaggtask.Entity.Product;
import com.sts.swaggtask.repository.Productinterface;


@Service
public class ProductService {
	
	@Autowired
	private Productinterface service;
	
	public List<Product> getAllproduct()
	{
		List<Product> list=new ArrayList<Product>();
		this.service.findAll().forEach(list::add);
		return list;
	}
	
	public void addProduct(Product pro)
	{
		this.service.save(pro);
	}
	
	public void updateProduct(Integer id, Product pro)
	{
		this.service.save(pro);
		
	}
	
	public void deleteProduct(Integer id)
	{
		this.service.deleteById(id);
	}

}
