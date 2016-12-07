
package controllers;

import java.io.IOException;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

@ManagedBean(name="teste")
@RequestScoped
public class NomeQualquer {
    
    @PersistenceUnit(unitName= "jpa-web-pu")
    EntityManagerFactory emf;
    
    @Resource(name = "java:comp/UserTransaction")
    UserTransaction ut;
    
    public void teste() throws IOException{
        System.out.println("teste");
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletResponse response = (HttpServletResponse)context.getExternalContext().getResponse();
        response.sendRedirect("paginaInicial.xhtml");
    }
    
    public void voltar() throws IOException{
        System.out.println("teste");
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletResponse response = (HttpServletResponse)context.getExternalContext().getResponse();
        response.sendRedirect("index.xhtml");
    }
    
}
