package com.example.jardel.ecomerc.service;

import com.example.jardel.ecomerc.entity.Banco;
import com.example.jardel.ecomerc.repository.BancoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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
        Sort sort =  Sort.by("id").descending().and( Sort.by("preco").ascending());
        return bancoRepository.findAll(sort);
    }

    public Banco update(@RequestBody Banco banco ){
        return  bancoRepository.save(banco);
    }

    public List<Banco> delete(@RequestBody Banco banco ){
        bancoRepository.delete(banco);
        return list();

    }


}
