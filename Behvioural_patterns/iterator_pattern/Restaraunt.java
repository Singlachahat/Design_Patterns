package Behvioural_patterns.iterator_pattern;

import java.util.List;

public class Restaraunt implements Aggregate<Waiter> {
    public List<Waiter> waiters;

    public Restaraunt(List<Waiter> waiters) {
        this.waiters = waiters;
    }

    @Override
    public Iterator1<Waiter> createIterator() {
        return new WaiterIterator(waiters);
    }
}