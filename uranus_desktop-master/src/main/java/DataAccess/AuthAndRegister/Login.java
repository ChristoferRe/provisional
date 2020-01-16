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
 * @author brayan
 */
public class Login {
    
    private String credential, password;
    
    public Login(String credential, String password){
        this.credential = credential;
        this.password = password;
    }
    
    public String sendLogin(String jsonObject) throws InterruptedException, IOException {
        
        try {
            HttpPost httpPost = new HttpPost(jsonObject, "/user/login");
            String response = httpPost.httpPost();
            return response;
        } catch (InterruptedException | IOException ex) {
            throw new InterruptedException(ex.getMessage());
        } catch(JsonSyntaxException ex){
               throw new JsonSyntaxException(ex.getMessage());
        }
    }
    
}
