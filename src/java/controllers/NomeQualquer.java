
package controllers;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

@ManagedBean(name="teste")
public class NomeQualquer {
    
    @PersistenceUnit(unitName= "jpa-web-pu")
    EntityManagerFactory emf;
    
    @Resource(name = "java:comp/UserTransaction")
    UserTransaction ut;
    
    public String teste(){
        System.out.println("teste");
        return "teste";
    }
    
}
