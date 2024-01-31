package com.corhuila.andresnarvaez.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.andresnarvaez.Entity.Desafios;
import com.corhuila.andresnarvaez.IService.IDesafiosIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/redSocial/Desafios")
public class DesafiosController extends BaseController<Desafios,IDesafiosIService> {
	 public DesafiosController(IDesafiosIService service) {
	        super(service, "Desafios");
	 }
}