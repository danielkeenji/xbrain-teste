package com.teste.xbrain.vendedor;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends PagingAndSortingRepository<Vendedor, Long> {
}
