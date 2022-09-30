package com.sts.swaggtask.resourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.swaggtask.Entity.Product;
import com.sts.swaggtask.services.ProductService;

@RestController
public class MyController {

	@Autowired
	private ProductService service;
	
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
}
