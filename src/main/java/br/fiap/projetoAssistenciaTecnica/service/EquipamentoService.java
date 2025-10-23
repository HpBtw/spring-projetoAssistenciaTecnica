package br.fiap.projetoAssistenciaTecnica.service;

import org.springframework.stereotype.Service;

@Service
public class EquipamentoService {
    private final ClienteService repoCliente;
    private final EquipamentoService repoEquip;

    public EquipamentoService(ClienteService repoCliente, EquipamentoService repoEquip) {
        this.repoCliente = repoCliente;
        this.repoEquip = repoEquip;
    }
}
