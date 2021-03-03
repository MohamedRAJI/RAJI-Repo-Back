package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Parameters {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String bank;
	private int codeBank;
	private String libelle;
	private String codeParam;
	private char value;
	
	public Parameters(String bank,int codeBank, String libelle, String codeParam, char value) {
		this.bank=bank;
		this.codeBank=codeBank;
		this.libelle=libelle;
		this.codeParam=codeParam;
		this.value=value;
	}
	
}
