package com.algaworks.algamoneyapi.algamoneyapi.service;

import com.algaworks.algamoneyapi.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.algamoneyapi.model.Pessoa;
import com.algaworks.algamoneyapi.algamoneyapi.repository.LancamentoRepository;
import com.algaworks.algamoneyapi.algamoneyapi.repository.PessoaRepository;
import com.algaworks.algamoneyapi.algamoneyapi.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoService {

    @Autowired
   private LancamentoRepository lancamentoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
        if (pessoa == null || pessoa.isInativo()) {
            throw new PessoaInexistenteOuInativaException();
        }

        return lancamentoRepository.save(lancamento);
    }

    public List<Lancamento> listar(){
        return lancamentoRepository.findAll();
    }

    public Lancamento buscarLancamentoPeloCodigo(Long codigo){
        return lancamentoRepository.findOne(codigo);
    }
}
