
package br.cesjf.lpwsd.service;

import br.cesjf.lpwsd.Aluno;
import br.cesjf.lpwsd.Atividade;
import br.cesjf.lpwsd.dao.AlunoDao;
import br.cesjf.lpwsd.dao.AtividadeDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

public class AtividadeService {
    
    public String cadastrarAtividade(Atividade  atividade, UserTransaction utx, EntityManagerFactory emf){
            try {
                AtividadeDao dao = new AtividadeDao(utx, emf);
                dao.create(atividade);
            } catch (Exception ex) {
                System.out.println("Não foi possivel salvar atividade.");
            }
            return "";
    }
    
    public List<Atividade> listarAtividades(UserTransaction utx, EntityManagerFactory emf){
        List<Atividade> atividades = null;    
        try {
                AtividadeDao dao = new AtividadeDao(utx, emf);
                atividades = (List<Atividade>)dao.findAtividadeEntities();
            } catch (Exception ex) {
                System.out.println("Não foi possivel salvar aluno");
            }
            return atividades == null ? new ArrayList<>() : atividades;
    }
    
}
