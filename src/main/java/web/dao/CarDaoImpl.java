package web.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao{
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Opel", 2008, "black"));
        cars.add(new Car("Toyota", 2013, "white"));
        cars.add(new Car("BMW", 2022, "red"));
        cars.add(new Car("Nissan", 2017, "blue"));
        cars.add(new Car("Audi", 2020, "red"));
    }

    @Override
    public List<Car> getCars(int count) {
        return ((count > 0 && count < 5) ? cars.stream().limit(count).toList() : cars);
    }
}

