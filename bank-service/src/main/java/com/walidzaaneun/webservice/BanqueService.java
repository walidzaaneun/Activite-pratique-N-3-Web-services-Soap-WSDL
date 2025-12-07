package com.walidzaaneun.webservice;

import com.walidzaaneun.model.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "convertionEuroEnDh")
    public double conversion(@WebParam(name = "montant") double amount) {
        return amount * 11;
    }

    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code")String code){
        return new Compte(code,10000);
    }

    @WebMethod(operationName = "getComptes")
    public List<Compte> getComptes(){
        return List.of(
                new Compte("321E321",9000),
                new Compte("123D321",8000),
                new Compte("567D987",8000),
                new Compte("123C123",12400)
        );
    }
}
