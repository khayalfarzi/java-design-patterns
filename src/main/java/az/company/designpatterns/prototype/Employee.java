package az.company.designpatterns.prototype;

import java.util.LinkedList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> employees = new LinkedList<>();

    public Employee() {
    }

    public Employee(List<String> employees) {
        this.employees = employees;
    }

    public void save() {
        employees.add("Khayal");
        employees.add("Mahmud");
        employees.add("Azar");
        employees.add("Elshan");
        employees.add("Nijat");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee clone = (Employee) super.clone();

        clone = new Employee(this.employees);

        return clone;
    }
}
