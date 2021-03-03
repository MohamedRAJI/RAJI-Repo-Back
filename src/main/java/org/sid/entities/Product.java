package org.sid.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	private int quantite;
	private double prix;
	
	public Product(String designation, int qte, double prix) {
		this.designation=designation;
		this.quantite=qte;
		this.prix=prix;
	}
}
