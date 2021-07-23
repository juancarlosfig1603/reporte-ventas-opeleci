
package com.opeleci.reportes.repositories;

import com.opeleci.reportes.entities.Clientes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Clientes, Integer> {
    
    @Query(value = "{call SP_SEL_TOP_VENTASCLIENTES()}", nativeQuery = true ) 
    List<Clientes> ListarMejoresClientes();
    
}
