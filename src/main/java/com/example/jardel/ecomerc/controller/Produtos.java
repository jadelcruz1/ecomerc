package com.example.jardel.ecomerc.controller;

import com.example.jardel.ecomerc.entity.Banco;
import com.example.jardel.ecomerc.service.BancoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class Produtos {

    private BancoService bancoService;

    public Produtos(BancoService bancoService) {
        this.bancoService = bancoService;
    }

    @GetMapping()
   public List<Banco> produtos() {
       return bancoService.list();
    }

    @PostMapping()
    public List<Banco> postProdutos(@RequestBody Banco banco){
        return bancoService.create(banco);
    }
    @PutMapping()
    public Banco putProdutos(@RequestBody Banco banco){
        return bancoService.update(banco);
    }
    @DeleteMapping()
    public List<Banco> deleteProdutos(@RequestBody Banco banco){
        return bancoService.delete(banco);
    }


}
