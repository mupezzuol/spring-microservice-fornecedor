package br.com.microservice.fornecedor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.fornecedor.dto.OrderItemDTO;
import br.com.microservice.fornecedor.entities.Order;
import br.com.microservice.fornecedor.service.IOrderService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

	@Autowired
	private IOrderService orderService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Order placeOrder(@RequestBody List<OrderItemDTO> produtos) {
		log.info("request order received");
		return orderService.placeOrder(produtos);
	}
	
	@RequestMapping("/{id}")
	public Order getOrderById(@PathVariable Long id) {
		return orderService.getOrderbyId(id);
	}
	
}
