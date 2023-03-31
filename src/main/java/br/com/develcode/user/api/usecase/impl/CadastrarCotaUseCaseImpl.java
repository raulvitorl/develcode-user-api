package br.com.develcode.user.api.usecase.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.develcode.user.api.model.Usuario;
import br.com.develcode.user.api.repository.CotaRepository;
import br.com.develcode.user.api.usecase.CadastrarCotaUseCase;

@Service
public class CadastrarCotaUseCaseImpl implements CadastrarCotaUseCase{
	
	@Autowired
	private  CotaRepository cotaRepository;

	@Override
	public Usuario execute(Usuario obj) {
		obj.setUuid(UUID.randomUUID().toString());
		return cotaRepository.save(obj);
	}

}
