package Combat;

public class Element{
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
    
    //Offense Magic.
        static Element Physical = new Element("Physical", true);
        static Element Fire = new Element("Fire", true);
        static Element Ice = new Element("Ice", true);
        static Element Electric = new Element("Electric", true);
        static Element Wind = new Element("Wind", true);
        static Element Bless = new Element("Bless", true);
        static Element Curse = new Element("Curse", true);

    //Not Offense Magic.
        static Element Support = new Element("Support", false);
        static Element Recovery = new Element("Recovery", true);

}