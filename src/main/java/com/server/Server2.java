package com.server;
import com.entity.oyun;
import com.entity.person;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class Server2 {
    EntityManagerFactory factory  ;
    EntityManager entityManager ;

    public Server2() {
    factory =Persistence.createEntityManagerFactory("persistence-unit2");
    entityManager =factory.createEntityManager();
    }
       
    
    public List<oyun> oyunList(oyun.tur tur) {
       String sorgu ="SELECT o FROM oyun o WHERE o.tur = :tur AND o.koltukAdedi>0";
        Query query = entityManager.createQuery(sorgu);
        query.setParameter("tur", tur);
        List<oyun> oyunlar = query.getResultList(); 
        //json dönüþtürme kodlarý
        
        return oyunlar;
    
    }

  public boolean rezerv(oyun oy,person p) {
         EntityTransaction trans = entityManager.getTransaction();
        oyun o = entityManager.find(oyun.class, oy.getId());
        o.setKoltukAdedi(oy.getKoltukAdedi()-1);
        if(o.getKoltukAdedi()<=0) {
        	return false;
        }
        trans.begin();
         
     
        entityManager.merge(o);
        entityManager.persist(p);
        trans.commit();
        return true;
    }
     public List<oyun> oyunbilgi(String oyun_isim){
        String sorgu ="SELECT o FROM oyun o WHERE o.oyunAdi = :oyun_isim";
        Query query = entityManager.createQuery(sorgu);
        query.setParameter("oyun_isim", oyun_isim);
        List<oyun> oyunlar = query.getResultList(); 
        return oyunlar;
        
    }
    
}
