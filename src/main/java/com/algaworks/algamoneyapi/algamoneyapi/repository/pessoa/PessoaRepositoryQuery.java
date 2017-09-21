package com.algaworks.algamoneyapi.algamoneyapi.repository.pessoa;

import com.algaworks.algamoneyapi.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.algamoneyapi.model.Pessoa;
import com.algaworks.algamoneyapi.algamoneyapi.repository.filter.LancamentoFilter;
import com.algaworks.algamoneyapi.algamoneyapi.repository.filter.PessoaFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Angelo on 07/09/2017.
 */
public interface PessoaRepositoryQuery {

  Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);

}
