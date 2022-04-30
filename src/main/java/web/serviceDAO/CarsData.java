package web.serviceDAO;

import web.DAO.DAOImplemetation;
import web.DAO.DAOInterface;
import web.model.Car;

import java.util.List;

public interface CarsData {
    DAOInterface daoRepository = new DAOImplemetation();
    List<Car> returnCarsByNumber(Integer numberOfCars);
}
