package com.teste.xbrain.venda;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends PagingAndSortingRepository<Venda, Long> {

}
