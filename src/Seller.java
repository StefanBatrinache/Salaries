public class Seller extends  Employee{

    private double fixPart = 0.2 * 150;

    @Override
    public double catculateSalary() {
        return fixPart + reference;
    }

    @Override
    public String getName() {
        return "Seller's name is " + firstName + " " + lastName;
    }

    Seller (String firstName, String lastName, int age, String employmentDate, int reference){
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;

    }
}
