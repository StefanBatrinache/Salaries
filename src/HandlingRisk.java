public class HandlingRisk extends Warehouseman implements EmployeeRisk{


    @Override
    public void hangleRisk() {

        System.out.printf("I handle products with high-risk and I receive a bonus for that.");

    }


    @Override
    public double catculateSalary() {
        return 3 * reference + monthlyPremium;
    }


    HandlingRisk(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate, reference);
    }
}
