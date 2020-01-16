package DataAccess.Sensors;

/**
 *
 * @author brayan
 */
public class InfraredSensor extends Sensors implements ISensor {

    private int angleDetection = 35;

    public InfraredSensor(String name, String description, double price, double voltage, double weight) {
        super.name = name;
        super.description = description;
        super.price = price;
        super.voltage = voltage;
        super.weight = weight;
    }

    //Metodos get
    public String getName() {
        return super.name;
    }

    public String getDescription() {
        return super.description;
    }

    public String getType() {
        return ISensor.type;
    }

    public double getPrice() {
        return super.price;
    }
    public double getweight() {
        return super.weight;
    }

    public double getVoltage() {
        return super.voltage;
    }
    
    public String getAngleDetection(){
        return angleDetection + "Grados";
    }

}
