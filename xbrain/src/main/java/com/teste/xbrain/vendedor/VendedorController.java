package com.teste.xbrain.vendedor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(VendedorController.BASE_URI)
public class VendedorController {
    public static final String BASE_URI = "/vendedores";

    private final VendedorService vendedorService;

    public VendedorController(VendedorService vendedorService) {
        this.vendedorService = vendedorService;
    }

    @GetMapping
    public Page<Vendedor> retrieveVendedor(Pageable pageable) {
        return this.vendedorService.retrieveVendedor(pageable);
    }

    @PostMapping("/salvar")
    public void saveVendedor(@RequestBody VendedorCreationDto vendedorCreationDto) {
        this.vendedorService.saveVendedor(vendedorCreationDto);
    }
}
