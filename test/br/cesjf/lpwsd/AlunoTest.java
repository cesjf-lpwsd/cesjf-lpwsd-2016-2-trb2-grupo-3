package br.cesjf.lpwsd;

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
        Aluno aluno = new Aluno();
        assertEquals(null, aluno.getNome());
    }
    
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        Aluno aluno = new Aluno();
        aluno.setNome("Teste");
        assertEquals("Teste", aluno.getNome());
    }
    
    @Test
    public void testIsAdimplente() {
        System.out.println("isAdimplente");
        Aluno aluno = new Aluno();
        assertEquals(false, aluno.isAdimplente());
    }
    
    @Test
    public void testSetAdimplente() {
        System.out.println("setAdimplente");
        Aluno aluno = new Aluno();
        aluno.setAdimplente(true);
        assertEquals(true, aluno.isAdimplente());
    }
    
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Aluno aluno = new Aluno();
        assertEquals(null,aluno.getCpf());
    }
    
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        Aluno aluno = new Aluno();
        aluno.setCpf("CPF");
        assertEquals("CPF",aluno.getCpf());
    }
    
    @Test
    public void testGetMensalidade() {
        System.out.println("getMensalidade");
        Aluno aluno = new Aluno();
        double teste = 10.0;
        assertEquals(teste,teste,aluno.getMensalidade());
    }
    
    @Test
    public void testSetMensalidade() {
        System.out.println("getMensalidade");
        Aluno aluno = new Aluno();
        aluno.setMensalidade(170.0);
        double teste = 120.0;
        assertEquals(teste,teste,aluno.getMensalidade());
    }
    
    @Test
    public void testeMatriculaAluno() {
        System.out.println("testanto matricula do aluno");
        Aluno aluno = new Aluno();
        Atividade atividade = new Atividade();
        atividade.setAberta(true);
        aluno.setAdimplente(true);
        Inscricao inscricao = Inscricao.matricula(aluno,atividade);        
        assertEquals(atividade, inscricao.getAtividade());
        assertEquals(aluno, inscricao.getAluno());
    }
    
    @Test
    //Matricula fechada, não deve permitir inclusão de usuario.
    public void testeMatriculaAlunoAtividadeFechada() {
        System.out.println("Teste Matricula Aluno Atividade Fechada");
        Aluno aluno = new Aluno();
        Atividade atividade = new Atividade();
        atividade.setAberta(false);
        Inscricao inscricao = Inscricao.matricula(aluno,atividade);  
        assertNull(inscricao);
    }
    
    @Test
    //Aluno inadiplente, não permite matricula.
    public void testeMatriculaAlunoInadiplente() {
        System.out.println("Teste Matricula Aluno Inadiplente");
        Aluno aluno = new Aluno();
        Atividade atividade = new Atividade();
        atividade.setAberta(true);
        aluno.setAdimplente(false);
        Inscricao inscricao = Inscricao.matricula(aluno,atividade); 
        assertNull(inscricao);
    }    
}