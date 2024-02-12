package com.example.jardel.ecomerc.service;

import com.example.jardel.ecomerc.entity.Cadastro;
import com.example.jardel.ecomerc.entity.Fornecedor;
import com.example.jardel.ecomerc.repository.CadastroRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CadastroService {
    private CadastroRepository cadastroRepository;

    public CadastroService(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;
    }

    public List<Cadastro> create(Cadastro cadastro) {
        cadastroRepository.save(cadastro);
        return list();
    }

    public List<Cadastro> list(){
        // ordenação da lista de tarefa primeiro por prioridade de forma descedente e depois por nome.
        Sort sort =  Sort.by("id").descending().and( Sort.by("estado").ascending());
        return cadastroRepository.findAll(sort);
    }

    public List<Cadastro> update(@RequestBody Cadastro cadastro ){
        cadastroRepository.save(cadastro);
        return  list();
    }

    public List<Cadastro> delete(@RequestBody Cadastro cadastro ){
        cadastroRepository.delete(cadastro);
        return list();

    }


}
