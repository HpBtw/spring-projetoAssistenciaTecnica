package br.fiap.projetoAssistenciaTecnica.repository;

import br.fiap.projetoAssistenciaTecnica.domain.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
}
