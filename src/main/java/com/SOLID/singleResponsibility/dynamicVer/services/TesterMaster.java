package com.SOLID.singleResponsibility.dynamicVer.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class TesterMaster {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Fetch");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    InsertQu i = new InsertQu();
                    i.add();
                    break;
                case 2:

                    UpdateQu u = new UpdateQu();
                    u.update();
                    break;
                case 3:
                    DeleteQu q = new DeleteQu();
                    q.delete();
                    break;
                case 4:
                    FetchQu f = new FetchQu();
                    f.fetch();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.println(); // Add a newline for better separation
        } while (true);
    }
}
