
package com.opeleci.reportes.repositories;

import com.opeleci.reportes.entities.ClientesVentas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteVentasRepository extends JpaRepository<ClientesVentas, Integer> {
    
    @Query(value = "{call SP_SEL_VENTAS_POR_CLIENTE(:ANIO, :MES, :MONEDA)}", nativeQuery = true ) 
    List<ClientesVentas> ListarVentasClientes(
            @Param("ANIO") int ANIO,
            @Param("MES") int MES,
            @Param("MONEDA") String MONEDA
    );
}
