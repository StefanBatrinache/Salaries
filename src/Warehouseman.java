public class Warehouseman extends Employee {

    @Override
    public double catculateSalary() {
        return 65 * reference;
    }

    @Override
    public String getName() {
        return "The warehouse man's name is " + firstName + " " + lastName;
    }

    Warehouseman(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;

    }
}