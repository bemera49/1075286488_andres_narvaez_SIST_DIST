package com.corhuila.andresnarvaez.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.andresnarvaez.Entity.Auditoria;

@Repository
public interface IBaseRepository <T extends Auditoria, ID> extends JpaRepository<T, Long> {
  
}
