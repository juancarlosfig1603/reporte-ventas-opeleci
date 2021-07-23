
package com.opeleci.reportes.repositories;

import com.opeleci.reportes.entities.Productos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProductoRepository extends JpaRepository<Productos, Integer> {
    
    @Query(value = "{call SP_SEL_TOP_VENTASPRODUCTOS_1(:ANIO)}", nativeQuery = true ) 
    List<Productos> ListarTopProductos(
    @Param("ANIO") int ANIO);
}
