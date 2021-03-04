package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.sid.annotations.Input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductParams {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String bank;
	@Input(className = "form-control", name = "", placeholder = "")
	private String libelle;
	private String codeParam;
	private char value;
	
	public ProductParams(String bank, String libelle, String codeParam, char value) {
		this.bank=bank;
		this.libelle=libelle;
		this.codeParam=codeParam;
		this.value=value;
	}
	
}
