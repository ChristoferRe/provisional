package DataAccess.Vehiclesx;

/**
 *
 * @author braya
 */
public class Vehicles {
    
    private String type;
    private String chasisNumber;
    private String plaque;
    private int price;
    private String createdAt;
    private String buyDate;
    private String uniqueCode;

    public Vehicles(String type, String chasisNumber, String plaque, int price, String createdAt, String buyDate, String uniqueCode) {
        this.type = type;
        this.chasisNumber = chasisNumber;
        this.plaque = plaque;
        this.price = price;
        this.createdAt = createdAt;
        this.buyDate = buyDate;
        this.uniqueCode = uniqueCode;
    }

    public String getType() {
        return type;
    }
    public String getChasisNumber() {
        return chasisNumber;
    }
    public String getPlaque() {
        return plaque;
    }
    public int getPrice() {
        return price;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public String getBuyDate() {
        return buyDate;
    }
    public String getUniqueCode() {
        return uniqueCode;
    }
    
    
    
}
