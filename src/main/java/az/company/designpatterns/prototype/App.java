package az.company.designpatterns.prototype;

import java.util.List;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employees = new Employee();

        employees.save();

        System.out.printf("Original employees: %s\n", employees.getEmployees());

        Employee employeesOne = employees.clone();

        List<String> empsOne = employeesOne.getEmployees();
        empsOne.add("Fuad");

        System.out.printf("Second emp list : %s\n", empsOne);

        Employee employeesTwo = employees.clone();

        List<String> empsTwo = employeesTwo.getEmployees();
        empsOne.remove("Khayal");

        System.out.printf("Third emp list : %s\n", empsTwo);
    }
}