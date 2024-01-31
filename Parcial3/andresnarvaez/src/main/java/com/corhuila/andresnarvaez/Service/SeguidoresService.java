package com.corhuila.andresnarvaez.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.andresnarvaez.Entity.Seguidores;
import com.corhuila.andresnarvaez.IRepository.IBaseRepository;
import com.corhuila.andresnarvaez.IRepository.ISeguidoresRepository;
import com.corhuila.andresnarvaez.IService.ISeguidoresIService;



@Service
public class SeguidoresService extends BaseService<Seguidores> implements ISeguidoresIService{

	@Override
	protected IBaseRepository<Seguidores, Long> getRepository() {
		return repository;
	}

	@Autowired
	private ISeguidoresRepository repository;
}
