package org.sid.web;

import java.util.List;

import org.sid.dao.ParametersRepository;
import org.sid.entities.Parameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class ParametersRestService {
	@Autowired
	ParametersRepository paramRepo;
	
	@GetMapping("/{codeBank}")
	List<Parameters>getParams(@PathVariable int codeBank){
		return paramRepo.getParams(codeBank);
		
	}

}
