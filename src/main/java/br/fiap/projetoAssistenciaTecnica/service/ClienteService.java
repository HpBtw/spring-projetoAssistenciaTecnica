package br.fiap.projetoAssistenciaTecnica.service;

import br.fiap.projetoAssistenciaTecnica.domain.Cliente;
import br.fiap.projetoAssistenciaTecnica.domain.Equipamento;
import br.fiap.projetoAssistenciaTecnica.repository.ClienteRepository;
import br.fiap.projetoAssistenciaTecnica.repository.EquipamentoRepository;
import br.fiap.projetoAssistenciaTecnica.web.dto.ClienteDTO;
import br.fiap.projetoAssistenciaTecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repo;
    private final EquipamentoRepository equipRepo;

    public ClienteService(ClienteRepository repo, EquipamentoRepository equipRepo) {
        this.repo = repo;
        this.equipRepo = equipRepo;
    }

    public Cliente cadastrar(ClienteDTO clDTO) {
        Cliente cl = new Cliente();

        cl.setNome(clDTO.getNome());
        cl.setEmail(clDTO.getEmail());
        cl.setSenha(clDTO.getSenha());
        cl.setTelefone(clDTO.getTelefone());

        return repo.save(cl); // metodo insert no banco
    }

    public List<Cliente> listar() {
        return repo.findAll();
    }

    public Cliente buscarId(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Equipamento> listarEquipamentoPorCliente(Long idCliente) {
        return equipRepo.findByClienteId(idCliente);
    }
}
