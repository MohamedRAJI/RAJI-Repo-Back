package org.sid.metier.impl;

import java.util.List;

import org.sid.dao.ProductRepository;
import org.sid.entities.Product;
import org.sid.exception.RessourceNotFoundException;
import org.sid.metier.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductMetierImpl implements IProduct{
	
	@Autowired
	ProductRepository productRepo;

	@Override
	public Product addProduct(Product p) {
		
		return productRepo.save(p);
	}

	@Override
	public void deleteProduct(Product p) {
		productRepo.delete(p);
		
	}

	@Override
	public List<Product> getProducts() {
		
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		
		return productRepo.findById(id).orElseThrow(()-> new RessourceNotFoundException("Product doesn't exist with id:"+id));
	}

}
