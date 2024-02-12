package com.example.jardel.ecomerc.controller;



import com.example.jardel.ecomerc.entity.Banco;
import com.example.jardel.ecomerc.entity.Fornecedor;
import com.example.jardel.ecomerc.service.FornecedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Fornecedores {

   private FornecedorService fornecedorService;

    public Fornecedores(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping("/Fornecedor")
    public String fornecedores() {
        return "Aqui estão listados os fornecedores";
    }

    @GetMapping("/Fornecedores")
    public List<Fornecedor> fornecedor() {
        return fornecedorService.list();
    }
    @PostMapping("/Fornecedores")
    public List<Fornecedor> postFornecedores(@RequestBody Fornecedor fornecedor){
        return fornecedorService.create(fornecedor);
    }
    @PutMapping("/Fornecedores")
    public List<Fornecedor> putFornecedores(@RequestBody Fornecedor fornecedor){
        return fornecedorService.update(fornecedor);
    }

    @DeleteMapping("/Fornecedores")
    public List<Fornecedor> deleteFornecedores(@RequestBody Fornecedor fornecedor){
        return fornecedorService.delete(fornecedor);
    }
}


