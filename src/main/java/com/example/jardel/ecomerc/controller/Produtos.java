package com.example.jardel.ecomerc.controller;

import com.example.jardel.ecomerc.entity.Banco;
import com.example.jardel.ecomerc.service.BancoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Produtos {

    private BancoService bancoService;

    public Produtos(BancoService bancoService) {
        this.bancoService = bancoService;
    }

    @GetMapping("/")
    public String home() {
        return "Aqui estão listados os produtos";
    }

    @GetMapping("/produtos")
   public List<Banco> produtos() {
       return bancoService.list();
    }

    @PostMapping("/putProdutos")
    public List<Banco> postProdutos(@RequestBody Banco banco){
        return bancoService.create(banco);
    }
    @PutMapping("/putProdutos")
    public Banco putProdutos(@RequestBody Banco banco){
        return bancoService.update(banco);
    }
    @DeleteMapping("/putProdutos")
    public List<Banco> deleteProdutos(@RequestBody Banco banco){
        return bancoService.delete(banco);
    }


}
