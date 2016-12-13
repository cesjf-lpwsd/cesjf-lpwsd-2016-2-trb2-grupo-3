package controllers;

import br.cesjf.lpwsd.Aluno;
import br.cesjf.lpwsd.Atividade;
import static br.cesjf.lpwsd.Inscricao_.aluno;
import br.cesjf.lpwsd.service.AlunoService;
import br.cesjf.lpwsd.service.AtividadeService;
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

@ManagedBean(name = "atividadeController")
@RequestScoped
public class AtividadeController {
    
    @PersistenceUnit(unitName= "trabalhoIgorPU")
    EntityManagerFactory emf;
    
    @Resource(name = "java:comp/UserTransaction")
    UserTransaction ut;

    private Atividade atividade = new Atividade();
    private List<Atividade> atividades = new ArrayList<>();
    
    @PostConstruct
    public void init(){
         listarAtividades();
    }
    
    public String cadastrarAtividade () {
        AtividadeService service = new AtividadeService();
        service.cadastrarAtividade(getAtividade(), ut, emf);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Aluno Salvo com sucesso!!!"));
        return "listarAtividades.xhtml?faces-redirect=true";     
    }
    
    public String listarAtividades(){
        AtividadeService service = new AtividadeService();
        setAtividades(service.listarAtividades(ut, emf));
        return "listarAtividades.xhtml";
    }
    
    public String visualizarAtividade (Atividade atividade) {
        this.atividade = atividade;
        return "visualizarAtividade.xhtml";
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

}
