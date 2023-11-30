package Item;

abstract public class Item {
    String Name; public void setName(String Name){this.Name = Name;} public String getName(){return Name;}
    double Value; public void setValue(double Value){this.Value = Value;} public double getValue(){return Value;}

    public Item(String Name, double Value){}
}
