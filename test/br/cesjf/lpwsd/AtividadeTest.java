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

    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Atividade instance = new Atividade();
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Musculação";
        Atividade instance = new Atividade();
        instance.setNome(nome);
        assertEquals("Musculação", instance.getNome());
    }
    
        @Test
    public void testGetValor() {
        System.out.println("getValor");
        Atividade instance = new Atividade();
        float expResult = (float) 0;
        float result = instance.getValor();
            assertEquals(expResult, result, 0);
    }
   
        @Test
    public void testGetCodAtividade() {
        System.out.println("getAtividade");
        Atividade atividade = new Atividade();
        atividade.setCodigo(12);
        assertEquals(atividade.getCodigo(),12);
    }
    
    
}
