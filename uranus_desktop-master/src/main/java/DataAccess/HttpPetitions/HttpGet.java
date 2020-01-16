/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.HttpPetitions;

import DataAccess.Variables;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author braya
 */
public class HttpGet extends Variables {
    
    private String token;
    private String uri;
    //Constructor con token
    public HttpGet(String token, String uri){
        this.token = token;
        this.uri = uri;
    }
    //Constructor sin token
    public HttpGet(String uri){
        this.uri = uri;
        this.token = null;
    }
    
    public String httpGet() throws InterruptedException{
        
       try {
           
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request;
            
            if(this.token == null){
                request = HttpRequest.newBuilder()
                    .uri(URI.create(super.baseURL + uri))
                    .header("Content-Type", "application/json")
                    .build();
            }   
            else{
                request = HttpRequest.newBuilder()
                    .uri(URI.create(super.baseURL + uri))
                    .header("Content-Type", "application/json")
                    .header("Authorization", this.token)
                    .build();
            }
            
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() >= 200 && response.statusCode() < 300){
                return response.body();
            }
            else if(response.statusCode() == 401){
                return null;
            }
            else{
                throw new JsonSyntaxException(response.body());
            }
                
            } catch (IOException | InterruptedException ex) {
                throw new InterruptedException("No se pudo obtener información del servidor");
            }
        }
        
    
}
