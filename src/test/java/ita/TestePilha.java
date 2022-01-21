package ita;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestePilha {

    @Test
    public void pilhaVazia(){
        Pilha pilha = new Pilha();
        assertTrue(pilha.estaVazia());
        assertEquals(0 , pilha.getTamanho());
    }
    @Test
    public void empilhaUmElemento(){
        Pilha pilha = new Pilha();
        pilha.empilha("Primeiro");
        assertFalse(pilha.estaVazia());
        assertEquals(1 , pilha.getTamanho());
        assertEquals("Primeiro", pilha.topo());
    }

}
