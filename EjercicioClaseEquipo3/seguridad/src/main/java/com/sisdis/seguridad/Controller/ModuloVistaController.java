package com.sisdis.seguridad.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sisdis.seguridad.Entity.ModuloVista;
import com.sisdis.seguridad.IService.IModuloVistaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/seguridad/ModuloVista")
public class ModuloVistaController {

	@Autowired
	private IModuloVistaService service;
	
	 @GetMapping()
     public List<ModuloVista> all() {
         return service.all();
     }
	 
	 @GetMapping("{id}")
     public Optional<ModuloVista> findById(@PathVariable Long id) {
         return service.findById(id);
     }
	 
	 @PostMapping
     @ResponseStatus(code = HttpStatus.CREATED)
     public ModuloVista save(@RequestBody ModuloVista ModuloVista) {
         return service.save(ModuloVista);
     }
	 
	 @PutMapping("{id}")
     @ResponseStatus(code = HttpStatus.OK)
     public void update(@RequestBody ModuloVista ModuloVista, @PathVariable Long id) {
         service.update(ModuloVista, id);
     }
	 
	 @PutMapping("deleteLogical/{id}")
     @ResponseStatus(code = HttpStatus.OK)
     public void deleteLogical(@PathVariable Long id) {
         service.deleteLogical(id);
     }
	 
	 @DeleteMapping("{id}")
     @ResponseStatus(code = HttpStatus.NO_CONTENT)
     public void deletePhysical(@PathVariable Long id) {
         service.deletePhysical(id);
     }
}
