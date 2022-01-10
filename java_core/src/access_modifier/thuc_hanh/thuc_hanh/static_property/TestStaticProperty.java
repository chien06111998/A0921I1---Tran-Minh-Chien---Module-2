package access_modifier.thuc_hanh.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Honda 1", "Shyactiv 1");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Yamaha 1", "Skyactiv2");
        System.out.println(Car.numberOfCar);
        Car car3 = new Car("Suzuki 1", "Skyactiv 3");
        System.out.println(Car.numberOfCar);
    }
}
