package br.fiap.projetoAssistenciaTecnica.domain;

import jakarta.persistence.*;

@Table(name="JAVA_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_PRODUTO")
    private Long id;

    // não precisaria do name="NOME" pq a coluna tem o mesmo nome da variavel
    @Column(name="NOME", nullable = false, length = 120)
    private String nome;

    @Column(name="EMAIL", unique = true, length = 120)
    private String email;

    // independente do sql, coloca-se null = false pra se ter uma verificação dentro do programa antes do dado ir pro banco
    @Column(name="TELEFONE", nullable = false, length = 20)
    private String telefone;

    @Column(name="SENHA", nullable = false, length = 512)
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
