package com.walidzaaneun;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxyWS = new BanqueWS().getBanqueServicePort();
        System.out.println("convertion de euro en dh: " + proxyWS.convertionEuroEnDh(100));
        System.out.println("------------------------------------");
        System.out.println("Code: "+ proxyWS.getCompte("123E123").getCode() +", solde: "+proxyWS.getCompte("123E123").getSolde());
        System.out.println("------------------------------------");
        System.out.println("Liste des comptes :");
        for(Compte compte : proxyWS.getComptes()){
            System.out.println("Code: "+ compte.getCode() +", solde: "+compte.getSolde());
        }
    }
}
