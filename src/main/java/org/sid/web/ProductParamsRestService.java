package org.sid.web;

import java.util.List;

import org.sid.dao.ProductParamsRepository;
import org.sid.entities.ProductParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class ProductParamsRestService {
	@Autowired
	ProductParamsRepository ProductParamsRepo;
	
	@GetMapping("/{bank}/Add-product")
	List<ProductParams>getParams(@PathVariable String bank){
		return ProductParamsRepo.getParams(bank);
		
	}

}
