package com.example.jardel.ecomerc.controller;

import com.example.jardel.ecomerc.entity.Banco;
import com.example.jardel.ecomerc.entity.Cadastro;
import com.example.jardel.ecomerc.service.CadastroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Cadastros {

    private CadastroService cadastroService;

    public Cadastros(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @GetMapping("/cadastro")
    public String home() {
        return "Aqui estão listados os cadastros";
    }

    @GetMapping("/cadastros")
    public List<Cadastro> cadastros() {
        return cadastroService.list();
    }

    @PostMapping("/postCadastros")
    public List<Cadastro> postCadastros(@RequestBody Cadastro  cadastro){
        return cadastroService.create(cadastro);
    }
    @PutMapping("/putCadastros")
    public List<Cadastro> putCadastros(@RequestBody Cadastro cadastro){
        return cadastroService.update(cadastro);
    }
    @DeleteMapping("/deleteCadastros")
    public List<Cadastro> deleteCadastros(@RequestBody Cadastro cadastro){
        return cadastroService.delete(cadastro);
    }

}
