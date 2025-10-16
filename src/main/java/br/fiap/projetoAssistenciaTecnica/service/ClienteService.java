package br.fiap.projetoAssistenciaTecnica.service;

import br.fiap.projetoAssistenciaTecnica.domain.Cliente;
import br.fiap.projetoAssistenciaTecnica.repository.ClienteRepository;
import br.fiap.projetoAssistenciaTecnica.web.dto.ClienteDTO;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public Cliente cadastrar(ClienteDTO clDTO) {
        Cliente cl = new Cliente();

        cl.setNome(clDTO.getNome());
        cl.setEmail(clDTO.getEmail());
        cl.setSenha(clDTO.getSenha());
        cl.setTelefone(clDTO.getTelefone());

        return repo.save(cl); // metodo insert no banco
    }
}
