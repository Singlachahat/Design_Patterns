
package Behvioural_patterns.iterator_pattern;

public class Waiter {
    public String name;
    public double salary;

    public Waiter(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
}