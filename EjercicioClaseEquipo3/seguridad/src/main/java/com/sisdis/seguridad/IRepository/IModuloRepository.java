package com.sisdis.seguridad.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sisdis.seguridad.Entity.Modulo;

@Repository
public interface IModuloRepository extends JpaRepository<Modulo, Long>{
    
}
