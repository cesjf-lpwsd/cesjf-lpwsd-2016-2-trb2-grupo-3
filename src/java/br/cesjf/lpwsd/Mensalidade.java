
package br.cesjf.lpwsd;

class Mensalidade {
    private int codigo;
    private int codAluno;
    private Long valor;
    private boolean primeira;
    private boolean quitada;
    

    public Mensalidade() {
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public boolean isPrimeira() {
        return primeira;
    }

    public void setPrimeira(boolean primeira) {
        this.primeira = primeira;
    }

    public boolean isQuitada() {
        return quitada;
    }

    public void setQuitada(boolean quitada) {
        this.quitada = quitada;
    }

       
}
