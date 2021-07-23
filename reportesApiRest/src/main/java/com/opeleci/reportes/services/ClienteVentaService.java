

package com.opeleci.reportes.services;

import com.opeleci.reportes.entities.ClientesVentas;
import com.opeleci.reportes.repositories.ClienteVentasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteVentaService {
    
    @Autowired
    ClienteVentasRepository clienteVentasRepository;
    
    public List <ClientesVentas> ListarVentasClientes(int ANIO, int MES, String MONEDA){
        
        return clienteVentasRepository.ListarVentasClientes(ANIO, MES, MONEDA);
    }
    
}
