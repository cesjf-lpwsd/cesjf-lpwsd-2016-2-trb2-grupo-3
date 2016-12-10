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
    public void testeGetDescricao() {
        System.out.println("Testar get descricao");
        Atividade atividade = new Atividade();
        assertEquals(null,atividade.getDescricao());
    }
    
    @Test
    public void testeSetDescricao() {
        System.out.println("Testar set Descricao");
        Atividade atividade = new Atividade();
        atividade.setDescricao("Descricao Atividade");
        assertEquals("Descricao Atividade",atividade.getDescricao());
    }
    
    @Test 
    public void testeGetValor() {
        System.out.println("Teste get valor");
        Atividade atividade = new Atividade();
        double teste = 20.0;
        assertEquals(teste,teste,atividade.getValor());
    }
    
    @Test
    public void testeSetValor() {
        System.out.println("Teste set valor");
        Atividade atividade = new Atividade();
        double teste = 120.0;
        assertEquals(teste,teste,atividade.getValor());
    }
    
    @Test 
    public void testeGetAberta() {
        System.out.println("Teste boolean is atividade aberta");
        Atividade atividade = new Atividade();
        atividade.setAberta(true);
        assertEquals(true,atividade.getAberta());
    }
    
    @Test
    public void testeSetAberta() {
        System.out.println("Teste boolean set atividade aberta");
        Atividade atividade = new Atividade();
        boolean teste = false;
        assertEquals(teste,atividade.getAberta());
    }
}
