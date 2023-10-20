public class TechnicianRisk extends Technician implements EmployeeRisk {

    @Override
    public void hangleRisk() {
        System.out.printf("I work in a high-risk environment and I receive a bonus for that.");

    }

    @Override
    public double catculateSalary() {
        return 3 * reference + monthlyPremium;
    }
    TechnicianRisk(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate, reference);
    }
}
