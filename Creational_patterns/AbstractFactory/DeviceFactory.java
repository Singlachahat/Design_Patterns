package Creational_patterns.AbstractFactory;

public interface DeviceFactory {
        Phone createPhone();
        Notebook createNotebook();
        Watch createWatch();
}

