package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface DAOInterface {

    List<Car> carList = new ArrayList<>(Arrays.asList(new Car("One", "Two", 11),
            new Car("Three", "Four", 12), new Car("Five", "Six", 13),
            new Car("Seven", "Eight", 14), new Car("Nine", "Ten", 15)));
    List<Car> returnCarsByNumber(Integer numberOfCars);
}
