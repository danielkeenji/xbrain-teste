package com.teste.xbrain.venda;

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
@Table(name = "venda")
public class Venda {

    @Id
    @SequenceGenerator(
            name = "VendaIdSeq",
            sequenceName = "venda_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VendaIdSeq")
    private Long id;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "data")
    private LocalDateTime data;

    @Column(name = "nome_vendedor")
    private String nomeVendedor;

    @Column(name = "id_vendedor")
    private Long idVendedor;
}
