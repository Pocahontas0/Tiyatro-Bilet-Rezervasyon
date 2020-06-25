package com.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class oyun {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	
	    private String oyunAdi;
	    private int �cret;
	    private String salonNo;
	    private int koltukAdedi;
	    private tur tur;
	    public oyun() {
			// TODO Auto-generated constructor stub
		}  

    @Override
    public String toString() {
        return "oyun{" + "id=" + id + ", oyunAdi=" + oyunAdi + ", \u00fccret=" + �cret + ", salonNo=" + salonNo + ", koltukAdedi=" + koltukAdedi + ", tur=" + tur + '}';
    }
		    
	    public oyun(tur tur, String oyunAdi,int �cret, String salonNo, int koltukAdedi) {
	       
	        this.tur=tur;
	        this.oyunAdi = oyunAdi;
	        this.�cret = �cret;
	        this.salonNo = salonNo;
	        this.koltukAdedi = koltukAdedi;
	       
	    }

	

	 

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	   

	    public String getOyunAdi() {
	        return oyunAdi;
	    }

	    public void setOyunAdi(String oyunAdi) {
	        this.oyunAdi = oyunAdi;
	    }

	    public int get�cret() {
	        return �cret;
	    }

	    public void set�cret(int �cret) {
	        this.�cret = �cret;
	    }

	    public String getSalonNo() {
	        return salonNo;
	    }

	    public void setSalonNo(String salonNo) {
	        this.salonNo = salonNo;
	    }

	    public int getKoltukAdedi() {
	        return koltukAdedi;
	    }

	    public void setKoltukAdedi(int koltukAdedi) {
	        this.koltukAdedi = koltukAdedi;
	    }

	
	    
	    
	  public enum tur {
	  Komedi,
	  Dram,
	  Trajedi,
	  M�zikal
	}
	}


