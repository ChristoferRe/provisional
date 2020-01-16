
package DataAccess;

/**
 *
 * @author brayan
 */
public class DataPersistence {
    
    private String token;
    private User user;
    
    class User{
        String _id;
        String company;
        String names;
        boolean companyState;
    }
    
    public String getToken(){
        return this.token;
    }
    public String getID(){
        return this.user._id;
    }
    public String getNames(){
        return this.user.names;
    }
    public boolean getCompanyState(){
        return this.user.companyState;
    }
    public String getCompanyID(){
        return this.user.company;
    }
    
}
