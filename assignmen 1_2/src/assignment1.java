
class Employee {//PARENT CLASS
    //FIELDS
    String id;
    String name;
    double salary;

    Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class FullTimeEmployee extends Employee {//SUB CLASS
    double allowance;//FIELD


    FullTimeEmployee(String id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return salary + allowance;
    }
}

class PartTimeEmployee extends Employee {
    double hours;
    double rate;

    PartTimeEmployee(String id, String name, double hours, double rate) {
        super(id, name, 0);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * rate;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}

public class assignment1 {
        public static void main(String[] args) {

            Employee e1 = new FullTimeEmployee("EMP001", "mustafe abdi razak", 500, 150);
            Employee e2 = new PartTimeEmployee("EMP0002", "hassan ali nuur", 20, 12);
            Employee e3 = new Manager("EMP003", "anas nuur jama", 1000, 200);

            Employee[] employees = {e1, e2, e3};

            System.out.println("xogta shaqaalaha");

            for (Employee e : employees) {
                System.out.println("ID: " + e.id);
                System.out.println("Name: " + e.name);
                System.out.println("Salary: $" + e.calculateSalary());
                System.out.println();
            }
        }
    }


