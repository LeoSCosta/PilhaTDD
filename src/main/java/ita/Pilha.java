package ita;

public class Pilha {

    private int tamanho;
    private Object elemento;


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }



    public boolean estaVazia() {
        return elemento==null;
    }

    public void empilha(Object elemento) {
        this.elemento = elemento;
        tamanho++;
    }

    public String topo() {
        return (String) elemento;
    }
}
