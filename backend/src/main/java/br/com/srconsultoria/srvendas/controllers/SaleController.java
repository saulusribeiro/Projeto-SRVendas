package br.com.srconsultoria.srvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srconsultoria.srvendas.dto.SaleDTO;
import br.com.srconsultoria.srvendas.dto.SalesSuccessDTO;
import br.com.srconsultoria.srvendas.dto.SalesSumDTO;
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
		@GetMapping(value="/amount-by-seller")
		public ResponseEntity<List<SalesSumDTO>> amountGroupBySeller(){
			 List<SalesSumDTO> list = saleService.amountGroupBySeller();
			 return ResponseEntity.ok(list);
			
		}
		@GetMapping(value="/success-by-seller")
		public ResponseEntity<List<SalesSuccessDTO>> successGroupBySeller(){
			 List<SalesSuccessDTO> list = saleService.successGroupedBySeller();
			 return ResponseEntity.ok(list);
			
		}
	
}
