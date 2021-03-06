package ita;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPilha {

    Pilha pilha;
    @Before
    public void before(){
        pilha = new Pilha(10);
    }


    @Test
    public void pilhaVazia(){
        assertTrue(pilha.estaVazia());
        assertEquals(0 , pilha.getTamanho());
    }
    @Test
    public void empilhaUmElemento(){
        pilha.empilha("Primeiro");
        assertFalse(pilha.estaVazia());
        assertEquals(1 , pilha.getTamanho());
        assertEquals("Primeiro", pilha.topo());
    }

    @Test
    public void empilhaEDesempilha(){
        pilha.empilha("Primeiro");
        pilha.empilha("Segundo");
        assertEquals(2 , pilha.getTamanho());
        assertEquals("Segundo", pilha.topo());
        Object desempilhado = pilha.desempilha();
        assertEquals(1,pilha.getTamanho());
        assertEquals("Primeiro", pilha.topo());
        assertEquals("Segundo",desempilhado);
    }
    @Test(expected = PilhaVaziaException.class)
    public void removePilhaVazia(){
        pilha.desempilha();

    }
    @Test
    public void empilharPilhaCheia(){
        for (int i = 0; i < 10; i++){
            pilha.empilha("elemento: " + i);
        }
        try {
            pilha.empilha("boom");
            fail();
        }catch (PilhaCheiaException ignored){

        }
    }

}
