package Combat;

public class Element{
    private String Name; public void setName(String Name){this.Name = Name;} public String getName(){return Name;}
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
        public static Element Physical = new Element("Physical", true);
        public static Element Fire = new Element("Fire", true);
        public static Element Ice = new Element("Ice", true);
        public static Element Electric = new Element("Electric", true);
        public static Element Wind = new Element("Wind", true);
        public static Element Bless = new Element("Bless", true);
        public static Element Curse = new Element("Curse", true);

    //Not Offense Magic.
        public static Element Support = new Element("Support", false);
        public static Element Recovery = new Element("Recovery", true);

}