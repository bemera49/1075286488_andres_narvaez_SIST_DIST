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

import com.sisdis.seguridad.Entity.Vista;
import com.sisdis.seguridad.IService.IVistaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/seguridad/Vista")
public class VistaController {

	@Autowired
	private IVistaService service;
	
	 @GetMapping()
     public List<Vista> all() {
         return service.all();
     }
	 
	 @GetMapping("{id}")
     public Optional<Vista> findById(@PathVariable Long id) {
         return service.findById(id);
     }
	 
	 @PostMapping
     @ResponseStatus(code = HttpStatus.CREATED)
     public Vista save(@RequestBody Vista Vista) {
         return service.save(Vista);
     }
	 
	 @PutMapping("{id}")
     @ResponseStatus(code = HttpStatus.OK)
     public void update(@RequestBody Vista Vista, @PathVariable Long id) {
         service.update(Vista, id);
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
