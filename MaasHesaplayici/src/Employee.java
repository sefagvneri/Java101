public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int bonus() {
        int bonus = 0;
        if(workHours > 40){
            for(int i = 0; i<workHours-40; i++) {
                 bonus += 30;
            }
        }
        else {
            bonus = 0;
        }
        return bonus;
    }
    double tax() {
        double tax = 0;
        if(salary > 1000) {
            tax += salary * 0.03;
        }
        else {
            tax = 0;
        }
        return tax;
    }
    double raiseSalary() {
        double raisedSalary = 0;
        if(2021 - hireYear < 10){
            raisedSalary += salary * 0.05;
        }
        if(2021 - hireYear > 9 && 2021 - hireYear < 20) {
            raisedSalary += salary * 0.10;
        }
        if(2021-hireYear>19) {
            raisedSalary+= salary * salary * 0.15;
        }
        return raisedSalary;
    }

    void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work hours: " + this.workHours);
        System.out.println("The year of starting work : " + this.hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Salary increase : " + raiseSalary());
        System.out.println("Salary with taxes and bonus : " + (salary + bonus() - tax()));
        System.out.println("Total Salary : " + (salary +  raiseSalary() + bonus() - tax()));
    }

}
