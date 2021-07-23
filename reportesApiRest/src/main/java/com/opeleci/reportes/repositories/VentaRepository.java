
package com.opeleci.reportes.repositories;


import com.opeleci.reportes.entities.Ventas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface VentaRepository extends JpaRepository<Ventas, Integer> {
    
    @Query(value = "{call SP_SEL_VENTASTOTALES_ANIO_MONEDA(:ANIO, :MONEDA)}", nativeQuery = true ) 
    List<Ventas> ListarVentasAnioMoneda(
            @Param("ANIO") int ANIO, 
            @Param("MONEDA") String MONEDA
    );
}
