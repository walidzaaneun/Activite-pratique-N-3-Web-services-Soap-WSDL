package com.walidzaaneun;

import com.walidzaaneun.webservice.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerJWS{
    public static void main(String[] args) {
        String url ="http://0.0.0.0:8686/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Webservice déployé sur "+url);
    }
}
