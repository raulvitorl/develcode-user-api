package br.com.develcode.user.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.develcode.user.api.model.Usuario;

public interface CotaRepository extends JpaRepository<Usuario, String> {
	List<Usuario> findByPrecificado(Long precificado);
}
