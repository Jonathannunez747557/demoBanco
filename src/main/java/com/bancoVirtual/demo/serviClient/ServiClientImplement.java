package com.bancoVirtual.demo.serviClient;

import com.bancoVirtual.demo.ClienteService;
import com.bancoVirtual.demo.model.Cliente;
import com.bancoVirtual.demo.repository.ClienteRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiClientImplement implements ClienteService {

    @Autowired
    private ClienteRepo clienteRepo;

    @Override
    public Cliente createClient(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente findClientByID(Long id) {
        return clienteRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("No se encontro ningun cliente con el id:" + id));
    }

    @Override
    public List<Cliente> findAllCliente() {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente updateClient(Long id, Cliente cliente) {
        Cliente existingCliente = clienteRepo.findById(id)
                .orElseThrow(() -> new BusinessException("Usuario no encontrado por ID"));

        BeanUtils.copyProperties(cliente, existingCliente, "id");
        return clienteRepo.save(existingCliente);
    }

    @Override
    public void saveCliente(Cliente clienteNuevo){
        clienteRepo.save(clienteNuevo);
    }

    @Override
    public Void deleteCliente(Long id) {
        return null;
    }
}
