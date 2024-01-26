package Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_1075286488")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", length = 11, nullable = false, unique = true)
	private String nombre;
	
	@Column(name = "email", length = 200, nullable = false)
	private String email;
	
	@Column(name = "phone", length = 200, nullable = false)
	private String phone;
	
	@Column(name = "address", length = 200, nullable = false)
	private String address;
	
	@Column(name = "estado", nullable = true)
	private Boolean estado;
	
	@Column(name = "fecha_creacion", nullable = true)
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fecha_modificacion", nullable = true)
	private LocalDateTime fechaModificacion;
	
	@Column(name = "fecha_eliminacion", nullable = true)
	private LocalDateTime fechaEliminacion;	
	
	@Column(name = "customer_creacion", nullable = true)
	private Long customerCreacion;
	
	@Column(name = "customer_modificacion", nullable = true)
	private Long customerModificacion;
	
	@Column(name = "customerEliminacion", nullable = true)
	private Long customerEliminacion;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Long getCustomerCreacion() {
		return customerCreacion;
	}

	public void setCustomerCreacion(Long customerCreacion) {
		this.customerCreacion = customerCreacion;
	}

	public Long getCustomerModificacion() {
		return customerModificacion;
	}

	public void setCustomerModificacion(Long customerModificacion) {
		this.customerModificacion = customerModificacion;
	}

	public Long getCustomerEliminacion() {
		return customerEliminacion;
	}

	public void setCustomerEliminacion(Long customerEliminacion) {
		this.customerEliminacion = customerEliminacion;
	}
	
	
	
}

