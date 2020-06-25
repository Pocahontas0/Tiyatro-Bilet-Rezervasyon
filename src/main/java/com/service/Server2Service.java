package com.service;

import java.util.List;

import com.entity.oyun;
import com.entity.oyun.tur;
import com.entity.person;
import com.server.Server2;

public class Server2Service implements Iservice {
Server2 server= new Server2();
	@Override
	public List<oyun> oyunList(tur tur) {
		// TODO Auto-generated method stub
		return server.oyunList(tur);
	}

	@Override
	public boolean rezerv(oyun oy,person p) {
		// TODO Auto-generated method stub
		return server.rezerv(oy,p);
	}
         @Override
    public List<oyun> oyunbilgi(String oyun_isim) {
    return server.oyunbilgi(oyun_isim);
    }
        

}
