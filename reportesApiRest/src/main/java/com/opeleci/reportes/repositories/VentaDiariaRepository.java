

package com.opeleci.reportes.repositories;

import com.opeleci.reportes.entities.VentasDiarias;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface VentaDiariaRepository extends JpaRepository<VentasDiarias, Integer>{
    
    @Query(value = "{call SP_SEL_VENTAS_DIARIAS_MONEDA_1(:ANIO, :MES, :MONEDA)}", nativeQuery = true ) 
    List<VentasDiarias> ListarVentasDiarias(
            @Param("ANIO") int ANIO,
            @Param("MES") int MES,
            @Param("MONEDA") String MONEDA
    );
}
