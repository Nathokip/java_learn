import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- 1. INPUT SECTION ---
        System.out.println("--- ENTER INVOICE DETAILS ---");

        // Bill To Information
        System.out.println("Enter Bill To Name:");
        String billName = input.nextLine();
        System.out.println("Enter Bill To Company:");
        String billCompany = input.nextLine();
        System.out.println("Enter Bill To Street Address:");
        String billStreet = input.nextLine();
        System.out.println("Enter Bill To City, State, Zip:");
        String billCityStateZip = input.nextLine();

        // Ship To Information
        System.out.println("Enter Ship To Name:");
        String shipName = input.nextLine();
        System.out.println("Enter Ship To Company:");
        String shipCompany = input.nextLine();
        System.out.println("Enter Ship To Street Address:");
        String shipStreet = input.nextLine();
        System.out.println("Enter Ship To City, State, Zip:");
        String shipCityStateZip = input.nextLine();

        // Product Information
        System.out.println("Enter Product Description:");
        String productDescription = input.nextLine();

        System.out.println("Enter Quantity:");
        int quantity = input.nextInt();

        System.out.println("Enter Unit Price:");
        double unitPrice = input.nextDouble();

        // --- 2. CALCULATION SECTION ---
        // Calculate Subtotal
        double subtotal = quantity * unitPrice;

        // Calculate Discount (0.6368%)
        // 0.6368% is 0.006368 in decimal form
        double discountRate = 0.006368;
        double discountAmount = subtotal * discountRate;

        // Calculate Grand Total
        double grandTotal = subtotal - discountAmount;

        // --- 3. OUTPUT SECTION (The Invoice) ---
        System.out.println("");
        System.out.println("=========================================================================");
        System.out.println("                             SALES INVOICE                               ");
        System.out.println("=========================================================================");
        System.out.println("DATE: 11/19/2025"); // Assuming current date or static
        System.out.println("INVOICE #: 001");
        System.out.println("-------------------------------------------------------------------------");

        // Using String.format within println to create columns without loops
        System.out.println(String.format("%-35s | %-35s", "BILL TO", "SHIP TO"));
        System.out.println(String.format("%-35s | %-35s", "-------", "-------"));
        System.out.println(String.format("%-35s | %-35s", billName, shipName));
        System.out.println(String.format("%-35s | %-35s", billCompany, shipCompany));
        System.out.println(String.format("%-35s | %-35s", billStreet, shipStreet));
        System.out.println(String.format("%-35s | %-35s", billCityStateZip, shipCityStateZip));
        System.out.println("=========================================================================");

        // Table Header
        System.out.println(String.format("%-30s %10s %15s %15s", "DESCRIPTION", "QTY", "UNIT PRICE", "AMOUNT"));
        System.out.println("-------------------------------------------------------------------------");

        // Line Item
        System.out.println(String.format("%-30s %10d %15.2f %15.2f", productDescription, quantity, unitPrice, subtotal));

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("");

        // Totals Section
        System.out.println(String.format("%57s %15.2f", "SUBTOTAL:", subtotal));
        System.out.println(String.format("%57s %15.2f", "DISCOUNT (0.6368%):", discountAmount));
        System.out.println(String.format("%57s %15.2f", "TAX (0.0%):", 0.00));
        System.out.println("                                                         ---------------");
        System.out.println(String.format("%57s %15.2f", "TOTAL DUE:", grandTotal));
        System.out.println("");
        System.out.println("=========================================================================");
        System.out.println("                     THANK YOU FOR YOUR BUSINESS!                        ");
        System.out.println("=========================================================================");

        input.close();
    }
}