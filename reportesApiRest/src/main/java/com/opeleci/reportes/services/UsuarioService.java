
package com.opeleci.reportes.services;

import com.opeleci.reportes.entities.Usuarios;
import com.opeleci.reportes.repositories.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public List<Usuarios> accesoUsuario(String Usuario, String Clave){
        
        return usuarioRepository.AccesoUsuario(Usuario, Clave);
    }
}
