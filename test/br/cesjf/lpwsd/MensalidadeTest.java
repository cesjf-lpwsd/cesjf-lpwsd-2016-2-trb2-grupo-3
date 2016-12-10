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
    
    @Test
    public void testGetAluno() {
        System.out.println("Teste get Aluno");
        Mensalidade pagamento = new Mensalidade();
        assertEquals(null,pagamento.getAluno());
    }
    
    @Test
    public void testSetAluno() {
        System.out.println("Teste set Aluno");
        Mensalidade pagamento = new Mensalidade();
        pagamento.setAluno(null);
        assertEquals(null,pagamento.getAluno());
    }
    
    @Test
    public void testGetDataPagamento() {
        System.out.println("Teste get Data Pagamento");
        Mensalidade pagamento = new Mensalidade();
        assertEquals(null,pagamento.getDataPagamento());
    }
    
    @Test
    public void testSetDataPagamento() {
        System.out.println("Teste set data pagamento");
        Mensalidade pagamento = new Mensalidade();
        pagamento.setDataPagamento(null);
        assertEquals(null,pagamento.getDataPagamento());
    }
    
    @Test
    public void testGetValor() {
        System.out.println("Teste get Valor");
        Mensalidade pagamento = new Mensalidade();
        double test = 0.0;
        assertEquals(test,test,pagamento.getValor());
    }
    
    @Test 
    public void testSetValor(){
        System.out.println("Teste set valor");
        Mensalidade pagamento = new Mensalidade();
        pagamento.setValor(120.0);
        double test = 120.0;
        assertEquals(test,test,pagamento.getValor());
    }
}