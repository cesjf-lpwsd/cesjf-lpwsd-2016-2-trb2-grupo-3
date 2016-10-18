package br.cesjf.lpwsd;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Mensalidade> mensalidades;
    private List<Atividade> atividades;

    public Aluno() {
        this.mensalidades = new ArrayList<>();
        this.atividades = new ArrayList<>();
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

    List<Atividade> getAtividades() {
        return this.atividades;
    }
}
