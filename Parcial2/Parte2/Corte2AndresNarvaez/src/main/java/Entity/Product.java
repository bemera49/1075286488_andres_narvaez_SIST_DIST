package Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_1075286488")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", length = 11, nullable = false, unique = true)
	private String nombre;
	
	@Column(name = "description", length = 200, nullable = false)
	private String description;
	
	@Column(name = "estado", nullable = true)
	private Boolean estado;
	
	@Column(name = "fecha_creacion", nullable = true)
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fecha_modificacion", nullable = true)
	private LocalDateTime fechaModificacion;
	
	@Column(name = "fecha_eliminacion", nullable = true)
	private LocalDateTime fechaEliminacion;	
	
	@Column(name = "product_creacion", nullable = true)
	private Long productCreacion;
	
	@Column(name = "product_modificacion", nullable = true)
	private Long productModificacion;
	
	@Column(name = "productEliminacion", nullable = true)
	private Long productEliminacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public LocalDateTime getFechaEliminacion() {
		return fechaEliminacion;
	}

	public void setFechaEliminacion(LocalDateTime fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}

	public Long getProductCreacion() {
		return productCreacion;
	}

	public void setProductCreacion(Long productCreacion) {
		this.productCreacion = productCreacion;
	}

	public Long getProductModificacion() {
		return productModificacion;
	}

	public void setProductModificacion(Long productModificacion) {
		this.productModificacion = productModificacion;
	}

	public Long getProductEliminacion() {
		return productEliminacion;
	}

	public void setProductEliminacion(Long productEliminacion) {
		this.productEliminacion = productEliminacion;
	}
	
	
	
}

