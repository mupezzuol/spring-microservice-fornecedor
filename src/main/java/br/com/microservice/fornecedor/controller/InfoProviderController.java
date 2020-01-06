package br.com.microservice.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.fornecedor.entities.InfoProvider;
import br.com.microservice.fornecedor.service.IInfoProviderService;

@RestController
@RequestMapping("/info")
public class InfoProviderController {

	@Autowired
	private IInfoProviderService infoProviderService;
	
	@GetMapping("/{state}")
	public InfoProvider getInfoProviderByState(@PathVariable String state) {
		return this.infoProviderService.getInfoByState(state);
	}
	
}
