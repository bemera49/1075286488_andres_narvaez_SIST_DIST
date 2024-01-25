package com.sisdis.seguridad.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisdis.seguridad.Entity.Vista;
import com.sisdis.seguridad.IRepository.IVistaRepository;
import com.sisdis.seguridad.IService.IVistaService;

@Service
public class VistaService implements IVistaService {

	@Autowired
	private IVistaRepository repository;
	
	@Override
	public List<Vista> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Vista> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Vista save(Vista Vista) {
		
		Vista.setFechaCreacion(LocalDateTime.now());		
		return repository.save(Vista);
	}

	@Override
	public void update(Vista Vista, Long id) {
		//validar si existe.            
        Optional<Vista> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
            Vista VistaUpdate = op.get();
            VistaUpdate.setCodigo(Vista.getCodigo()); 
            VistaUpdate.setNombre(Vista.getNombre());
            VistaUpdate.setDescripcion(Vista.getDescripcion());
            VistaUpdate.setRuta(Vista.getRuta());
            VistaUpdate.setEstado(Vista.getEstado());
            VistaUpdate.setFechaModificacion(LocalDateTime.now());
            //Actualizar el objeto
            repository.save(VistaUpdate);
        }
        
        
	}

	@Override
	public void deletePhysical(Long id) {
		repository.deleteById(id);	
	}

	@Override
	public void deleteLogical(Long id) {
		//validar si existe.            
        Optional<Vista> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
            Vista VistaUpdate = op.get();
            VistaUpdate.setFechaEliminacion(LocalDateTime.now());
            
            //Actualizar el objeto
            repository.save(VistaUpdate);
        }		
	}	
}
