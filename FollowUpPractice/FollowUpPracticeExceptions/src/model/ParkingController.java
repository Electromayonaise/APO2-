package model;
import java.util.ArrayList;

public class ParkingController {
    
    // Create an arraylist of cars and a arraylist of motorcycles, set the size of cars to 100 and the size of motorcycles to 200
    private ArrayList<Car> cars;
    private ArrayList<Motorcycle> motorcycles;


    public ParkingController(){
        // set up the size of the array
        cars = new ArrayList<Car>(100);
        motorcycles = new ArrayList<Motorcycle>(200);
    }

    public void registerVehicle(String licencePlate, int type, String id, int hour, int day) throws Exception {
        
        // Create a new car or motorcycle depending on the type of vehicle
        if (type == 1) {
            try {
                Car car = new Car(licencePlate, id, hour, day);
                cars.add(car);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (type == 2) {
            try {
                Motorcycle motorcycle = new Motorcycle(licencePlate, id, hour, day);
                motorcycles.add(motorcycle);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }


}
