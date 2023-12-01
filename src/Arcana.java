
class Arcana{
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

    static Arcana Null = new Arcana("None", "-1", -1);
    static Arcana Fool = new Arcana("Fool", "0", 0);
    static Arcana Magician = new Arcana("Magician", "I", 1);
    static Arcana Councillor = new Arcana("Councillor", "1", 22);
    static Arcana Priestess = new Arcana("Priestess", "II", 2);
    static Arcana Empress = new Arcana("Empress", "III", 3);
    static Arcana Emperor = new Arcana("Emperor", "IV", 4);
    static Arcana Hierophant = new Arcana("Hierophant", "V", 5);
    static Arcana Lovers = new Arcana("Lovers", "VI", 6);
    static Arcana Chariot = new Arcana("Chariot", "VII", 7);
    static Arcana Justice = new Arcana("Justice", "VIII", 8);
    static Arcana Hermit = new Arcana("Hermit", "IX", 9);
    static Arcana Fortune = new Arcana("Fortune", "X", 10);
    static Arcana Strength = new Arcana("Strength", "XI", 11);
    static Arcana Hanged = new Arcana("Hanged Man", "XII", 12);
    static Arcana Death = new Arcana("Death", "XIII", 13);
    static Arcana Temperance = new Arcana("Temperance", "XIV", 14);
    static Arcana Devil = new Arcana("Devil", "XV", 15);
    static Arcana Tower = new Arcana("Tower", "XVI", 16);
    static Arcana Star = new Arcana("Star", "XVII", 17);
    static Arcana Moon = new Arcana("Moon", "XVIII", 18);
    static Arcana Sun = new Arcana("Sun", "XIX", 19);
    static Arcana Judgement = new Arcana("Judgement", "XX", 20);
    static Arcana World = new Arcana("World", "XXI", 21);
    static Arcana Faith = new Arcana("Faith", "", 23);
}