package br.fiap.projetoAssistenciaTecnica.repository;

import br.fiap.projetoAssistenciaTecnica.domain.Equipamento;
import br.fiap.projetoAssistenciaTecnica.web.dto.ClienteDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
    public List<Equipamento> findByClienteId(Long idCliente);
}
