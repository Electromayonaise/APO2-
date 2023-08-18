package ui;

import model.DoubleLinkedLists;
import java.util.Scanner;

public class Main {

    private DoubleLinkedLists controller;
    private Scanner sc;

    public Main() {
        controller = new DoubleLinkedLists();
        sc = new Scanner(System.in);
        // initUsers();
    }

    public static void main(String[] args) {
        Main m = new Main();
        // variable para leer la entrada
        int option = 0;

        // ciclo para ejecutar el menu mientras que el usuario no
        // elija la opciOn para salir (0)
        do {
            option = m.showMenuAndGetOption();
            m.answerOption(option);
        } while (option != 0);
    }

    /**
     * Metodo que se encarga de llamar a los mEtodos que resuelven cada uno de los
     * requerimientos de la aplicaciOn
     * 
     * @param userOption, int es el nUmero ingresado por el usuario (no ha sido
     *                    validado)
     */
    public void answerOption(int userOption) {
        switch (userOption) {
            case 0:
                System.out.println("cerrando la aplicaciOn, bye");
                break;
            case 1:
                for (int i = 0; i < 10; i++) {
                    controller.add(i);
                    System.out.println(controller.getTail());
                }

                System.out.println("////////////////////////////////");
                System.out.println(controller.searchNode(1, controller.getHead()));
                System.out.println(controller.searchNode(8, controller.getHead()));

                controller.swap(1, 8);

                System.out.println("////////////////");

                System.out.println(controller.print(controller.getHead()));

                break;
            case 2:
                // searchUser();
                break;
            case 3:
                // deleteUser();
                break;
            case 4:
                // printUsers();
                break;
            case 5:

        }
    }

    /*
     * private void deleteUser() {
     * System.out.println("type the id:");
     * int goal = sc.nextInt();
     * System.out.println(controller.delete(goal));
     * }
     * 
     * private void searchUser() {
     * 
     * }
     * 
     * private void addUser() {
     * 
     * }
     * 
     * private void initUsers(){
     * for (int i = 0; i< 10; i++){
     * controller.addLastUser(new User(i));
     * }
     * }
     * 
     * private void printUsers(){
     * System.out.println(controller.print());
     * }
     * 
     * /**
     * Metodo que muestra el menu de la aplicaciOn, a este metod hace falta
     * implementar la validaciOn
     * del valor ingresado por el usuario
     * 
     * @return input, int es la opciOn elegida por el usuario
     */
    public int showMenuAndGetOption() {
        int input;
        System.out.println("\n\nMenu de la aplicación, digite una opciOn\n" +
                "(1) Add User\n" +
                "(2) Search User\n" +
                "(3) Delete User\n" +
                "(4) Print list \n" +
                "(5) opciOn 5\n" +
                "(0) Para salir"

        );
        input = sc.nextInt();
        sc.nextLine();
        return input;
    }

}