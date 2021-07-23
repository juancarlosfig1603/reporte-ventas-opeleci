
package com.opeleci.reportes.controllers;

import com.opeleci.reportes.entities.Productos;
import com.opeleci.reportes.services.ProductoService;
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
@RequestMapping("Ventas/Productos")
public class ProductoController {
    
    @Autowired
    ProductoService productoService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Top/{Anio}")
    
    public ResponseEntity<List<Productos>> lista(@PathVariable ("Anio") Integer Anio){
        List<Productos> lista = productoService.listarProductos(Anio);
        
        return new ResponseEntity (lista, HttpStatus.OK);
    }    
}
