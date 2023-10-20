import java.util.Scanner;

public class Salaries {

    public static void main(String[] args) {
          Staff staff = new Staff();

          Scanner scanner = new Scanner(System.in);

        System.out.printf("Please insert the minimum salary from your country in RON");

        while (!scanner.hasNextInt()) {
            System.out.printf("The inserted value is not a valid integer. Please try again");

        }
            int minimumSalary = scanner.nextInt();

        System.out.printf("Please insert the medium Salary from your country in RON");

        while (!scanner.hasNextInt()) {
            System.out.printf("The inserted value is not a valid integer. Please try again");
        }

        int mediumSalary = scanner.nextInt();
        int minimumHourlySalary = minimumSalary/160;
        int mediumHourlySalary = mediumSalary/160;


        staff.addEmployee (new Seller("Alina", "Bostan", 45, "1995", minimumSalary));
        staff.addEmployee(new Technician("Leonard", "Veres" ,28, "2010", mediumSalary));
        staff.addEmployee(new Warehouseman("Cosmin", "Ureche", 35, "2015", minimumHourlySalary));
        staff.addEmployee(new TechnicianRisk("Vasile", "Castravete", 30, "2009", minimumSalary));
        staff.addEmployee(new HandlingRisk("Marius", "Costin", 42, "2004", minimumSalary));

        staff.showSalaries();
        System.out.printf("The medium salary in this company is " + staff.averageSalary() + " RON.");

        }
}