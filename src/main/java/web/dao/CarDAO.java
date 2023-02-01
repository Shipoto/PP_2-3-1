//package web.dao;
//
//import org.springframework.stereotype.Component;
//import web.models.Car;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class CarDAO {
//    private static int PC;
//    private List<Car> cars;
//    {
//        cars = new ArrayList<>();
//
//        cars.add(new Car("Toyota", "red", ++PC));
//        cars.add(new Car("Mazda", "blue", ++PC));
//        cars.add(new Car("Cherry", "green", ++PC));
//        cars.add(new Car("Mercedes", "yellow", ++PC));
//        cars.add(new Car("Ferrari", "silver", ++PC));
//    }
//
//    public List<Car> index() {
//        return cars;
//    }
//
//    public void save(Car car) {
//        car.setId(++PC);
//        cars.add(car);
//    }
//
//    public Car show(int id) {
//        return cars.stream().filter(car -> car.getId() == id).findAny().orElse(null);
//    }
//
//    public void update(int id, Car updatedCar) {
//        Car carForUpdate = show(id);
//
//        carForUpdate.setModel(updatedCar.getModel());
//        carForUpdate.setColor(updatedCar.getColor());
//    }
//
//    public void delete(int id) {
//        cars.removeIf(p -> p.getId() == id);
//    }
//}
