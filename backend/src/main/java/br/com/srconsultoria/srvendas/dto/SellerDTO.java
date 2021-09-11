package br.com.srconsultoria.srvendas.dto;

import java.io.Serializable;

import br.com.srconsultoria.srvendas.entities.Seller;

public class SellerDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Long    id;
	private String  name;
	
	public SellerDTO() {
		
	}

	public SellerDTO(Long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public SellerDTO(Seller entity) {
		
		id = entity.getId();
		name = entity.getName();
	}


}
