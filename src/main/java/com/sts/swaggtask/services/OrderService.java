package com.sts.swaggtask.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.swaggtask.Entity.Orders;
import com.sts.swaggtask.repository.OrderInterface;

@Service
public class OrderService {
	
	@Autowired
	private OrderInterface service1;
	
	public List<Orders> getAllOrder()
	{
		List<Orders> list=new ArrayList<Orders>();
		this.service1.findAll().forEach(list::add);
		return list;
	}
	
	public void addOrder(Orders ord)
	{
		this.service1.save(ord);
	}
	
	public void updateOrder(Integer id, Orders ord)
	{
		this.service1.save(ord);
		
	}
	
	public void deleteOrder(Integer id)
	{
		this.service1.deleteById(id);
	}

}

