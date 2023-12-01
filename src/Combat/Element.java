package Combat;

public class Element {
    private String Name;
    private static int IDc;
    private int ID;
    private boolean isOffense;
    private Status Ailment;

    public Element(String Name, boolean isOffense){
        this.Name = Name;
        this.isOffense = isOffense;
        ID = IDc;
        IDc++;
    }
    
    /*Offense Magic.*/{
        Element Physical = new Element("Physical", true);
        Element Fire = new Element("Fire", true);
        Element Ice = new Element("Ice", true);
        Element Electric = new Element("Electric", true);
        Element Wind = new Element("Wind", true);
        Element Bless = new Element("Bless", true);
        Element Curse = new Element("Curse", true);
    }
    /*Not Offense Magic.*/{
        Element Support = new Element("Support", false);
        Element Recovery = new Element("Recovery", true);
    }
}