package Behvioural_patterns.iterator_pattern;

import java.util.List;
import java.util.NoSuchElementException;

public class WaiterIterator implements Iterator1<Waiter> {
    public int currentIndex=0;
    public List<Waiter> waiters;

    public WaiterIterator(List <Waiter> waiters) {
        this.waiters = waiters;
    }

    public boolean hasNext() {
        return currentIndex < waiters.size();
    }

    public Waiter next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return waiters.get(currentIndex++);
}
}
