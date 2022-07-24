package com.teste.xbrain.venda;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(VendaController.BASE_URI)
public class VendaController {
    public static final String BASE_URI = "/vendas";

    private final VendaService vendaService;

    public VendaController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    @GetMapping
    public Page<Venda> retrieveVenda(Pageable pageable) {
        return this.vendaService.retrieveVenda(pageable);
    }

    @PostMapping("/salvar")
    public void saveVenda(@RequestBody VendaCreationDto vendaCreationDto) {
        this.vendaService.saveVenda(vendaCreationDto);
    }
}
