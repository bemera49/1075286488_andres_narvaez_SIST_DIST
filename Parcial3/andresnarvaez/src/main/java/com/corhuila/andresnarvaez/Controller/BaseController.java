package com.corhuila.andresnarvaez.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.corhuila.andresnarvaez.DTO.ApiResponseDto;
import com.corhuila.andresnarvaez.Entity.Auditoria;
import com.corhuila.andresnarvaez.IService.IBaseIService;

public abstract class BaseController<T extends Auditoria, S extends IBaseIService<T>> {
	protected S service;
	protected String entityName;
	protected BaseController(S service, String entityName) {
			this.service = service;
		 	this.entityName = entityName;
	}

	@GetMapping("Obtener")
	public ResponseEntity<ApiResponseDto<List<T>>> findByStateTrue() {
		try {
			return ResponseEntity.ok(new ApiResponseDto<List<T>>("Datos obtenidos", service.findByStateTrue(), true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<List<T>>(e.getMessage(), null, false));
		}
	}

	@GetMapping("ObtenerId/{id}")
	public ResponseEntity<ApiResponseDto<T>> show(@PathVariable Long id) {
		try {
			T entity = service.findById(id);
			return ResponseEntity.ok(new ApiResponseDto<T>("Registro encontrado", entity, true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<T>(e.getMessage(), null, false));
		}
	}

	@PostMapping("Guardar")
	public ResponseEntity<ApiResponseDto<T>> save(@RequestBody T entity) {
		try {
			return ResponseEntity.ok(new ApiResponseDto<T>("Datos guardados", service.save(entity), true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<T>(e.getMessage(), null, false));
		}
	}

	@PutMapping("Modificar/{id}")
	public ResponseEntity<ApiResponseDto<T>> update(@PathVariable Long id, @RequestBody T entity) {
		try {
			service.update(id, entity);
			return ResponseEntity.ok(new ApiResponseDto<T>("Datos actualizados", null, true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<T>(e.getMessage(), null, false));
		}
	}

	@DeleteMapping("Eliminar/{id}")
	public ResponseEntity<ApiResponseDto<T>> delete(@PathVariable Long id) {
		try {
			System.out.println(id);
			service.delete(id);
			return ResponseEntity.ok(new ApiResponseDto<T>("Registro eliminado", null, true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<T>(e.getMessage(), null, false));
		}
	}
}