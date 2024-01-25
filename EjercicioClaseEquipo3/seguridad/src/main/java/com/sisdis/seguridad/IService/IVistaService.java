package com.sisdis.seguridad.IService;

import java.util.List;
import java.util.Optional;

import com.sisdis.seguridad.Entity.Vista;

public interface IVistaService {

	//Obtener todo
	public List<Vista> all();
	
	//Obtener por ID
	public Optional<Vista> findById(Long id);
 	
	//Crear
	public Vista save(Vista Vista);
	
	//Modificar
	public void update(Vista Vista, Long id);
	
	//Eliminar Físico
	public void deletePhysical(Long id);
	
	//Eliminar lógico
	public void deleteLogical(Long id);
}
