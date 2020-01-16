package DataAccess.Responses;

/**
 *
 * @author brayan
 */
public class BadResponse {
    
    private String message;
    
    public BadResponse(String message){
        this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
}
