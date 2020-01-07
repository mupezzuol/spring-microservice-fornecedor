package br.com.microservice.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.fornecedor.entities.InfoProvider;
import br.com.microservice.fornecedor.service.IInfoProviderService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/info")
@Slf4j
public class InfoProviderController {

	@Autowired
	private IInfoProviderService infoProviderService;
	
	@GetMapping("/{state}")
	public InfoProvider getInfoProviderByState(@PathVariable String state) {
		log.info("information request from the service provider {} " + state);
		return this.infoProviderService.getInfoByState(state);
	}
	
}
