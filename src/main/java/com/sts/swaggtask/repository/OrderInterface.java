package com.sts.swaggtask.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sts.swaggtask.Entity.Orders;

@Repository
public interface OrderInterface extends CrudRepository<Orders, Integer>{

}
