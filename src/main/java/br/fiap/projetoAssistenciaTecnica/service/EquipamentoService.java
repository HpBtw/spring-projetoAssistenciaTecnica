package br.fiap.projetoAssistenciaTecnica.service;

import br.fiap.projetoAssistenciaTecnica.domain.Equipamento;
import br.fiap.projetoAssistenciaTecnica.repository.ClienteRepository;
import br.fiap.projetoAssistenciaTecnica.repository.EquipamentoRepository;
import br.fiap.projetoAssistenciaTecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EquipamentoService {
    private final ClienteRepository repoCliente;
    private final EquipamentoRepository repoEquip;

    public EquipamentoService(ClienteRepository repoCliente, EquipamentoRepository repoEquip) {
        this.repoCliente = repoCliente;
        this.repoEquip = repoEquip;
    }

    public Equipamento cadastrar(EquipamentoDTO eqDTO) {
        // var cadastra uma variavel de tipagem dinâmica (é inferida no retorno do método atribuidor)
        // não pode ser global, local-only
        var cliente = repoCliente.findById(eqDTO.getIdCliente())
                .orElseThrow(() -> new NoSuchElementException("Cliente não encontrado"));

        var eq = new Equipamento();
        eq.setTipo(eqDTO.getTipo());
        eq.setMarca(eqDTO.getMarca());
        eq.setModelo(eqDTO.getModelo());
        eq.setNumSerie(eqDTO.getNumSerie());
        eq.setDataRegistro(eqDTO.getDataRegistro());
        eq.setCliente(cliente);

        System.out.println("tentando salvar");

        return repoEquip.save(eq);
    }

    public List<Equipamento> listar() {
        return repoEquip.findAll();
    }

    public Equipamento buscarId(Long id) {
        return repoEquip.findById(id).orElse(null);
    }
}
