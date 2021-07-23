
package com.opeleci.reportes.services;

import com.opeleci.reportes.entities.VentasDiarias;
import com.opeleci.reportes.repositories.VentaDiariaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaDiariaService {
    
    @Autowired
    VentaDiariaRepository ventaDiariaRepository;
    
    public List <VentasDiarias> ListarVentasDiarias(int ANIO, int MES, String MONEDA){
        
        return ventaDiariaRepository.ListarVentasDiarias(ANIO, MES, MONEDA);
    }
}
