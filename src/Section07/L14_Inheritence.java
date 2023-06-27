package Section07;

public class L14_Inheritence {

    public static void main(String[] args) {

        Car carObject = new Car();

        carObject.rev();
        System.out.println(carObject.getMake() + " " + carObject.getModel());

    }

}

class Vehicle {

    private String make = "BMW";

    public String getMake() {
        return make;
    }

    public void rev() {
        System.out.println("Vroooom!!");
    }
}

class Car extends Vehicle {
    private String model = "3 Series";

    public String getModel() {
        return model;
    }
}
