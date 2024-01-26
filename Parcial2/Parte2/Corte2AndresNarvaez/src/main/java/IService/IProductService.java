package IService;

import java.util.List;
import java.util.Optional;

import Entity.Customer;

public interface IProductService {

	//Obtener todo
	public List<Customer> all();
	
	//Obtener por ID
	public Optional<Customer> findById(Long id);
 	
	//Crear
	public Customer save(Customer customer);
	
	//Modificar
	public void update(Customer customer, Long id);
	
	//Eliminar Físico
	public void deletePhysical(Long id);
	
	//Eliminar lógico
	public void deleteLogical(Long id);
}
