package com.corhuila.andresnarvaez.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.andresnarvaez.Entity.Usuario;
import com.corhuila.andresnarvaez.IService.IUsuarioIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/redSocial/Usuario")
public class UsuarioController extends BaseController<Usuario,IUsuarioIService> {
	 public UsuarioController(IUsuarioIService service) {
	        super(service, "Usuario");
	 }
}


