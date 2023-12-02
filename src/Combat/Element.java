package Combat;
import static Combat.Status.*;

public class Element{
    private String Name; public void setName(String Name){this.Name = Name;} public String getName(){return Name;}
    private static int IDc;
    private int ID; public int getID(){return ID;}
    private Status Ailment; public void setAilment(Status Ailment){this.Ailment = Ailment;} public Status getAilment(){return Ailment;}

    public Element(String Name){
        this.Name = Name;
        this.Ailment = Alive;
        ID = IDc;
        IDc++;
    }

    public Element(String Name, Status Ailment){
        this.Name = Name;
        this.Ailment = Ailment;
        ID = IDc;
        IDc++;
    }
    
    public static Element Physical = new Element("Physical");
    public static Element Fire = new Element("Fire", Burn);
    public static Element Ice = new Element("Ice", Freeze);
    public static Element Electric = new Element("Electric", Stun);
    public static Element Wind = new Element("Wind");
    public static Element Bless = new Element("Bless");
    public static Element Curse = new Element("Curse");
    public static Element Support = new Element("Support");

}