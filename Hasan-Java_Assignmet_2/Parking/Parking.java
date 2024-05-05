package Parking;

import java.util.Scanner;

public class Parking {
    private static final double MINIMUM_FEE = 2.00;
    private static final double HOURLY_RATE = 0.50;
    private static final double MAX_DAILY_CHARGE = 10.00;
    private static double totalReceipts = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Parking Garage");
        System.out.println("  _______  _______  _______  _______ ");
        System.out.println(" (  ____ \\(  ___  )(       )(  ____ \\");
        System.out.println(" | (    \\/| (   ) || () () || (    \\/");
        System.out.println(" | |      | (___) || || || || (__    ");
        System.out.println(" | |      |  ___  || |(_)| ||  __)   ");
        System.out.println(" | |      | (   ) || |   | || (      ");
        System.out.println(" | (____/\\| )   ( || )   ( || (____/\\");
        System.out.println(" (_______/|/     \\||/     \\|(_______/");
        System.out.println("                                      ");

        System.out.println("Enter the hours parked for each customer (or -1 to exit):");

        double hoursParked = 0.0;
        while (hoursParked != -1) {
            System.out.print("Hours parked (or -1 to finish): ");
            hoursParked = scanner.nextDouble();

            if (hoursParked == -1) {
                break;
            }

            double charge = calculateCharges(hoursParked);
            System.out.println("#####################################");
            System.out.println("#                                   #");
            System.out.printf("# Parking charge for %.2f hours: $%.2f #\n", hoursParked, charge);
            System.out.println("#                                   #");
            System.out.println("#####################################");
        }

        System.out.println("Total receipts for yesterday: $" + totalReceipts);

        scanner.close();
    }

    private static double calculateCharges(double hours) {
        double charge = MINIMUM_FEE;

        if (hours > 3) {
            charge += Math.ceil(hours - 3) * HOURLY_RATE;
        }

        charge = Math.min(charge, MAX_DAILY_CHARGE);
        totalReceipts += charge;
        return charge;
    }
}
