package br.com.microservice.fornecedor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class OrderItemDTO {

	private long id;
	private int amount;
	
}
