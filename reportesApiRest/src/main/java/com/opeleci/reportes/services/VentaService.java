
package com.opeleci.reportes.services;

import com.opeleci.reportes.entities.Ventas;
import com.opeleci.reportes.entities.VentasTotales;
import com.opeleci.reportes.repositories.VentaRepository;
import com.opeleci.reportes.repositories.VentaTotalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    
    @Autowired
    VentaRepository ventaRepository;
    
    @Autowired
    VentaTotalRepository ventaTotalRepository;
    
    public List <Ventas> ListarVentasAnioMoneda(int ANIO, String MONEDA){
        
        return ventaRepository.ListarVentasAnioMoneda(ANIO, MONEDA);
    };
            
    public List <VentasTotales> ListarVentasTotalesAnioMoneda(int ANIO, String MONEDA){
        
        return ventaTotalRepository.ListarVentasTotalesAnioMoneda(ANIO, MONEDA);
    }
}
