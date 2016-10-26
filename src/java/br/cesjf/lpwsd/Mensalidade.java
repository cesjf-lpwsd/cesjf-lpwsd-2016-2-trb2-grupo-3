
package br.cesjf.lpwsd;

class Mensalidade {
    private int codigo;
    private Aluno codAluno;
    private Float valor;
    private boolean manutencao;
    private boolean quitada;
    

    public Mensalidade() {
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Aluno getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Aluno codAluno) {
        this.codAluno = codAluno;
    }

    public boolean isManutencao() {
        return manutencao;
    }

    public void setManutencao(boolean manutencao) {
        this.manutencao = manutencao;
    }

    public boolean isQuitada() {
        return quitada;
    }

    public void setQuitada(boolean quitada) {
        this.quitada = quitada;
    }

       
}
