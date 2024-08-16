package one.dio.padroes_de_projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;

    @ManyToOne
    private Endereco endereco;

    public long getId() {
        return id;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
