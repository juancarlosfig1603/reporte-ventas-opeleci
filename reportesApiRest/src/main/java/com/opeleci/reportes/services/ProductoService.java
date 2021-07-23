
package com.opeleci.reportes.services;

import com.opeleci.reportes.entities.Productos;
import com.opeleci.reportes.repositories.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    
    @Autowired
    ProductoRepository productoRepository;
    
    public List<Productos> listarProductos(int ANIO){
        
        return productoRepository.ListarTopProductos(ANIO);
    }
    
}
