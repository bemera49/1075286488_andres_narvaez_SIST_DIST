package com.sisdis.seguridad.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sisdis.seguridad.Entity.Vista;

@Repository
public interface IVistaRepository extends JpaRepository<Vista, Long>{
    
}
