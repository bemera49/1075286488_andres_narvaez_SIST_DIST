package com.sisdis.seguridad.IService;

import java.util.List;
import java.util.Optional;

import com.sisdis.seguridad.Entity.ModuloVista;

public interface IModuloVistaService {

	//Obtener todo
	public List<ModuloVista> all();
	
	//Obtener por ID
	public Optional<ModuloVista> findById(Long id);
 	
	//Crear
	public ModuloVista save(ModuloVista ModuloVista);
	
	//Modificar
	public void update(ModuloVista ModuloVista, Long id);
	
	//Eliminar Físico
	public void deletePhysical(Long id);
	
	//Eliminar lógico
	public void deleteLogical(Long id);
}
