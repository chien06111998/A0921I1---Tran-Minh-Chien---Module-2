package access_modifier.thuc_hanh.thuc_hanh.static_property;

public class Car {
    private String name;
    private String engine;
    public  static int numberOfCar;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

}
