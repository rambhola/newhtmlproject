public class Caraps extends Vehicle {

    private String Model;
    private int brand;

    public Caraps(String brand, int year, String model) {
        super(brand, year);
        this.Model = model;
    }


    public void start() {
        System.out.println(brand + " car is starting");
    }

     public void stop() {
        System.out.println(brand + " car is stopping");
    }

    public void drift() {
        System.out.println(brand + " car is drifting");
    }
}
