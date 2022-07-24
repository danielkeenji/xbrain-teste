package com.teste.xbrain.venda;

import com.teste.xbrain.vendedor.VendedorRepository;
import lombok.val;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class VendaService {
    private final VendaRepository vendaRepository;
    private final VendedorRepository vendedorRepository;

    public VendaService(VendaRepository vendaRepository, VendedorRepository vendedorRepository) {
        this.vendaRepository = vendaRepository;
        this.vendedorRepository = vendedorRepository;
    }

    public Page<Venda> retrieveVenda(Pageable pageable) {
        return this.vendaRepository.findAll(pageable);
    }

    public void saveVenda(VendaCreationDto vendaCreationDto) {
        val vendedor = this.vendedorRepository.findById(vendaCreationDto.getIdVendedor());
        if (!vendedor.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            this.vendaRepository.save(vendaCreationDto.toEntity());
        }
    }
}
