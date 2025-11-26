import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\t\t\t\t\tDedan Kimathi University of Technology");
        System.out.println("\t\t\t\t\t\tSchool of Computer Science and IT");
        System.out.println("\t\t\t\t\t\t\tDepartment of Computer Science");
        System.out.println("\t\t\t\t\t\t\t\tAcademic Year: 2024/2025");
        System.out.println("\t\t\t\tSTUDENT MARKSHEET (SECOND YEAR RESULTS)");


        //Collecting Student Details

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Reg No (Student 1): ");
        String reg1 = input.nextLine();

        System.out.print("Enter Full Name: ");
        String name1 = input.nextLine();

        System.out.print("Enter CCS 2207 Marks: ");
        int u11 = input.nextInt();

        System.out.print("Enter CCS 2208 Marks: ");
        int u12 = input.nextInt();

        System.out.print("Enter CCS 2209 Marks: ");
        int u13 = input.nextInt();

        System.out.print("Enter CCS 2210 Marks: ");
        int u14 = input.nextInt();

        System.out.print("Enter CSS 2211 Marks: ");
        int u15 = input.nextInt();

        System.out.print("Enter SMA 2215 Marks: ");
        int u16 = input.nextInt();

        System.out.print("Enter IGS 2202 Marks: ");
        int u17 = input.nextInt();

        input.nextLine(); // clear buffer

        int total1 = u11 + u12 + u13 + u14 + u15 + u16 + u17;
        double avg1 = total1 / 7.0;


        // -------- STUDENT 2 --------
        System.out.print("Enter Reg No (Student 2): ");
        String reg2 = input.nextLine();

        System.out.print("Enter Full Name: ");
        String name2 = input.nextLine();

        System.out.print("Enter CCS 2207 Marks: ");
        int u21 = input.nextInt();

        System.out.print("Enter CCS 2208 Marks: ");
        int u22 = input.nextInt();

        System.out.print("Enter CCS 2209 Marks: ");
        int u23 = input.nextInt();

        System.out.print("Enter CCS 2210 Marks: ");
        int u24 = input.nextInt();

        System.out.print("Enter CCS 2211 Marks: ");
        int u25 = input.nextInt();

        System.out.print("Enter SMA 2215 Marks: ");
        int u26 = input.nextInt();

        System.out.print("Enter IGS 2202 Marks: ");
        int u27 = input.nextInt();

        input.nextLine();

        int total2 = u21 + u22 + u23 + u24 + u25 + u26 + u27;
        double avg2 = total2 / 7.0;


        // -------- STUDENT 3 --------
        System.out.print("Enter Reg No (Student 3): ");
        String reg3 = input.nextLine();

        System.out.print("Enter Full Name: ");
        String name3 = input.nextLine();

        System.out.print("Enter CCS 2207 Marks: ");
        int u31 = input.nextInt();

        System.out.print("Enter CCS 2208 Marks: ");
        int u32 = input.nextInt();

        System.out.print("Enter CCS 2209 Marks: ");
        int u33 = input.nextInt();

        System.out.print("Enter CCS 2210 Marks: ");
        int u34 = input.nextInt();

        System.out.print("Enter CCS 2211 Marks: ");
        int u35 = input.nextInt();

        System.out.print("Enter SMA 2215 Marks: ");
        int u36 = input.nextInt();

        System.out.print("Enter IGS 2202 Marks: ");
        int u37 = input.nextInt();

        input.nextLine();

        int total3 = u31 + u32 + u33 + u34 + u35 + u36 + u37;
        double avg3 = total3 / 7.0;

        // -------- STUDENT 4--------
        System.out.print("Enter Reg No (Student 4): ");
        String reg4 = input.nextLine();

        System.out.print("Enter Full Name: ");
        String name4 = input.nextLine();

        System.out.print("Enter CCS 2207 Marks: ");
        int u41 = input.nextInt();

        System.out.print("Enter CCS 2208 Marks: ");
        int u42 = input.nextInt();

        System.out.print("Enter CCS 2209 Marks: ");
        int u43 = input.nextInt();

        System.out.print("Enter CCS 2210 Marks: ");
        int u44 = input.nextInt();

        System.out.print("Enter CCS 2211 Marks: ");
        int u45 = input.nextInt();

        System.out.print("Enter SMA 2215 Marks: ");
        int u46 = input.nextInt();

        System.out.print("Enter IGS 2202 Marks: ");
        int u47 = input.nextInt();

        input.nextLine();

        int total4 = u41 + u42 + u43 + u44 + u45 + u46 + u47;
        double avg4 = total4 / 7.0;
        // -------- STUDENT 5--------
        System.out.print("Enter Reg No (Student 5): ");
        String reg5 = input.nextLine();

        System.out.print("Enter Full Name: ");
        String name5 = input.nextLine();

        System.out.print("Enter CCS 2207 Marks: ");
        int u51 = input.nextInt();

        System.out.print("Enter CCS 2208 Marks: ");
        int u52 = input.nextInt();

        System.out.print("Enter CSS 2209 Marks: ");
        int u53 = input.nextInt();

        System.out.print("Enter CCS 2210 Marks: ");
        int u54 = input.nextInt();

        System.out.print("Enter CCS 2211 Marks: ");
        int u55 = input.nextInt();

        System.out.print("Enter SMA 2215 Marks: ");
        int u56 = input.nextInt();

        System.out.print("Enter IGS 2202 Marks: ");
        int u57 = input.nextInt();

        input.nextLine();

        int total5 = u51 + u52 + u53 + u54 + u55 + u56 + u57;
        double avg5 = total5 / 7.0;


        System.out.println("\nSTUDENT SCORE SHEET");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %10s %10s\n",
                "Reg No.", "Full Name", "2207", "2208", "2209", "2210", "2211", "SMA2215", "IGS2202", "TOTAL", "AVERAGE", "STATUS", "GRADE");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

// STUDENT 1
        System.out.printf("%-20s %-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.1f %-10s %-10s\n",
                reg1, name1, u11, u12, u13, u14, u15, u16, u17, total1, avg1, "", "");

// STUDENT 2
        System.out.printf("%-20s %-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.1f %-10s %-10s\n",
                reg2, name2, u21, u22, u23, u24, u25, u26, u27, total2, avg2, "", "");

// STUDENT 3
        System.out.printf("%-20s %-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.1f %-10s %-10s\n",
                reg3, name3, u31, u32, u33, u34, u35, u36, u37, total3, avg3, "", "");

// STUDENT 4
        System.out.printf("%-20s %-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.1f %-10s %-10s\n",
                reg4, name4, u41, u42, u43, u44, u45, u46, u47, total4, avg4, "", "");

// STUDENT 5
        System.out.printf("%-20s %-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.1f %-10s %-10s\n",
                reg5, name5, u51, u52, u53, u54, u55, u56, u57, total5, avg5, "", "");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        input.close();
    }
}