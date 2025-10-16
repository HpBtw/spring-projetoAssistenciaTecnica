package br.fiap.projetoAssistenciaTecnica.web.controller;

import br.fiap.projetoAssistenciaTecnica.domain.Cliente;
import br.fiap.projetoAssistenciaTecnica.service.ClienteService;
import br.fiap.projetoAssistenciaTecnica.web.dto.ClienteDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

}
