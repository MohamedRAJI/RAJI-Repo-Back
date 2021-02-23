package org.sid.metier;

import java.util.List;

import org.sid.entities.Product;

public interface IProduct {
  public Product addProduct(Product p);
  public void deleteProduct(Product p);
  public List<Product>getProducts();
  public Product getProductById(Long id);
}
