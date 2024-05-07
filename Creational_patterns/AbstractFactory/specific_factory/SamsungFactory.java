package Creational_patterns.AbstractFactory.specific_factory;

import Creational_patterns.AbstractFactory.DeviceFactory;
import Creational_patterns.AbstractFactory.Notebook;
import Creational_patterns.AbstractFactory.Phone;
import Creational_patterns.AbstractFactory.Watch;
import Creational_patterns.AbstractFactory.Samsung_devices.SamsungNotebook;
import Creational_patterns.AbstractFactory.Samsung_devices.SamsungPhone;
import Creational_patterns.AbstractFactory.Samsung_devices.SamsungWatch;

public class SamsungFactory implements DeviceFactory{
    public Phone createPhone() {
        return new SamsungPhone();
    }

    
    public Notebook createNotebook() {
        return new SamsungNotebook();
    }

    
    public Watch createWatch() {
        return new SamsungWatch();
    }
}
