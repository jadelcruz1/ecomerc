package com.example.jardel.ecomerc.service;

import com.example.jardel.ecomerc.entity.Banco;
import com.example.jardel.ecomerc.entity.User;
import com.example.jardel.ecomerc.repository.BancoRepository;
import com.example.jardel.ecomerc.repository.UserRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> create(User user) {
        userRepository.save(user);
        return list();
    }

    public List<User> list(){
        // ordenação da lista de tarefa primeiro por prioridade de forma descedente e depois por nome.
        Sort sort =  Sort.by("id").descending().and( Sort.by("preco").ascending());
        return userRepository.findAll(sort);
    }

    public User update(@RequestBody User user ){
        return  userRepository.save(user);
    }

    public List<User> delete(@RequestBody User user ){
        userRepository.delete(user);
        return list();

    }


}
