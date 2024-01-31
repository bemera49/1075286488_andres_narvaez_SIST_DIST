package com.corhuila.andresnarvaez.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.andresnarvaez.Entity.Usuario;
import com.corhuila.andresnarvaez.IRepository.IBaseRepository;
import com.corhuila.andresnarvaez.IRepository.IUsuarioRepository;
import com.corhuila.andresnarvaez.IService.IUsuarioIService;


@Service
public class UsuarioService extends BaseService<Usuario> implements IUsuarioIService{

	@Override
	protected IBaseRepository<Usuario, Long> getRepository() {
		return repository;
	}

	@Autowired
	private IUsuarioRepository repository;

}

