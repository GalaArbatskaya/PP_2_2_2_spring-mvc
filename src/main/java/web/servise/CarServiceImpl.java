package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}