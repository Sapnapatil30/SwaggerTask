package com.sts.swaggtask.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sts.swaggtask.Entity.Product;


@Repository
public interface Productinterface extends CrudRepository<Product, Integer>{

}
