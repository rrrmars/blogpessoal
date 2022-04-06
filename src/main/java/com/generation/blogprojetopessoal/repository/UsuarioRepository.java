package com.generation.blogprojetopessoal.repository;

import java.util.Optional;

import com.generation.blogprojetopessoal.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
	public Optional<Usuario> findByUsuario(String usuario);

}