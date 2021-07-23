
package com.opeleci.reportes.repositories;

import com.opeleci.reportes.entities.Usuarios;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

    
    public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {
    
    @Query(value = "{call SP_SEL_VALIDA_INGRESO_USUARIO(:CODIGO, :CLAVE)}", nativeQuery = true ) 
    List<Usuarios> AccesoUsuario(
        @Param("CODIGO") String CODIGO,
        @Param("CLAVE") String CLAVE
    );
}
