package br.com.srconsultoria.srvendas.dto;

import java.io.Serializable;

import br.com.srconsultoria.srvendas.entities.Seller;

public class SalesSumDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double sum;
	
	public SalesSumDTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public SalesSumDTO(Seller seller, Double sum) {
		
		this.name = seller.getName();
		this.sum = sum;
	}
	
}
