package com.example.jardel.ecomerc.service;

import com.example.jardel.ecomerc.entity.Banco;
import com.example.jardel.ecomerc.repository.BancoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoService {
    private BancoRepository bancoRepository;

    public BancoService(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }

    public List<Banco> create(Banco banco) {
        bancoRepository.save(banco);
        return list();
    }

    public List<Banco> list(){
        // ordenação da lista de tarefa primeiro por prioridade de forma descedente e depois por nome.
        Sort sort =  Sort.by("preco").descending().and( Sort.by("id").ascending());
        return bancoRepository.findAll(sort);
    }

    public List<Banco> update(Banco banco){
        bancoRepository.save(banco);
        return list();
    }


}
