package br.cesjf.lpwsd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AtividadeTest {
    
    public AtividadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class Atividade.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Atividade instance = new Atividade();
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Atividade.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Musculação";
        Atividade instance = new Atividade();
        instance.setNome(nome);
        assertEquals("Musculação", instance.getNome());
    }
    
}
