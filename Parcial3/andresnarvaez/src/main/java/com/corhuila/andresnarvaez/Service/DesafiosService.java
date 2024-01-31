package com.corhuila.andresnarvaez.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.andresnarvaez.Entity.Desafios;
import com.corhuila.andresnarvaez.IRepository.IBaseRepository;
import com.corhuila.andresnarvaez.IRepository.IDesafiosRepository;
import com.corhuila.andresnarvaez.IService.IDesafiosIService;


@Service
public class DesafiosService extends BaseService<Desafios> implements IDesafiosIService{

	@Override
	protected IBaseRepository<Desafios, Long> getRepository() {
		return repository;
	}

	@Autowired
	private IDesafiosRepository repository;

}