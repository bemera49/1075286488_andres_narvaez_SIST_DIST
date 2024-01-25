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

import com.sisdis.seguridad.Entity.Modulo;
import com.sisdis.seguridad.IService.IModuloService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/seguridad/Modulo")
public class ModuloController {

	@Autowired
	private IModuloService service;
	
	 @GetMapping()
     public List<Modulo> all() {
         return service.all();
     }
	 
	 @GetMapping("{id}")
     public Optional<Modulo> findById(@PathVariable Long id) {
         return service.findById(id);
     }
	 
	 @PostMapping
     @ResponseStatus(code = HttpStatus.CREATED)
     public Modulo save(@RequestBody Modulo Modulo) {
         return service.save(Modulo);
     }
	 
	 @PutMapping("{id}")
     @ResponseStatus(code = HttpStatus.OK)
     public void update(@RequestBody Modulo Modulo, @PathVariable Long id) {
         service.update(Modulo, id);
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
