package com.service;

import com.entity.oyun;
import com.entity.person;
import java.util.List;

public class Service {
public static  List<oyun> getList(Iservice iservice, oyun.tur tur){
	return iservice.oyunList(tur);
}
public static boolean rezerv(Iservice iservice, oyun oyun,person p) {
	return iservice.rezerv(oyun,p);
}
public static List<oyun> oyunbilgi(Iservice iservice,String oyun_bilgi){
    return iservice.oyunbilgi(oyun_bilgi);
}
}
