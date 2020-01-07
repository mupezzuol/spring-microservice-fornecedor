package br.com.microservice.fornecedor.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.fornecedor.dto.OrderItemDTO;
import br.com.microservice.fornecedor.entities.Order;
import br.com.microservice.fornecedor.entities.OrderItem;
import br.com.microservice.fornecedor.entities.Product;
import br.com.microservice.fornecedor.repository.OrderRepository;
import br.com.microservice.fornecedor.repository.ProductRepository;
import br.com.microservice.fornecedor.service.IOrderService;

@Service
public class OrderService implements IOrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Order placeOrder(List<OrderItemDTO> items) {
		if(items == null) {
			return null;
		}
		
		List<OrderItem> orderItems = toOrderItem(items);
		Order order = new Order(orderItems);
		order.setPreparationTime(items.size());
		return orderRepository.save(order);
	}
	
	@Override
	public Order getOrderbyId(Long id) {
		return this.orderRepository.findById(id).orElse(new Order());
	}

	private List<OrderItem> toOrderItem(List<OrderItemDTO> items) {
		List<Long> idsProduct = items
				.stream()
				.map(item -> item.getId())
				.collect(Collectors.toList());
		
		List<Product> orderProducts = productRepository.findByIdIn(idsProduct);
		
		List<OrderItem> orderItems = items
			.stream()
			.map(item -> {
				Product product = orderProducts
						.stream()
						.filter(p -> p.getId() == item.getId())
						.findFirst().get();
				
				OrderItem orderItem = new OrderItem();
				orderItem.setProduct(product);
				orderItem.setAmount(item.getAmount());
				return orderItem;
			})
			.collect(Collectors.toList());
		return orderItems;
	}
	
}
