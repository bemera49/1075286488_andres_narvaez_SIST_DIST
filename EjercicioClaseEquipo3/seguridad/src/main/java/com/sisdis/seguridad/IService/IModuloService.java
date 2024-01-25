package com.sisdis.seguridad.IService;

import java.util.List;
import java.util.Optional;

import com.sisdis.seguridad.Entity.Modulo;

public interface IModuloService {

	//Obtener todo
	public List<Modulo> all();
	
	//Obtener por ID
	public Optional<Modulo> findById(Long id);
 	
	//Crear
	public Modulo save(Modulo Modulo);
	
	//Modificar
	public void update(Modulo Modulo, Long id);
	
	//Eliminar Físico
	public void deletePhysical(Long id);
	
	//Eliminar lógico
	public void deleteLogical(Long id);
}
