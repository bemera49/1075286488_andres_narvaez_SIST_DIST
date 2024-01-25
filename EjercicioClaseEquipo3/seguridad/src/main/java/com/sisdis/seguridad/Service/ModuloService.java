package com.sisdis.seguridad.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisdis.seguridad.Entity.Modulo;
import com.sisdis.seguridad.IRepository.IModuloRepository;
import com.sisdis.seguridad.IService.IModuloService;

@Service
public class ModuloService implements IModuloService {

	@Autowired
	private IModuloRepository repository;
	
	@Override
	public List<Modulo> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Modulo> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Modulo save(Modulo Modulo) {
		
		Modulo.setFechaCreacion(LocalDateTime.now());		
		return repository.save(Modulo);
	}

	@Override
	public void update(Modulo Modulo, Long id) {
		//validar si existe.            
        Optional<Modulo> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
            Modulo ModuloUpdate = op.get();
            ModuloUpdate.setCodigo(Modulo.getCodigo()); 
            ModuloUpdate.setNombre(Modulo.getNombre());
            ModuloUpdate.setDescripcion(Modulo.getDescripcion());
            ModuloUpdate.setRuta(Modulo.getRuta());
            ModuloUpdate.setEstado(Modulo.getEstado());
            ModuloUpdate.setFechaModificacion(LocalDateTime.now());
            //Actualizar el objeto
            repository.save(ModuloUpdate);
        }
        
        
	}

	@Override
	public void deletePhysical(Long id) {
		repository.deleteById(id);	
	}

	@Override
	public void deleteLogical(Long id) {
		//validar si existe.            
        Optional<Modulo> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
            Modulo ModuloUpdate = op.get();
            ModuloUpdate.setFechaEliminacion(LocalDateTime.now());
            
            //Actualizar el objeto
            repository.save(ModuloUpdate);
        }		
	}	
}
