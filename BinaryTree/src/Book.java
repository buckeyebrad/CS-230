import java.util.Scanner;
import java.io.*;

public class Book {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name, number, response;
        BinarySearchTree<Person> PhoneBook = new BinarySearchTree<>();
        boolean continueForBook = true;

        System.out.println("Welcome to your address book.");
        System.out.println("-----------------------------\n\n");

        while (continueForBook) {
            System.out.println("MAIN MENU: ");
            System.out.println("1: Add person to phone book");
            System.out.println("2: Delete person from phone book.");
            System.out.println("3: Find a person using their name.");
            System.out.println("4: Change a persons number. ");
            System.out.println("5: Quit\n");
            System.out.println("Select option using either the corresponding number.");
            System.out.print("Selection: ");
            response = keyboard.nextLine();
            System.out.println();

            switch (Integer.parseInt(response)) {
                case 1:
                    System.out.println("You have selected to add someone to your phone book.");
                    System.out.print("Please enter the name: ");
                    name = keyboard.nextLine();
                    System.out.print("Please enter the number: ");
                    number = keyboard.nextLine();

                    PhoneBook.insert(new Person(name, number));
                    System.out.println("Successfully added.\n\n");
                    break;
                case 2:
                    System.out.println("You have selected to delete someone from your phone book.");
                    System.out.print("Please enter the name: ");
                    name = keyboard.nextLine();
                    System.out.println("Please enter the number: ");
                    number = keyboard.nextLine();
                    //if (PhoneBook.searchFor(a));
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("You have selected to exit your phone book.");
                    System.out.println("Exiting.");
                    continueForBook = false;
                    break;
                default:
                    System.out.println("Invalid option.");
                    System.out.println("Please use a valid option.\n\n");
            }
        }
    }
}
