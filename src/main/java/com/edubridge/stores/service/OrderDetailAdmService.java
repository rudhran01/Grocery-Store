package com.edubridge.stores.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;

import com.edubridge.stores.entity.OrderDetail;

public interface OrderDetailAdmService
{
	public List<OrderDetail> getAllOrderDetail();
	public Optional<OrderDetail> getOrderDetailId(Long pid);
	public void deleteOrderDetail(Long pid);
	List<OrderDetail> getOrdersByStatus(String orderStatus);
	List<OrderDetail> getTop10Orders(String orderStatus, Pageable pageable);
	List<OrderDetail> getAllOrders();
}
