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
        Long expResult = null;
        Long result = instance.getValor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValor method, of class Mensalidade.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Long valor = new Long(0);
        Mensalidade instance = new Mensalidade();
        instance.setValor(valor);
        assertEquals(new Long(0), instance.getValor());
    }
    
    @Test
    public void testGetCodAluno() {
        System.out.println("getCodAluno");
        Aluno aluno = new Aluno ();
        Mensalidade instance = new Mensalidade();
        //Aluno expResult = aluno.getNome()
        assertEquals(new Aluno(), instance.getCodAluno());
    }
    
}
