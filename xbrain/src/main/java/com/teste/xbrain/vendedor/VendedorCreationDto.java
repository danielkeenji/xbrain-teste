package com.teste.xbrain.vendedor;

import lombok.Value;

@Value
public class VendedorCreationDto {
    String nomeVendedor;

    Vendedor toEntity() {
        return Vendedor.builder()
                .nomeVendedor(this.nomeVendedor).build();
    }
}
