/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ferhat
 */
@Entity
public class person {
            @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	
	    private String ad;
            private String soyad;
            private String koltuk_no;
            private String ödeme;
            private String oyun_isim;
            private Date tarih;

    public String getOyun_isim() {
        return oyun_isim;
    }

    public void setOyun_isim(String oyun_isim) {
        this.oyun_isim = oyun_isim;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
            

    public person() {
    }

    public person(String ad, String soyad, String koltuk_no, String ödeme,String oyun_isim,Date tarih) {
       this.oyun_isim=oyun_isim;
       this.tarih=tarih;
        this.ad = ad;
        this.soyad = soyad;
        this.koltuk_no = koltuk_no;
        this.ödeme = ödeme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKoltuk_no() {
        return koltuk_no;
    }

    public void setKoltuk_no(String koltuk_no) {
        this.koltuk_no = koltuk_no;
    }

    public String getÖdeme() {
        return ödeme;
    }

    public void setÖdeme(String ödeme) {
        this.ödeme = ödeme;
    }
            
    
}
