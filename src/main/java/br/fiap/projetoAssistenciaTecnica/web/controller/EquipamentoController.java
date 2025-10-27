package br.fiap.projetoAssistenciaTecnica.web.controller;

import br.fiap.projetoAssistenciaTecnica.domain.Equipamento;
import br.fiap.projetoAssistenciaTecnica.service.EquipamentoService;
import br.fiap.projetoAssistenciaTecnica.web.dto.EquipamentoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
    private final EquipamentoService service;

    public EquipamentoController(EquipamentoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Equipamento cadastrar(@RequestBody EquipamentoDTO eqDTO) {
        return service.cadastrar(eqDTO);
    }

    @GetMapping
    public List<Equipamento> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Equipamento buscarId(@PathVariable Long id) {
        return service.buscarId(id);
    }
}
