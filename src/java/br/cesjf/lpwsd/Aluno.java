package br.cesjf.lpwsd;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.ManyToMany;

public class Aluno {
    
    private int codigo;
    private String nome;
    private List<Mensalidade> mensalidades;
    @ManyToMany
    private List<Atividade> atividades;

    public Aluno() {
        this.mensalidades = new ArrayList<>();
        this.atividades = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
    public void setMensalidades(List<Mensalidade> mensalidades) {
        this.mensalidades = mensalidades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }
    
    public boolean isPrimeiraMensalidade() {
        return this.mensalidades.isEmpty() ? true : false;
    }
}
