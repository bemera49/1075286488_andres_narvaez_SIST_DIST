package com.corhuila.andresnarvaez.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "seguidores")
public class Seguidores extends Auditoria {

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "seguidor_id", nullable = false, unique = true)
	private Usuario seguidorId;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "seguidor_usuario_id", nullable = false, unique = true)
	private Usuario seguidorUsuarioId;
}
