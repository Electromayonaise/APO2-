package ui;

import model.ParkingController;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * El centro comercial Unicentro tiene identificado un problema: sus estacionamientos no dan abasto para todos los vehículos que diariamente visitan el recinto, ocasionando que haya embotellamiento al interior.

La administración de Unicentro ha decidido establecer unas reglas de ingreso de vehículos mientras pueden ampliar la capacidad actual de vehículos.

Unicentro lo ha contratado a usted para que desarrolle un prototipo del programa con las reglas implementadas que luego será incluído en las máquinas de parqueo a la entrada del centro.

REGLAS
Los automóviles cuya placa comience por las letras de la A a la M pueden entrar sólo desde las 7AM hasta las 2PM y los automóviles cuya placa comience por las letras de la N a la Z pueden entrar sólo desde las 2PM hasta las 10PM.
Las motos cuyo número esté entre 00 y 49 pueden entrar sólo desde las 7AM hasta las 2PM y las motos cuyo número esté entre 50 y 99 pueden entrar sólo desde las 2PM hasta las 10PM.
El conductor cuya cédula termine en 0 o 1 no puede entrar el lunes, si termina en 2 o 3 no puede entrar el martes, si termina en 4 o 5 no puede entrar el miércoles, si termina en 6 o 7 no puede entrar el jueves y si termina en 8 o 9 no puede entrar los viernes.
Si los 100 cupos para automóviles se agotaron, el programa debe rechazar al vehículo entrante en cualquier caso.
Si los 200 cupos para motos se agotaron, el programa debe rechazar al vehículo entrante en cualquier caso.

Para la hora y fecha, use la clase Date para obtener el dato.

El programa debe manejar como una excepción si el vehículo entrante no cumple con alguna de las reglas y el programa debe indicar la causa del rechazo: si llega fuera de plazo de horas, si ya no hay cupo en el parqueadero o si el conductor no puede ingresar.

TAREAS
Defina qué entradas necesita el programa para poder evaluar las reglas
Modele el parqueadero de modo que pueda llevar registro de cuántos cupos hay disponibles para automóviles y motos.
Modele cuántas y cuáles son las excepciones que usará para los casos en los que el vehículo deba ser rechazado porque no cumple con las reglas de ingreso.
Implemente un programa por consola que pida la información de entrada y registre al vehículo entrante si cumple con las reglas o que arroje una excepción en caso de que el sistema lo rechace.


ANEXO
En Colombia, las placas de los carros son 3 letras seguidas de 3 números. Por ejemplo: AGE123, ABC492, ZXY980. 
Las placas de las motos son 3 letras seguidas de 2 números y una letra al final. Por ejemplo: WOW15D, 

 */

public class ParkingSystem {

    private ParkingController parkingController;
    private Scanner reader;

    public ParkingSystem() {
        reader = new Scanner(System.in);
        parkingController = new ParkingController();
    }

    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem();
        ps.showMenu();
    }

    public void showMenu() {
        int option = 0;
        do {
            System.out.println("Welcome to Unicentro's parking system");
            System.out.println("1. Register vehicle");
            System.out.println("2. Exit");
            option = reader.nextInt();
            reader.nextLine();
            switch (option) {
            case 1:
                registerVehicle();
                break;
            case 2:
                System.out.println("Thanks for using the system");
                break;
            default:
                System.out.println("Invalid option");
                break;
            }
        } while (option != 2);
    }

    public void registerVehicle() {
        System.out.println("Input the license plate of the vehicle");
        String plate = reader.nextLine();
        System.out.println("Input the type of vehicle (1 for car, 2 for motorcycle)");
        int type = reader.nextInt();
        reader.nextLine();
        System.out.println("Input the id of the driver");
        String id = reader.nextLine();
        // Obtain the current hour 
        Calendar calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        try {
            parkingController.registerVehicle(plate, type, id, hour, day);
            System.out.println("The vehicle was registered successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
}
