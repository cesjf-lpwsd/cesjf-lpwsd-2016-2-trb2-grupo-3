
package br.cesjf.lpwsd.service;

import br.cesjf.lpwsd.Aluno;
import br.cesjf.lpwsd.dao.AlunoDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

public class AlunoService {
    
    public String cadastrarAluno(Aluno aluno, UserTransaction utx, EntityManagerFactory emf){
            try {
                AlunoDao dao = new AlunoDao(utx, emf);
                dao.create(aluno);
            } catch (Exception ex) {
                System.out.println("Não foi possivel salvar aluno");
            }
            return "";
    }
    
    public List<Aluno> listarAluno(UserTransaction utx, EntityManagerFactory emf){
        List<Aluno> alunos = null;    
        try {
                AlunoDao dao = new AlunoDao(utx, emf);
                alunos = (List<Aluno>)dao.findAlunoEntities();
            } catch (Exception ex) {
                System.out.println("Não foi possivel salvar aluno");
            }
            return alunos == null ? new ArrayList<>() : alunos;
    }
    
}
