package br.com.srconsultoria.srvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srconsultoria.srvendas.dto.SaleDTO;
import br.com.srconsultoria.srvendas.repositories.SellerRepository;
import br.com.srconsultoria.srvendas.services.SaleService;

@RestController
@RequestMapping( value = "/sales")
public class SaleController {
		
		@Autowired
		private  SaleService saleService;
		
		
		@GetMapping
		public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
			 Page<SaleDTO> page = saleService.findAll(pageable);
			 return ResponseEntity.ok(page);
			
		}
		

}
