package Creational_patterns.AbstractFactory;

import Creational_patterns.AbstractFactory.specific_factory.AsusFactory;
import Creational_patterns.AbstractFactory.specific_factory.SamsungFactory;

public class test {
    public static void main(String[] args) {
        DeviceFactory asusfactory= new AsusFactory();
        asusfactory.createNotebook();
        asusfactory.createWatch();

        DeviceFactory deviceFactory= new SamsungFactory();
        deviceFactory.createPhone();
        deviceFactory.createWatch();
    }
}
