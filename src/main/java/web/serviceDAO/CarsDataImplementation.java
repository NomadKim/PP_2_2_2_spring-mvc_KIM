package web.serviceDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.DAOInterface;
import web.model.Car;

import java.util.List;

@Service
public class CarsDataImplementation implements CarsData{

    DAOInterface daoRepository;

    @Override
    public List<Car> returnCarsByNumber(Integer numberOfCars) {
        return daoRepository.returnCarsByNumber(numberOfCars);
    }

    @Autowired
    public void setDaoRepository(DAOInterface daoRepository) {
        this.daoRepository = daoRepository;
    }
}
