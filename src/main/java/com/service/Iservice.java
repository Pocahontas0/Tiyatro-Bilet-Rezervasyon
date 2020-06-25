package com.service;

import java.util.List;

import com.entity.oyun;
import com.entity.person;

public interface Iservice {
	  List<oyun> oyunList(oyun.tur tur);
	    boolean rezerv(oyun oy,person p);
             List<oyun> oyunbilgi(String oyun_isim);
}
