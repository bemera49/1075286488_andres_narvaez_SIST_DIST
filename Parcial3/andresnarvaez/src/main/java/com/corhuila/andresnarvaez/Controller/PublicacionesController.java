package com.corhuila.andresnarvaez.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.andresnarvaez.Entity.Publicacion;
import com.corhuila.andresnarvaez.IService.IPublicacionesIService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/redSocial/Publicaciones")
public class PublicacionesController extends BaseController<Publicacion,IPublicacionesIService> {
	 public PublicacionesController(IPublicacionesIService service) {
	        super(service, "Publicacion");
	 }
}
