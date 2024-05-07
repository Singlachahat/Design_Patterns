package Behvioural_patterns.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class Iterator_test {
    public static void main(String[] args) {
        List <Waiter> waiters= new ArrayList<>();
        waiters.add(new Waiter("Chotu", 4500));
        waiters.add(new Waiter("Ramesh", 6500));
        waiters.add(new Waiter("Raaju", 5000));

        Restaraunt restraunt= new Restaraunt(waiters);
        Iterator1 <Waiter> iterator= restraunt.createIterator();

        double totalSalary=0;
        while (iterator.hasNext()) {
            totalSalary+= iterator.next().getSalary();
        }
        System.out.println("Total salary: "+ totalSalary);
    }
}
