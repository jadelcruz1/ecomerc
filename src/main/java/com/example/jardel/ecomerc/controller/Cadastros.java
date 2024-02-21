package com.example.jardel.ecomerc.controller;

import com.example.jardel.ecomerc.entity.Banco;
import com.example.jardel.ecomerc.entity.Cadastro;
import com.example.jardel.ecomerc.service.CadastroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class Cadastros {

    private CadastroService cadastroService;

    public Cadastros(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

   /* @GetMapping("/cadastramento")
    public String home() {
        return "Aqui estão listados os cadastros";
    }*/

    @GetMapping()
    public List<Cadastro> cadastros() {
        return cadastroService.list();
    }

    @PostMapping()
    public List<Cadastro> postCadastros(@RequestBody Cadastro  cadastro){
        return cadastroService.create(cadastro);
    }
    @PutMapping()
    public List<Cadastro> putCadastros(@RequestBody Cadastro cadastro){
        return cadastroService.update(cadastro);
    }
    @DeleteMapping()
    public List<Cadastro> deleteCadastros(@RequestBody Cadastro cadastro){
        return cadastroService.delete(cadastro);
    }

}
