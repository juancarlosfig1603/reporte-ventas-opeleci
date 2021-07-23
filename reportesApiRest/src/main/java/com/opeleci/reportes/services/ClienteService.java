
package com.opeleci.reportes.services;

import com.opeleci.reportes.entities.Clientes;
import com.opeleci.reportes.repositories.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepository clienteRepository;
    
    public List<Clientes> ListarMejoresClientes(){
        
        return clienteRepository.ListarMejoresClientes();
    }
    
}
