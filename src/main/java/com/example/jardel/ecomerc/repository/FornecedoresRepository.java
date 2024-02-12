package com.example.jardel.ecomerc.repository;

import com.example.jardel.ecomerc.controller.Fornecedores;
import com.example.jardel.ecomerc.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedoresRepository extends JpaRepository<Fornecedor, Long> {
}
