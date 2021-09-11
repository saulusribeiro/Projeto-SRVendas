package br.com.srconsultoria.srvendas.dto;

import java.io.Serializable;

import br.com.srconsultoria.srvendas.entities.Seller;

public class SalesSuccessDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Long   visited;
	private Long   deals;
	
	public SalesSuccessDTO() {
		
	}

	public SalesSuccessDTO(Seller seller, Long visited, Long deals) {
		
		name = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}