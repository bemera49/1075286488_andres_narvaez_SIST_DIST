package IService;

import java.util.List;
import java.util.Optional;

import Entity.Product;

public interface ICustomerService {

	//Obtener todo
	public List<Product> all();
	
	//Obtener por ID
	public Optional<Product> findById(Long id);
 	
	//Crear
	public Product save(Product product);
	
	//Modificar
	public void update(Product product, Long id);
	
	//Eliminar Físico
	public void deletePhysical(Long id);
	
	//Eliminar lógico
	public void deleteLogical(Long id);
}
