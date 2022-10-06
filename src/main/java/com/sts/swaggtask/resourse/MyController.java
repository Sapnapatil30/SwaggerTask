package com.sts.swaggtask.resourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.swaggtask.Entity.Orders;
import com.sts.swaggtask.Entity.Product;
import com.sts.swaggtask.services.OrderService;
import com.sts.swaggtask.services.ProductService;

@RestController
public class MyController {

	@Autowired
	private ProductService service;
	
	@Autowired
	private OrderService service1;
	
	@GetMapping("/Product")
	public List<Product> getAllproduct()
	{
		return service.getAllproduct();
	}
	
	
	@PostMapping("/addproduct")
	public void addProduct(@RequestBody Product pro)
	{
		this.service.addProduct(pro);
	}
	
	
	@PutMapping("/product/{proid}")
	public void updateProduct(@PathVariable String proid,@RequestBody Product pro)
	{
		this.service.updateProduct(Integer.parseInt(proid),pro);
		
		
	}

	@GetMapping("/deleteprod/{proid}")
	public void deleteProduct(@PathVariable String proid)
	{
	     service.deleteProduct(Integer.parseInt(proid));
	     
	}
	
	@GetMapping("/order")
	public List<Orders> getAllOrder()
	{
		return service1.getAllOrder();
	}
	

	@PostMapping("/addorder")
	public void addOrder(@RequestBody Orders ord)
	{
		this.service1.addOrder(ord);
	}
	
	
	@PutMapping("/order/{ordid}")
	public void updateOrder(@PathVariable String ordid,@RequestBody Orders ord)
	{
		this.service1.updateOrder(Integer.parseInt(ordid),ord);
		
		
	}

	@GetMapping("/deleteord/{ordid}")
	public void deleteOrder(@PathVariable String ordid)
	{
	     this.service1.deleteOrder(Integer.parseInt(ordid));
	     
	}
	
}
