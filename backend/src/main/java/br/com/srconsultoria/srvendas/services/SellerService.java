package br.com.srconsultoria.srvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srconsultoria.srvendas.dto.SellerDTO;
import br.com.srconsultoria.srvendas.entities.Seller;
import br.com.srconsultoria.srvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll() {
		
		List<Seller> result = sellerRepository.findAll();
		
		// converte cada linha do RESULTSET, para registro SellerDTO, e depois converte para lista
		// usando expressao Lambda com stream
		
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
