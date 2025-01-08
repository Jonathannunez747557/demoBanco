package com.bancoVirtual.demo.repository;

import com.bancoVirtual.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends JpaRepository <Cliente,Long >{


}
