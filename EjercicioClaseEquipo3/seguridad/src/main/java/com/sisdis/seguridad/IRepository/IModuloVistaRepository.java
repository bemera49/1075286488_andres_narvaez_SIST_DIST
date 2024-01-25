package com.sisdis.seguridad.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sisdis.seguridad.Entity.ModuloVista;

@Repository
public interface IModuloVistaRepository extends JpaRepository<ModuloVista, Long>{
    
}