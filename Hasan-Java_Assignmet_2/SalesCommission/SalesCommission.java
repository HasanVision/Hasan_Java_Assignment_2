package SalesCommission;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store counts for each salary range
        int[] salaryRanges = new int[9];

        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();

        // Input gross sales and calculate salary for each salesperson
        for (int i = 0; i < numSalespeople; i++) {
            System.out.printf("Enter gross sales for salesperson %d: $", i + 1);
            double grossSales = scanner.nextDouble();
            double salary = 200 + (0.09 * grossSales);
            int salaryRangeIndex = (int) (salary - 200) / 100;
            if (salaryRangeIndex >= 0 && salaryRangeIndex < 9) {
                salaryRanges[salaryRangeIndex]++;
            } else {
                salaryRanges[8]++; // For salaries $1000 and over
            }
        }

        // Print summary in tabular format with ASCII art
        System.out.println("\nSummary of Salespeople Salaries");
        System.out.println("─────────────────────────────────────────────────");
        System.out.println("    Salary Range      │ Number of Salespeople");
        System.out.println("─────────────────────────────────────────────────");
        for (int i = 0; i < salaryRanges.length; i++) {
            String range = i == 8 ? "$1000 and over" : String.format("$%d - $%d", 200 + i * 100, 299 + i * 100);
            System.out.printf("   %-18s │ %-20d%n", range, salaryRanges[i]);
        }
        System.out.println("─────────────────────────────────────────────────");

        scanner.close();
    }
}
