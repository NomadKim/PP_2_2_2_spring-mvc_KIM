package web.serviceDAO;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarsDataImplementation implements CarsData{

    @Override
    public List<Car> returnCarsByNumber(Integer numberOfCars) {
        return daoRepository.returnCarsByNumber(numberOfCars);
    }
}
