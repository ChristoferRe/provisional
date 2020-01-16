/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.Users;

import DataAccess.HttpPetitions.HttpGet;
import com.google.gson.JsonSyntaxException;

/**
 *
 * @author brayan
 */
public class Users {
    
    private String token;
    private int total;
    private int pages;
    private User[] users;
    //La peticion nos devuelve un json array asi que creamos esta clase para pasarlo a java array
    public class User{
        public String createdAt;
        public String _id;
        public String names;
        public String schedule;
        public String role;
    }
    
    public Users(String token){
        this.token = token;
    }
    public int getTotal() {
        return total;
    }
    public int getPages() {
        return pages;
    }
    public User[] getUsers() {
        return users;
    }
    //Metodo para traer todos los usuarios
    public String getUsers(String number) throws InterruptedException {
       
        String sendURI = "/user/company/users/" + number;
            HttpGet request = new HttpGet(this.token, sendURI);
        try{
            
            String response = request.httpGet();
            return response;
        }
        catch (InterruptedException ex) {
            throw new InterruptedException(ex.getMessage());
        } 
        catch(JsonSyntaxException ex){
            throw new JsonSyntaxException(ex.getMessage());
        } 
    }
    
    public String searchUser(String data) throws InterruptedException{
        
        try{
            String sendURI = "/user/search/" + data;
            HttpGet request = new HttpGet(this.token, sendURI);
            
            String response = request.httpGet();
            return response;
        }
        catch (InterruptedException ex) {
            throw new InterruptedException(ex.getMessage());
        } 
        catch(JsonSyntaxException ex){
            throw new JsonSyntaxException(ex.getMessage());
        } 
    }
    
}

