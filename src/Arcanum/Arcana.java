package Arcanum;

public class Arcana{
    private String Name; public String getName(){return Name;}
    private String Number; public String getNumber(){return Number;}
    private int ID; public int getID(){return ID;}

    public Arcana(String Name, String Number, int ID){
        this.Name = Name;
        this.Number = Number;
        this.ID = ID;
    }

    @Override
    public String toString(){
        return (Name + "(" + Number + ")");
    }

    public static final Arcana Fool = new Arcana("Fool", "0", 0);
    public static final Arcana Magician = new Arcana("Magician", "I", 1);
    public static final Arcana Councillor = new Arcana("Councillor", "1", 22);
    public static final Arcana Priestess = new Arcana("Priestess", "II", 2);
    public static final Arcana Empress = new Arcana("Empress", "III", 3);
    public static final Arcana Emperor = new Arcana("Emperor", "IV", 4);
    public static final Arcana Hierophant = new Arcana("Hierophant", "V", 5);
    public static final Arcana Lovers = new Arcana("Lovers", "VI", 6);
    public static final Arcana Chariot = new Arcana("Chariot", "VII", 7);
    public static final Arcana Justice = new Arcana("Justice", "VIII", 8);
    public static final Arcana Hermit = new Arcana("Hermit", "IX", 9);
    public static final Arcana Fortune = new Arcana("Fortune", "X", 10);
    public static final Arcana Strength = new Arcana("Strength", "XI", 11);
    public static final Arcana Hanged = new Arcana("Hanged Man", "XII", 12);
    public static final Arcana Death = new Arcana("Death", "XIII", 13);
    public static final Arcana Temperance = new Arcana("Temperance", "XIV", 14);
    public static final Arcana Devil = new Arcana("Devil", "XV", 15);
    public static final Arcana Tower = new Arcana("Tower", "XVI", 16);
    public static final Arcana Star = new Arcana("Star", "XVII", 17);
    public static final Arcana Moon = new Arcana("Moon", "XVIII", 18);
    public static final Arcana Sun = new Arcana("Sun", "XIX", 19);
    public static final Arcana Judgement = new Arcana("Judgement", "XX", 20);
    public static final Arcana World = new Arcana("World", "XXI", 21);
    public static final Arcana Faith = new Arcana("Faith", "", 23);
}