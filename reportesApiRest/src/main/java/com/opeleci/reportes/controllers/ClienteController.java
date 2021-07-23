
package com.opeleci.reportes.controllers;

import com.opeleci.reportes.entities.Clientes;
import com.opeleci.reportes.entities.ClientesVentas;
import com.opeleci.reportes.services.ClienteService;
import com.opeleci.reportes.services.ClienteVentaService;
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
@RequestMapping("Ventas/Clientes")
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Top")    
    public ResponseEntity<List<Clientes>> lista(){
        List<Clientes> lista = clienteService.ListarMejoresClientes();
        
        return new ResponseEntity (lista, HttpStatus.OK);
    }
    
    
    @Autowired
    ClienteVentaService clienteVentaService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Totales/{Anio},{Mes},{Moneda}")
    public ResponseEntity<List<ClientesVentas>> VentasClientes(@PathVariable ("Anio") Integer Anio, @PathVariable ("Mes") Integer Mes, @PathVariable("Moneda") String Moneda){
        List<ClientesVentas> lista = clienteVentaService.ListarVentasClientes(Anio, Mes, Moneda);
        return new ResponseEntity (lista, HttpStatus.OK);
    }
}
