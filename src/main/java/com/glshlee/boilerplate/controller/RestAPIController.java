package com.glshlee.boilerplate.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestAPIController{

    @GetMapping("/apitest")
    public String callapi(){
        final StringBuffer result = new StringBuffer();

        try{
            final String urlstr ="https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1";

            final URL url = new URL(urlstr);

            final HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("GET");
        
            final BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));

            String returnLine;
            //

            while((returnLine = br.readLine()) != null){
                result.append(returnLine + "\n");
            } 
            urlConnection.disconnect();
        }catch(final Exception e){
            e.printStackTrace();
        }
        return result+"";
    }

}