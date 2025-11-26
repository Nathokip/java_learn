import java.util.Scanner;

public class Student_marksheet1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------------------");
        System.out.println(" Dedan Kimathi University of Technology");
        System.out.println(" School of Computer Science and IT");
        System.out.println(" Department of Computer Science");
        System.out.println(" Academic Year: 2024/2025");
        System.out.println(" STUDENT MARKSHEET (SECOND YEAR RESULTS)");
        System.out.println("-------------------------------------------------------");

        // Student 1
        System.out.println("\nEnter details for Student 1:");
        System.out.print("Registration Number: ");
        String regNo1 = scanner.nextLine();

        System.out.print("Full Name: ");
        String name1 = scanner.nextLine();

        System.out.println("Enter marks for 7 units:");
        double s1_1 = scanner.nextDouble();
        double s1_2 = scanner.nextDouble();
        double s1_3 = scanner.nextDouble();
        double s1_4 = scanner.nextDouble();
        double s1_5 = scanner.nextDouble();
        double s1_6 = scanner.nextDouble();
        double s1_7 = scanner.nextDouble();

        scanner.nextLine(); // clear buffer

        double total1 = s1_1 + s1_2 + s1_3 + s1_4 + s1_5 + s1_6 + s1_7;
        double average1 = total1 / 7;


        // Student 2
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Registration Number: ");
        String regNo2 = scanner.nextLine();

        System.out.print("Full Name: ");
        String name2 = scanner.nextLine();

        System.out.println("Enter marks for 7 units:");
        double s2_1 = scanner.nextDouble();
        double s2_2 = scanner.nextDouble();
        double s2_3 = scanner.nextDouble();
        double s2_4 = scanner.nextDouble();
        double s2_5 = scanner.nextDouble();
        double s2_6 = scanner.nextDouble();
        double s2_7 = scanner.nextDouble();

        scanner.nextLine();

        double total2 = s2_1 + s2_2 + s2_3 + s2_4 + s2_5 + s2_6 + s2_7;
        double average2 = total2 / 7;

        // Student 3
        System.out.println("\nEnter details for Student 3:");
        System.out.print("Registration Number: ");
        String regNo3 = scanner.nextLine();

        System.out.print("Full Name: ");
        String name3 = scanner.nextLine();

        System.out.println("Enter marks for 7 units:");
        double s3_1 = scanner.nextDouble();
        double s3_2 = scanner.nextDouble();
        double s3_3 = scanner.nextDouble();
        double s3_4 = scanner.nextDouble();
        double s3_5 = scanner.nextDouble();
        double s3_6 = scanner.nextDouble();
        double s3_7 = scanner.nextDouble();

        scanner.nextLine();

        double total3 = s3_1 + s3_2 + s3_3 + s3_4 + s3_5 + s3_6 + s3_7;
        double average3 = total3 / 7;

        // Student 4
        System.out.println("\nEnter details for Student 4:");
        System.out.print("Registration Number: ");
        String regNo4 = scanner.nextLine();

        System.out.print("Full Name: ");
        String name4 = scanner.nextLine();

        System.out.println("Enter marks for 7 units:");
        double s4_1 = scanner.nextDouble();
        double s4_2 = scanner.nextDouble();
        double s4_3 = scanner.nextDouble();
        double s4_4 = scanner.nextDouble();
        double s4_5 = scanner.nextDouble();
        double s4_6 = scanner.nextDouble();
        double s4_7 = scanner.nextDouble();

        scanner.nextLine();

        double total4 = s4_1 + s4_2 + s4_3 + s4_4 + s4_5 + s4_6 + s4_7;
        double average4 = total4 / 7;

        // Student 5
        System.out.println("\nEnter details for Student 5:");
        System.out.print("Registration Number: ");
        String regNo5 = scanner.nextLine();

        System.out.print("Full Name: ");
        String name5 = scanner.nextLine();

        System.out.println("Enter marks for 7 units:");
        double s5_1 = scanner.nextDouble();
        double s5_2 = scanner.nextDouble();
        double s5_3 = scanner.nextDouble();
        double s5_4 = scanner.nextDouble();
        double s5_5 = scanner.nextDouble();
        double s5_6 = scanner.nextDouble();
        double s5_7 = scanner.nextDouble();

        scanner.nextLine();

        double total5 = s5_1 + s5_2 + s5_3 + s5_4 + s5_5 + s5_6 + s5_7;
        double average5 = total5 / 7;

        System.out.println("\n-------------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s\n",
                "RegNo", "Name", "Total", "Average", "Status", "Grade");
        System.out.println("-------------------------------------------------------");


        System.out.printf("%-10s %-15s %-10.1f %-10.2f %-10s %-10s\n",
                regNo1, name1, total1, average1, "", "");

        System.out.printf("%-10s %-15s %-10.1f %-10.2f %-10s %-10s\n",
                regNo2, name2, total2, average2, "", "");

        System.out.printf("%-10s %-15s %-10.1f %-10.2f %-10s %-10s\n",
                regNo3, name3, total3, average3, "", "");

        System.out.printf("%-10s %-15s %-10.1f %-10.2f %-10s %-10s\n",
                regNo4, name4, total4, average4, "", "");

        System.out.printf("%-10s %-15s %-10.1f %-10.2f %-10s %-10s\n",
                regNo5, name5, total5, average5, "", "");
    }
}