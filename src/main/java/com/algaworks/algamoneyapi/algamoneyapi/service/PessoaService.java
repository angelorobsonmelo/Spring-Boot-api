package com.algaworks.algamoneyapi.algamoneyapi.service;

import com.algaworks.algamoneyapi.algamoneyapi.model.Pessoa;
import com.algaworks.algamoneyapi.algamoneyapi.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizar(Long codigo, Pessoa pessoa){
        Pessoa pessoaSalva = encontrarPessoaPeloCodigo(codigo);
        BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
        return pessoaRepository.save(pessoaSalva);
    }

    public Pessoa encontrarPessoaPeloCodigo(Long codigo) {
        Pessoa pessoaSalva = pessoaRepository.findOne(codigo);
        if (pessoaSalva == null){
            throw new EmptyResultDataAccessException(1);
        }
        return pessoaSalva;
    }

    public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
        Pessoa pessoaSalva = encontrarPessoaPeloCodigo(codigo);
        pessoaSalva.setAtivo(ativo);
        pessoaRepository.save(pessoaSalva);
    }
}
