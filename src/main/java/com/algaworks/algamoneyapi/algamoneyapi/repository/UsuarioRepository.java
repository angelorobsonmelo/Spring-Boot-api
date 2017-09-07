package com.algaworks.algamoneyapi.algamoneyapi.repository;

import java.util.Optional;

import com.algaworks.algamoneyapi.algamoneyapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

  Optional<Usuario> findByEmail(String email);

}
