package br.com.srconsultoria.srvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.srconsultoria.srvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
