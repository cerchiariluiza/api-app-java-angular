package io.github.luizacerchiari.clientes.model.repository;

import io.github.luizacerchiari.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
