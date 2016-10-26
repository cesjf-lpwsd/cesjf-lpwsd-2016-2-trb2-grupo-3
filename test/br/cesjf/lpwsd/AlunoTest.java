package br.cesjf.lpwsd;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlunoTest {
    
    public AlunoTest() {
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
        Aluno instance = new Aluno();
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
    }


    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Fulano";
        Aluno instance = new Aluno();
        instance.setNome(nome);
        assertEquals("Fulano", instance.getNome());
    }
    
    @Test
    public void testGetMensalidades() {
        System.out.println("getMensalidades");
        Aluno instance = new Aluno();

        List<Mensalidade> result = instance.getMensalidades();
        assertEquals(0, result.size());
    }
    
    @Test
    public void testGetAtividades() {
        System.out.println("getAtividades");
        Aluno instance = new Aluno();
        List<Atividade> result = instance.getAtividades();
        assertEquals(0, result.size());
    }
    
     @Test
    public void testGerarPrimeiraMensalidade() {
        System.out.println("primeiraMensalidade");
        Mensalidade mensalidade = new Mensalidade();
        mensalidade.setValor(new Long(100));
        Aluno aluno = new Aluno();
        List<Atividade> atividades = aluno.getAtividades();
        if (aluno.isPrimeiraMensalidade()) {
            mensalidade.setValor(mensalidade.getValor()* new Long(1));
        }
        aluno.getMensalidades().add(mensalidade);
        
        assertEquals(0, atividades.size());
    }
    
}
