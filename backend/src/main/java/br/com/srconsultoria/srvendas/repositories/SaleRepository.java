package br.com.srconsultoria.srvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.srconsultoria.srvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
