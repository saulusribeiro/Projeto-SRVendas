package br.com.srconsultoria.srvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.srconsultoria.srvendas.dto.SaleDTO;
import br.com.srconsultoria.srvendas.entities.Sale;
import br.com.srconsultoria.srvendas.repositories.SaleRepository;
import br.com.srconsultoria.srvendas.repositories.SellerRepository;



@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	// colocando os vendedores em cache
	
	@Autowired
	private SellerRepository sellerRepository;
	

	
	// busca paginada
	
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		
		Page<Sale> result = saleRepository.findAll(pageable);
		return  result.map(x -> new SaleDTO(x));
	}

}
