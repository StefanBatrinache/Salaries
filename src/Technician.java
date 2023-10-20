public class Technician extends Employee{

    @Override
    public double catculateSalary() {
        return 2*reference;
    }

    @Override
   public  String getName() {
        return "Technician's name is " + firstName + " " +lastName;
    }

    Technician (String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;

    }

}
