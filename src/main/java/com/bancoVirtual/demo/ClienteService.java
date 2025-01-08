package com.bancoVirtual.demo;

import com.bancoVirtual.demo.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente createClient(Cliente cliente);
    Cliente findClientByID(Long id);
    List<Cliente>findAllCliente();
    Cliente updateClient(Long id, Cliente cliente);
    void saveCliente(Cliente clienteNuevo);
    Void deleteCliente(Long id);

}
