package web;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ReturnCars {

    private List<Car> carList = new ArrayList<>(Arrays.asList(new Car("One", "Two", 11),
            new Car("Three", "Four", 12), new Car("Five", "Six", 13),
            new Car("Seven", "Eight", 14), new Car("Nine", "Ten", 15)));

    public List<Car> returnCarsByNumber(Integer numberOfCars){
        if (numberOfCars <= 0 || numberOfCars >= 5){
            return carList;
        } else{
            List<Car> secondList = new ArrayList<>();
            for(int i = 0; i < numberOfCars; i++){
                secondList.add(carList.get(i));
            }
            return secondList;
        }

    }
}
