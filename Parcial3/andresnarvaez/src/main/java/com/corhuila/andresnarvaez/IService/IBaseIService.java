package com.corhuila.andresnarvaez.IService;

import java.util.List;

import com.corhuila.andresnarvaez.Entity.Auditoria;

public interface IBaseIService <T extends Auditoria>{

	//Obtener todo
	List<T> all();
	
	//Obtner unicamente los datos con estado true
    List<T> findByStateTrue();
    
    //Obtener por id
    T findById(Long id) throws Exception;
    
    //Guardar
    T save(T entity) throws Exception;
    
    //Actualizar
    void update(Long id, T entity) throws Exception;
    
    //Eliminar
    void delete(Long id) throws Exception;
}

