package com.sisdis.seguridad.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisdis.seguridad.Entity.ModuloVista;
import com.sisdis.seguridad.IRepository.IModuloVistaRepository;
import com.sisdis.seguridad.IService.IModuloVistaService;

@Service
public class ModuloVistaService implements IModuloVistaService {

	@Autowired
	private IModuloVistaRepository repository;
	
	@Override
	public List<ModuloVista> all() {
		return repository.findAll();
	}

	@Override
	public Optional<ModuloVista> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public ModuloVista save(ModuloVista moduloVista) {
		
		moduloVista.setModuloId(moduloVista.getModuloId());	
		moduloVista.setVistaId(moduloVista.getVistaId());	    
        // ModuloVista.setFechaCreacion(LocalDateTime.now());
		return repository.save(moduloVista);
	}

	@Override
	public void update(ModuloVista ModuloVista, Long id) {
		//validar si existe.            
        Optional<ModuloVista> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
            ModuloVista ModuloVistaUpdate = op.get();
            ModuloVistaUpdate.setModuloId(ModuloVista.getModuloId()); 
            ModuloVistaUpdate.setVistaId(ModuloVista.getVistaId());
            //Actualizar el objeto
            repository.save(ModuloVistaUpdate);
        }        
	}

	@Override
	public void deletePhysical(Long id) {
		repository.deleteById(id);	
	}

	@Override
	public void deleteLogical(Long id) {
		//validar si existe.            
        Optional<ModuloVista> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
             System.out.println("No se puede eliminar, solo desactivar");

        }		
	}	
}
