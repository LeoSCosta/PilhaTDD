package ita;

public class Pilha {

    private int tamanho = 0;
    private final Object[] elemento;

    public Pilha(int maximo) {
        elemento= new Object[maximo];
    }

    public int getTamanho() {
        return tamanho;
    }



    public boolean estaVazia() {
        return tamanho ==0;
    }

    public void empilha(Object elemento) {
        if (tamanho == this.elemento.length)
            throw new PilhaCheiaException("A pilha está cheia");
        this.elemento[tamanho] = elemento;
        tamanho++;
    }

    public Object topo() {
        return elemento[tamanho-1];
    }

    public Object desempilha() {
        if (estaVazia())
            throw new PilhaVaziaException("A pilha está vazia");
        Object topo = topo();
        tamanho--;
        return topo;
    }
}
