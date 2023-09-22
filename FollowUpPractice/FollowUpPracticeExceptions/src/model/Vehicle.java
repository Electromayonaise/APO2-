package model;

public abstract class Vehicle {
    
    private String plate;

    private String id ;

    private int hour ;

    private int day ;

    public Vehicle(String plate, String id, int hour, int day) {
        this.plate = plate;
        this.id = id;
        this.hour = hour;
        this.day = day;
    }

    public String getPlate() {
        return plate;
    }

    public abstract Boolean checkbasePlate(String plate) throws Exception ; 

    public abstract Boolean checkPlateByHour(String plate, int hour) throws Exception;

    public abstract Boolean checkPlateByDay(String plate, int day) throws Exception;

    public abstract Boolean checkIdByDay(String id, int day) throws Exception;

    
    public void setPlate(String plate){
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "plate=" + plate + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int time) {
        this.hour = time;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int date) {
        this.day = date;
    }



}
