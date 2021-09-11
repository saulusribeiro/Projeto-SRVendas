package br.com.srconsultoria.srvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.srconsultoria.srvendas.dto.SalesSuccessDTO;
import br.com.srconsultoria.srvendas.dto.SalesSumDTO;
import br.com.srconsultoria.srvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new br.com.srconsultoria.srvendas.dto.SalesSumDTO(obj.seller, SUM(obj.amount))"
			+ "  FROM Sale AS obj GROUP BY obj.seller")
	List<SalesSumDTO> amountGroupBySeller();
	
	@Query("SELECT new br.com.srconsultoria.srvendas.dto.SalesSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ "  FROM Sale AS obj GROUP BY obj.seller")
	List<SalesSuccessDTO> successGroupedBySeller();


}
