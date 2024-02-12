package com.example.jardel.ecomerc.service;


import com.example.jardel.ecomerc.controller.Fornecedores;
import com.example.jardel.ecomerc.entity.Banco;
import com.example.jardel.ecomerc.entity.Fornecedor;
import com.example.jardel.ecomerc.repository.BancoRepository;
import com.example.jardel.ecomerc.repository.FornecedoresRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FornecedorService {

    FornecedoresRepository fornecedoresRepository;

    public FornecedorService(FornecedoresRepository fornecedoresRepository) {
        this.fornecedoresRepository = fornecedoresRepository;
    }

    public List<Fornecedor> create(Fornecedor fornecedor) {
        fornecedoresRepository.save(fornecedor);
        return list();
    }

    public List<Fornecedor> list(){
        // ordenação da lista de tarefa primeiro por prioridade de forma descedente e depois por nome.
        Sort sort =  Sort.by("id").descending().and( Sort.by("name").ascending());
        return fornecedoresRepository.findAll(sort);
    }

    public List<Fornecedor> update(@RequestBody Fornecedor fornecedor ){
        fornecedoresRepository.save(fornecedor);
        return  list();
    }

    public List<Fornecedor> delete(@RequestBody Fornecedor fornecedor ){
        fornecedoresRepository.delete(fornecedor);
        return list();

    }
}
