/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.AuthAndRegister;

import DataAccess.HttpPetitions.HttpPost;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;

/**
 *
 * @author braya
 */
public class Register {
    
    private String names, email, schedule, type;
    private User user;
            
    private class User{
        String name;
    }

    public Register(String schedule) {
        this.schedule = schedule;
    }

    public Register(String names, String email, String schedule, String type) {
        this.names = names;
        this.email = email;
        this.schedule = schedule;
        this.type = type;
    }
    //Solo queremos el nombre, los demas datos son sencibles y no se deben enviar
    public String getNombre(){
        return user.name;
    }
    
    //Metodo para validar la cedula
    public String verifySchedule(String jsonObject, String token) throws InterruptedException, IOException {
        
        try{
            HttpPost post = new HttpPost(jsonObject, token, "/user/validate/credential");
            String response = post.httpPost();
            return response;
        }
        catch(InterruptedException | IOException ex){
            throw new InterruptedException(ex.getMessage());
        }
        catch(JsonSyntaxException ex){
               throw new JsonSyntaxException(ex.getMessage());
        }
    }
    //Metodo para registrar usuario
    public String registerUser(String jsonObject, String token) throws InterruptedException, IOException {
        
        try{
            HttpPost post = new HttpPost(jsonObject, token, "/user/register");
            String response = post.httpPost();
            return response;
        }
        catch(InterruptedException | IOException ex){
            throw new InterruptedException(ex.getMessage());
        }
        catch(JsonSyntaxException ex){
               throw new JsonSyntaxException(ex.getMessage());
        }
    }
    
}
