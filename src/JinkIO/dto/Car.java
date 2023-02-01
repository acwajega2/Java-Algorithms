package JinkIO.dto;

public abstract class Car {
    private String color;
    private String countryOrigin;
    private int manufactureryear;


    public Car(String color, String countryOrigin, int manufactureryear){
        this.color =color;
        this.countryOrigin = countryOrigin;
        this.manufactureryear = manufactureryear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public int getManufactureryear() {
        return manufactureryear;
    }

    public void setManufactureryear(int manufactureryear) {
        this.manufactureryear = manufactureryear;
    }

    //-----------> Add Methods for the car

    public abstract void reverse();
    public abstract void park();
    public abstract void drive();
    public abstract void start();
    public abstract void stop();
}
