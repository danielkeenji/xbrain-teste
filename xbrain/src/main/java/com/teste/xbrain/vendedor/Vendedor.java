package com.teste.xbrain.vendedor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vendedor")

public class Vendedor {

    @Id
    @SequenceGenerator(
            name = "VendedorIdSeq",
            sequenceName = "vendedor_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VendedorIdSeq")
    private Long id;

    @Column(name = "nome_vendedor")
    private String nomeVendedor;

}
