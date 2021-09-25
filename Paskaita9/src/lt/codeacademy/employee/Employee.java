/*
 *
 *
 *  */


package lt.codeacademy.employee;

public class Employee {
    private int salary;
    private int workingHours;

    Employee() {
        System.out.println("Hello, I am employee");
    }

    Employee(int workingHours) {

    }

    private void getInfo() {
        System.out.println("Salary is : " + salary);
        System.out.println("Number of hours worked : " + workingHours);
    }

    public int addSalary() {


        if (salary > 500) {
            salary += 10;
        }

        return salary;
    }

    public int addJob(int workingHours) {
        salary += 5;
        salary += addJob(workingHours);
        return salary;
    }
}
