package br.com.fiap.v3;

public class Jogo {
    private int tentativas = 5;
    private int numSorteado = 45;

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getNumSorteado() {
        return numSorteado;
    }

    public void setNumSorteado(int numSorteado) {
        this.numSorteado = numSorteado;
    }
}
