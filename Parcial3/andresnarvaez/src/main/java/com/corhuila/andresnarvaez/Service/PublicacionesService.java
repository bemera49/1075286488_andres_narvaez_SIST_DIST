package com.corhuila.andresnarvaez.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.andresnarvaez.Entity.Publicacion;
import com.corhuila.andresnarvaez.IRepository.IBaseRepository;
import com.corhuila.andresnarvaez.IRepository.IPublicacionesRepository;
import com.corhuila.andresnarvaez.IService.IPublicacionesIService;
@Service
public class PublicacionesService extends BaseService<Publicacion> implements IPublicacionesIService{

	@Override
	protected IBaseRepository<Publicacion, Long> getRepository() {
		return repository;
	}

	@Autowired
	private IPublicacionesRepository repository;

}
