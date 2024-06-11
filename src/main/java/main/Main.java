package main;

import implementation.Supermarket;
import implementation.SupermarketArray;

import java.util.Scanner;

public class Main {

    private final static int SIZE = 3;

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);

        int option;
        do {
            System.out.println("\nShopping List");
            System.out.println("1 - Insert");
            System.out.println("2 - List");
            System.out.println("3 - Remove");
            System.out.println("4 - Exit");
            System.out.println("Choose a Option: ");
            option = Scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("type a item to be inserted");
                    String item = Scanner.next();
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Type the Position the Item to be Removed");
                    int index = Scanner.nextInt();
                    supermarket.delete(index);
                    break;
                case 4:
                    System.out.println("Exiting the Program");
                    break;
                default:
                    System.out.println("Option Unvalid. Please, Choose Again");
            }
        } while (option != 4);

        Scanner.close();

    }

}

