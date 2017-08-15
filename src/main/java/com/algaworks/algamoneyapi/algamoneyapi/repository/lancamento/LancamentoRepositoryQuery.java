package com.algaworks.algamoneyapi.algamoneyapi.repository.lancamento;

import com.algaworks.algamoneyapi.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.algamoneyapi.repository.filter.LancamentoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by antonio.filho on 11/08/2017.
 */
public interface LancamentoRepositoryQuery {

    Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}