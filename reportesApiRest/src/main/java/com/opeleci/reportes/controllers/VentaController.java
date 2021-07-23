
package com.opeleci.reportes.controllers;

import com.opeleci.reportes.entities.Ventas;
import com.opeleci.reportes.entities.VentasDiarias;
import com.opeleci.reportes.entities.VentasTotales;
import com.opeleci.reportes.services.VentaDiariaService;
import com.opeleci.reportes.services.VentaService;
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
@RequestMapping("/Ventas")
public class VentaController {
    
    @Autowired
    VentaService ventaService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Totales/Grid/{Anio},{Moneda}")
    public ResponseEntity<List<Ventas>> Lista(@PathVariable ("Anio") Integer Anio, @PathVariable("Moneda") String Moneda){
        List<Ventas> lista = ventaService.ListarVentasAnioMoneda(Anio, Moneda);
        return new ResponseEntity (lista, HttpStatus.OK);
        
    };
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Totales/{Anio},{Moneda}")
    public ResponseEntity<List<VentasTotales>> ListaTotales(@PathVariable ("Anio") Integer Anio, @PathVariable("Moneda") String Moneda){
        List<VentasTotales> listaTotales = ventaService.ListarVentasTotalesAnioMoneda(Anio, Moneda);
        return new ResponseEntity (listaTotales, HttpStatus.OK);
        
    };
    
    @Autowired
    VentaDiariaService ventaDiariaService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Diarias/{Anio},{Mes},{Moneda}")
    public ResponseEntity<List<VentasDiarias>> ListaDiaria(@PathVariable ("Anio") Integer Anio, @PathVariable ("Mes") Integer Mes, @PathVariable("Moneda") String Moneda){
        List<VentasDiarias> lista = ventaDiariaService.ListarVentasDiarias(Anio, Mes, Moneda);
        return new ResponseEntity (lista, HttpStatus.OK);
    }
}
