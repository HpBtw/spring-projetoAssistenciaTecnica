package br.fiap.projetoAssistenciaTecnica.web.controller;

import br.fiap.projetoAssistenciaTecnica.domain.Cliente;
import br.fiap.projetoAssistenciaTecnica.domain.Equipamento;
import br.fiap.projetoAssistenciaTecnica.service.ClienteService;
import br.fiap.projetoAssistenciaTecnica.web.dto.ClienteDTO;
import br.fiap.projetoAssistenciaTecnica.web.dto.EquipamentoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // solicita um status para casos de finalização de metodo
    public Cliente cadastrar(@RequestBody ClienteDTO clDTO) {

        return service.cadastrar(clDTO);
    }

    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    @GetMapping("/{id}") // usa-se as chaves para acessar um valor dentro de "/cliente"
    public Cliente buscarId(@PathVariable Long id) {
        return service.buscarId(id);
    }

//    @GetMapping("/{idCliente}/equipamento")
//    public List<EquipamentoDTO> listarEquipamentoPorCliente(@PathVariable Long idCliente) {
//        return service.listarEquipamentoPorCliente(idCliente);
//    }
}
