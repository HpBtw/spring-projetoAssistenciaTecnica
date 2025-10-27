package br.fiap.projetoAssistenciaTecnica.web.dto;

import br.fiap.projetoAssistenciaTecnica.domain.Cliente;
import lombok.Data;

import java.time.LocalDate;

// @getter gera somente gets
@Data // getters, setters, toString, equals, hashCode
// PARA USAR ISSO, É NECESSARIO INSTALAR O PLUGIN LOMBOK
public class EquipamentoDTO {
    private Long id;
    private Long idCliente;
    private String tipo;
    private String marca;
    private String modelo;
    private Long numSerie;
    private LocalDate dataRegistro;

}
