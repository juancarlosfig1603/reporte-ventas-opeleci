
package com.opeleci.reportes.repositories;

import com.opeleci.reportes.entities.VentasTotales;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VentaTotalRepository extends JpaRepository<VentasTotales, Integer>{
    
    @Query(value = "{call SP_SEL_VENTASTOTALES_ANIO_MONEDA_1(:ANIO, :MONEDA)}", nativeQuery = true ) 
    List<VentasTotales> ListarVentasTotalesAnioMoneda(
            @Param("ANIO") int ANIO, 
            @Param("MONEDA") String MONEDA
    );
}
