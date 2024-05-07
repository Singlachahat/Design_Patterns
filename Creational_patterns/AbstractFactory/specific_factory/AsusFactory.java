package Creational_patterns.AbstractFactory.specific_factory;

import Creational_patterns.AbstractFactory.DeviceFactory;
import Creational_patterns.AbstractFactory.Notebook;
import Creational_patterns.AbstractFactory.Phone;
import Creational_patterns.AbstractFactory.Watch;
import Creational_patterns.AbstractFactory.asus_devices.AsusNotebook;
import Creational_patterns.AbstractFactory.asus_devices.AsusPhone;
import Creational_patterns.AbstractFactory.asus_devices.AsusWatch;

public class AsusFactory implements DeviceFactory{
     public Phone createPhone() {
        return new AsusPhone();
    }

    @Override
    public Notebook createNotebook() {
        return new AsusNotebook();
    }

    @Override
    public Watch createWatch() {
        return new AsusWatch();
    }
}
