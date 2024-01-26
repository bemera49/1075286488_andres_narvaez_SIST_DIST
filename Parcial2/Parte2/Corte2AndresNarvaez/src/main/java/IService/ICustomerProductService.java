package IService;

import java.util.List;
import java.util.Optional;

import Entity.CustomerProduct;


public interface ICustomerProductService {

	//Obtener todo
	public List<CustomerProduct> all();
	
	//Obtener por ID
	public Optional<CustomerProduct> findById(Long id);
 	
	//Crear
	public CustomerProduct save(CustomerProduct customerProduct);
	
	//Modificar
	public void update(CustomerProduct customerProduct, Long id);
	
	//Eliminar Físico
	public void deletePhysical(Long id);
	
	//Eliminar lógico
	public void deleteLogical(Long id);
}

