package io.github.clopesreg.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.clopesreg.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
