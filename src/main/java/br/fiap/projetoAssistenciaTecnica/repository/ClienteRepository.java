package br.fiap.projetoAssistenciaTecnica.repository;

import br.fiap.projetoAssistenciaTecnica.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    //@Query("select e from java_cliente where cliente.email = email")
    public Optional<Cliente> findByEmail(String email);
}
