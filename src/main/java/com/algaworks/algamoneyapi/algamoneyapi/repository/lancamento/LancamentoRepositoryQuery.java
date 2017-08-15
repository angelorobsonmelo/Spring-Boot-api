package com.algaworks.algamoneyapi.algamoneyapi.repository.lancamento;

import com.algaworks.algamoneyapi.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.algamoneyapi.repository.filter.LancamentoFilter;

import java.util.List;

/**
 * Created by antonio.filho on 11/08/2017.
 */
public interface LancamentoRepositoryQuery {

    List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}