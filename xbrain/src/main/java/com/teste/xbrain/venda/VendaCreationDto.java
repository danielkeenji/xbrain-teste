package com.teste.xbrain.venda;

import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
public class VendaCreationDto {
    String nomeVendedor;

    Long idVendedor;

    BigDecimal valor;

    Venda toEntity() {
        return Venda.builder()
                .nomeVendedor(this.nomeVendedor)
                .idVendedor(this.idVendedor)
                .valor(this.valor)
                .data(LocalDateTime.now())
                .build();
    }
}
