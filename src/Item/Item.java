package Item;

import java.util.ArrayList;

import .MafLib;

abstract public class Item {
    String Name = ""; public void setName(String Name){this.Name = Name;} public String getName(){return Name;}
    double Value = 0.00; public void setValue(double Value){this.Value = Value;} public double getValue(){return Value;}
    
    public Item(String Name, double Value){
        this.Name = Name;
        this.Value = Value;
    }
}