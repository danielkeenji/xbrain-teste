package com.teste.xbrain.vendedor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {
    private final VendedorRepository vendedorRepository;

    public VendedorService(VendedorRepository vendedorRepository) {
        this.vendedorRepository = vendedorRepository;
    }

    public Page<Vendedor> retrieveVendedor(Pageable pageable) {
        return this.vendedorRepository.findAll(pageable);
    }

    public void saveVendedor(VendedorCreationDto vendedorCreationDto) {
        this.vendedorRepository.save(vendedorCreationDto.toEntity());
    }
}
