package model;

public class Car extends Vehicle {

    public Car(String plate, String id, int hour, int day) throws Exception {
        super(plate, id, hour,day);
        boolean validPLate = checkbasePlate(plate);
        if (validPLate) {
            super.setPlate(plate);
        } else {
            throw new exception.LicencePlateException(" License plate format is invalid");
        }
    }

    @Override
    public Boolean checkbasePlate(String plate) {
        // Define a regular expression pattern to match the format: 3 letters followed by 3 digits
        boolean valid = false;
        String pattern = "^[A-Z]{3}\\d{3}$";

        if (plate.matches(pattern)) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }

    @Override
    public Boolean checkPlateByHour(String plate, int hour) throws Exception {
        boolean valid = false;
        if (hour >= 7 && hour <= 9 || hour >= 16 && hour <= 19) {
            if (plate.charAt(plate.length() - 1) % 2 != 0) {
                valid = true;
            } else {
                valid = false;
            }
        } else {
            valid = true;
        }
        return valid;
    }

    

    @Override
    public String toString() {
        return "Car{" + super.toString() + '}';
    }
}
