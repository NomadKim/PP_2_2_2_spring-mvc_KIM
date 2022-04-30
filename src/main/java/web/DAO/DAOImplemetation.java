package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DAOImplemetation implements DAOInterface{

    @Override
    public List<Car> returnCarsByNumber(Integer numberOfCars) {
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
