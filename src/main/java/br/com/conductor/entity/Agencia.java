package br.com.conductor.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "agencias")
public class Agencia extends Model {
    private String numero;
    private String digito;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }
}
