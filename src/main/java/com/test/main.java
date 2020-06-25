package com.test;

import java.util.List;


import com.entity.oyun;
import com.entity.oyun.tur;

import com.service.Server1Service;
import com.service.Server2Service;



public class main {

	public static void main(String[] args) {
		 List<oyun> oyunList = com.service.Service.getList(new Server1Service(), tur.Dram);
                  List<oyun> oyunList2 = com.service.Service.getList(new Server2Service(), tur.Komedi);
		 oyunList2.forEach((i)->System.out.println(i.getId()));
	}

}
