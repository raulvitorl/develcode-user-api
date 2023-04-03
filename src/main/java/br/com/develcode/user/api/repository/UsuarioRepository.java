package br.com.develcode.user.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.develcode.user.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByCodigo(String codigo);
	
}
