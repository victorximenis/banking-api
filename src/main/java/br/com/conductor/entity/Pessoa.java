package br.com.conductor.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pessoas")
public class Pessoa extends Model {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
