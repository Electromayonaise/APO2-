package model;

public class Motorcycle extends Vehicle {
    
    public Motorcycle(String plate, String id, int hour, int day) throws Exception {
        super(plate, id, hour, day);
        boolean validPLate = checkbasePlate(plate);
        if (validPLate) {
            super.setPlate(plate);
        } else {
            throw new exception.LicencePlateException(" License plate format is invalid");
        }
    }

    @Override
    public Boolean checkbasePlate(String plate){
        // Define una expresión regular para coincidir con el formato: 3 letras + 2 números + 1 letra
        String pattern = "^[A-Z]{3}\\d{2}[A-Z]$";
        boolean valid = false;
        if (plate.matches(pattern)) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + super.toString() + '}';
    }



}
