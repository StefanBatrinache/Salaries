import java.util.ArrayList;

public class Staff {

    ArrayList <Employee> employeesList;

    Staff() {
        employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){

        employeesList.add(employee);
    }

    public void showSalaries(){
        for (Employee employee : employeesList){
            System.out.println(employee.getName() + " , who earns" + employee.catculateSalary() + "RON");
        }
    }

    public double averageSalary() {
        int employeeNumber = 0;
        double allSalary = 0;
        while (employeeNumber < employeesList.size()) {
            allSalary += employeesList.get(employeeNumber).calculateSalary();
            employeeNumber ++;
        }
        return allSalary / employeesList.size();
    }
}
