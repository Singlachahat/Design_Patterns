package Behvioural_patterns.Observer_Pattern;
import Behvioural_patterns.Observer_Pattern.Observing_Unit.DeliveryWarehouseCenter;
import Behvioural_patterns.Observer_Pattern.Observing_Unit.Seller;
import Behvioural_patterns.Observer_Pattern.Observing_Unit.User;

public class test {
    public static void main(String[] args) {
        DeliveryData topic = new DeliveryData();
    
        Observing_person obj1 = new Seller();
        Observing_person obj2 = new User();
        Observing_person obj3 = new DeliveryWarehouseCenter();
    
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
        
        topic.locationChanged();
        topic.unregister(obj3);
    
        System.out.println();
        topic.locationChanged();
    }
}
