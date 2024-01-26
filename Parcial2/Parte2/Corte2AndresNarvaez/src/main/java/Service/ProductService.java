package Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import IRepository.IProductRepository;
import IService.IProductService;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductRepository repository;
	
	@Override
	public List<Product> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Product> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Product save(Product Product) {
		
		Product.setFechaCreacion(LocalDateTime.now());		
		return repository.save(Product);
	}

	@Override
	public void update(Product Product, Long id) {
		//validar si existe.            
        Optional<Product> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
            Product ProductUpdate = op.get();
            ProductUpdate.setTipoDocumento(Product.getTipoDocumento());
            ProductUpdate.setDocumento(Product.getDocumento());
            ProductUpdate.setNombre(Product.getNombre());
            ProductUpdate.setApellido(Product.getApellido());
            ProductUpdate.setCorreo(Product.getCorreo());
            ProductUpdate.setDireccion(Product.getDireccion());
            ProductUpdate.setEstado(Product.getEstado());
            ProductUpdate.setFechaModificacion(LocalDateTime.now());
            
            //Actualizar el objeto
            repository.save(ProductUpdate);
        }
        
        
	}

	@Override
	public void deletePhysical(Long id) {
		repository.deleteById(id);	
	}

	@Override
	public void deleteLogical(Long id) {
		//validar si existe.            
        Optional<Product> op = repository.findById(id);		
        
        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
        	 //Crear nuevo objeto que va a contener los datos que se van actualizar
            Product ProductUpdate = op.get();
            ProductUpdate.setFechaEliminacion(LocalDateTime.now());
            
            //Actualizar el objeto
            repository.save(ProductUpdate);
        }		
	}	