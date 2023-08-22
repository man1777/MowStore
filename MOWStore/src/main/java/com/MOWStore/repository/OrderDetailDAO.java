package com.MOWStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MOWStore.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer>{

}
