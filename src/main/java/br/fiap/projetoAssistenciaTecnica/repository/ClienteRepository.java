package br.fiap.projetoAssistenciaTecnica.repository;

import br.fiap.projetoAssistenciaTecnica.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
