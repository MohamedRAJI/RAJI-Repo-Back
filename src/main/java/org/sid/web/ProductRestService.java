package org.sid.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sid.entities.Product;
import org.sid.metier.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class ProductRestService {

	@Autowired
	private IProduct productMetier;

	@GetMapping("/{bank}/products")
	//@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<Product> getAllProducts(@PathVariable String bank) {
		return productMetier.getProducts();
	}
	
	@PostMapping("/products")
	//@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public Product createProduct(@RequestBody Product p) {
		return productMetier.addProduct(p);
	}
	
	/*@GetMapping("/products/{id}")
	//@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Product>getProductById(@PathVariable Long id) {
		return ResponseEntity.ok(productMetier.getProductById(id));
	}
	
	@PutMapping("/products/{id}")
	//@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Product> updateProduct(@PathVariable Long id,@RequestBody Product p){
		Product prd=productMetier.getProductById(id);
		p.setId(prd.getId());
		return ResponseEntity.ok(productMetier.addProduct(p));		
	}
	
	@DeleteMapping("/products/{id}")
	//@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Map<String,Boolean>> deleteProduct(@PathVariable Long id){
		Product prd=productMetier.getProductById(id);
		productMetier.deleteProduct(prd);
		Map<String,Boolean> response=new HashMap<String, Boolean>();
		response.put("Product deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}*/

}
