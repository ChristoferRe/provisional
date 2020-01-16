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
 * @author brayan
 */
public class HttpPost extends Variables {
    
    private String jsonObject;
    private String token;
    private String url;
    
    //Creamos los contructores
    
    //* ------->CONSTRUCTOR PARA HACER PETICIONES CON TOKEN<-------*//
    public HttpPost(String jsonObject, String token, String url){
        this.jsonObject = jsonObject;
        this.token = token;
        this.url = url;
    }
    //* ------->CONSTRUCTOR PARA HACER PETICIONES SIN TOKEN<-------*//
    public HttpPost(String jsonObject, String url){
        this.jsonObject = jsonObject;
        this.url = url;
        this.token = null;
    }
    
    //Peticiones con token
    public String httpPost() throws IOException, InterruptedException {
       
        try{

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request;

            if(this.token == null){
                request = HttpRequest.newBuilder()
                    .uri(URI.create(super.baseURL + this.url))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(this.jsonObject))
                    .build();
            }
            else{
                request = HttpRequest.newBuilder()
                    .uri(URI.create(super.baseURL + this.url))
                    .header("Content-Type", "application/json")
                    .header("Authorization", this.token)
                    .POST(HttpRequest.BodyPublishers.ofString(this.jsonObject))
                    .build();
            }

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode() >= 200 && response.statusCode() < 300 ){
                return response.body();
            }
            else if(response.statusCode() == 401){
                return null;
            }
            else{
                throw new JsonSyntaxException(response.body());
            }

        }
        catch(IOException | InterruptedException e){
            throw new InterruptedException("Error al obtener la información del servidor");
        }
    }
}
