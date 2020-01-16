
package DataAccess.Sensors;

/**
 *
 * @author brayan
 */
public class DistanceSensor extends Sensors implements ISensor{
    
    private double frequency;
    private double minFrequency = 25;
    private double maxFrequency = 85;
    
    public DistanceSensor(String name, String description, double price, double voltage, double weight){
        super.name = name;
        super.description = description;
        super.price  = price;
        super.voltage = voltage;
        super.weight = weight;
    }
    
    //Metodos get
    public String getName(){
        return super.name;
    }
    public String getDescription(){
        return super.description;
    }
    public String getType(){
        return ISensor.type;
    }
    public double getPrice(){
        return super.price;
    }
    public double getFrequency(){
        return this.frequency;
    }
    public double getMaxFrequency(){
        return this.maxFrequency;
    }
    public double getMinFrequency(){
        return this.minFrequency;
    }
    public double getweight(){
        return super.weight;
    }
    public double getVoltage(){
        return super.voltage;
    }
    
    
}
