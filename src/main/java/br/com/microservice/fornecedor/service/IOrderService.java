package br.com.microservice.fornecedor.service;

import java.util.List;

import br.com.microservice.fornecedor.dto.OrderItemDTO;
import br.com.microservice.fornecedor.entities.Order;

public interface IOrderService {
	
	public Order placeOrder(List<OrderItemDTO> items);
	
	public Order getOrderbyId(Long id);

}
