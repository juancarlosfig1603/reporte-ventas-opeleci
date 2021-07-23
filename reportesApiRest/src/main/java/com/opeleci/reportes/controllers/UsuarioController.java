
package com.opeleci.reportes.controllers;

import com.opeleci.reportes.entities.Usuarios;
import com.opeleci.reportes.services.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Ventas/Usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Valida/{Usuario},{Clave}")
    
    public ResponseEntity<List<Usuarios>> Acceso(@PathVariable ("Usuario") String Usuario, @PathVariable("Clave") String Clave){
        List<Usuarios> acceso = usuarioService.accesoUsuario(Usuario, Clave);
        
        return new ResponseEntity (acceso, HttpStatus.OK);
    }
}
