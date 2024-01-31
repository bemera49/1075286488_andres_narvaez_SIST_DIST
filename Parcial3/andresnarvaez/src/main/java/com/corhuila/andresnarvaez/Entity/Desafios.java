package com.corhuila.andresnarvaez.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "desafios")
public class Desafios extends Auditoria{
    
	
    @Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
    
    @Column(name = "fecha_inicio", nullable = true)
	private LocalDateTime fechaInicio;

    @Column(name = "fecha_fin", nullable = true)
	private LocalDateTime fechaFin;
    
	@Column(name = "descipcion", length = 50, nullable = false, unique = true)
	private String descipcion;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "creador_id", nullable = false, unique = true) 
    private Usuario usuarioId;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    
}
