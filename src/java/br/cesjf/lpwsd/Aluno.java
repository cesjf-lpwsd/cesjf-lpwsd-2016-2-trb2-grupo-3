package br.cesjf.lpwsd;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Mensalidade> mensalidades;

    public Aluno() {
        this.mensalidades = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    List<Mensalidade> getMensalidades() {
        return this.mensalidades;
    }
}
