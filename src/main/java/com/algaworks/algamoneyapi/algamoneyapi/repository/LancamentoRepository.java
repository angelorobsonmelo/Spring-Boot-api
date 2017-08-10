package com.algaworks.algamoneyapi.algamoneyapi.repository;

import com.algaworks.algamoneyapi.algamoneyapi.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}
