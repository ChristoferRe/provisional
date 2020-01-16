/*
 * Esta va a ser un tipo de compañia asi que ni hereda ni implementa
 */
package DataAccess.Company;

import DataAccess.Vehiclesx.Vehicles;

/**
 *
 * @author brayan
 */
public class Company {
    
    private String name;
    private String socialReason;
    private String direction;
    private String ruc;
    private CompanyUsers[] users;
    private String emailCompany;
    private boolean state;
    private String createdAt;
    private String updatedAt;
    private String companyToken;
    private Vehicles[] vehicles;

    public Company(String name, String socialReason, String direction, String ruc, CompanyUsers[] users, String emailCompany, boolean state, String createdAt, String updatedAt, String companyToken, Vehicles[] vehicles) {
        this.name = name;
        this.socialReason = socialReason;
        this.direction = direction;
        this.ruc = ruc;
        this.users = users;
        this.emailCompany = emailCompany;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.companyToken = companyToken;
        this.vehicles = vehicles;
    }
    
    
    
    private class CompanyUsers{
        public String _id;
    }
    public String getName() {
        return name;
    }
    public String getSocialReason() {
        return socialReason;
    }
    public String getDirection() {
        return direction;
    }
    public String getRuc() {
        return ruc;
    }
    public CompanyUsers[] getUsers() {
        return users;
    }
    public String getEmailCompany() {
        return emailCompany;
    }
    public boolean isState() {
        return state;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public String getUpdatedAt() {
        return updatedAt;
    }
    public String getCompanyToken() {
        return companyToken;
    }
    public Vehicles[] getVehicles() {
        return vehicles;
    }
    
    
    
}
