package com.service;

import java.util.List;

import com.entity.oyun;
import com.entity.oyun.tur;
import com.entity.person;
import com.server.Server1;

public class Server1Service implements Iservice {
Server1 server1= new Server1();
	@Override
	public List<oyun> oyunList(tur tur) {
		// TODO Auto-generated method stub
		return server1.oyunList(tur);
	}

	@Override
	public boolean rezerv(oyun oy,person p) {
		// TODO Auto-generated method stub
		return server1.rezerv(oy,p);
	}

    @Override
    public List<oyun> oyunbilgi(String oyun_isim) {
    return server1.oyunbilgi(oyun_isim);
    }
        

}
