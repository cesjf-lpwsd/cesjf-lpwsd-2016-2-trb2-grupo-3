package controllers;

import br.cesjf.lpwsd.Aluno;
import br.cesjf.lpwsd.service.AlunoService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

@ManagedBean(name = "alunoController")
@RequestScoped
public class AlunoController {
    
    @PersistenceUnit(unitName= "trabalhoIgorPU")
    EntityManagerFactory emf;
    
    @Resource(name = "java:comp/UserTransaction")
    UserTransaction ut;

    private Aluno aluno = new Aluno();
    private List<Aluno> alunos = new ArrayList<>();
    
    @PostConstruct
    public void init(){
         listarAlunos();
    }
    
    public String cadastrarAluno () {
        AlunoService service = new AlunoService();
        service.cadastrarAluno(aluno, ut, emf);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Aluno Salvo com sucesso!!!"));
        return "listarAlunos.xhtml?faces-redirect=true";     
    }
    
    public String listarAlunos(){
        AlunoService service = new AlunoService();
        setAlunos(service.listarAluno(ut, emf));
        return "listarAlunos.xhtml";
    }
    
    public String visualizarAluno (Aluno aluno) {
        this.aluno = aluno;
        return "visualizarAluno.xhtml";
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
