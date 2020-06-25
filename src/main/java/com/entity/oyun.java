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
	    private int ücret;
	    private String salonNo;
	    private int koltukAdedi;
	    private tur tur;
	    public oyun() {
			// TODO Auto-generated constructor stub
		}  

    @Override
    public String toString() {
        return "oyun{" + "id=" + id + ", oyunAdi=" + oyunAdi + ", \u00fccret=" + ücret + ", salonNo=" + salonNo + ", koltukAdedi=" + koltukAdedi + ", tur=" + tur + '}';
    }
		    
	    public oyun(tur tur, String oyunAdi,int ücret, String salonNo, int koltukAdedi) {
	       
	        this.tur=tur;
	        this.oyunAdi = oyunAdi;
	        this.ücret = ücret;
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

	    public int getÜcret() {
	        return ücret;
	    }

	    public void setÜcret(int ücret) {
	        this.ücret = ücret;
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
	  Müzikal
	}
	}


