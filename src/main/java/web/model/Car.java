package web.model;

public class Car {
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Integer getSerial() {
        return serial;
    }

    private String name;
    private String model;
    private Integer serial;

    public Car(String name, String model, Integer serial) {
        this.name = name;
        this.model = model;
        this.serial = serial;
    }


}
