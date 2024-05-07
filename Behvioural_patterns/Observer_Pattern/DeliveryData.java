package Behvioural_patterns.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;


public class DeliveryData implements Subject{
    private List<Observing_person> observers;
    private String location;
  
    public DeliveryData() 
    {
        this.observers = new ArrayList<>();
    }
  
    @Override
    public void register(Observing_person obj) 
    {
        observers.add(obj);
    }

    @Override
    public void unregister(Observing_person obj) 
    {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers()
    {
      for(Observing_person obj : observers) 
      {
          obj.update(location);
      }
    }

    public void locationChanged()
    {
        this.location = getLocation();
        notifyObservers();
    }
  
    public String getLocation() 
    {
      return "YPlace";
    }

}
