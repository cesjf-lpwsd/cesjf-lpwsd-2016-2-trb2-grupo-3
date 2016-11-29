package br.cesjf.lpwsd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MensalidadeTest {
    
    public MensalidadeTest() {
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
     * Test of getValor method, of class Mensalidade.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Mensalidade instance = new Mensalidade();
        Float expResult = null;
        Float result = instance.getValor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValor method, of class Mensalidade.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Float valor = new Float(0);
        Mensalidade instance = new Mensalidade();
        instance.setValor(valor);
        assertEquals(new Float(0), instance.getValor());
    }
    
    @Test
    public void testGetCodAluno() {
        System.out.println("getCodAluno");
        Mensalidade mensalidade = new Mensalidade();
        Aluno aluno = new Aluno();
//        mensalidade.getCodAluno(aluno.getCodigo());
//        assertEquals(mensalidade.setCodAluno("1"), 1);
    }
    
}
