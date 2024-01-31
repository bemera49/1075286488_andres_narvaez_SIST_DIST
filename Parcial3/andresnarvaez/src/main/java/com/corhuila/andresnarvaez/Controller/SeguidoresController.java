package com.corhuila.andresnarvaez.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.corhuila.andresnarvaez.Entity.Seguidores;
import com.corhuila.andresnarvaez.IService.ISeguidoresIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/redSocial/Seguidores")
public class SeguidoresController extends BaseController<Seguidores,ISeguidoresIService> {
	 public SeguidoresController(ISeguidoresIService service) {
	        super(service, "Seguidores");
	 }
}
