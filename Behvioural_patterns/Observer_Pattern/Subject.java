package Behvioural_patterns.Observer_Pattern;

public interface Subject {
    void register(Observing_person obj);
    void unregister(Observing_person obj);
    void notifyObservers();
}
