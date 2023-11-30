class Arcana{
    private String Name;
    private String Number;
    private static int IDc;
    private int ID;

    public Arcana(String Name, String Number){
        this.Name = Name;
        this.Number = Number;
        ID = IDc;
        IDc++;
    }

    Arcana Fool = new Arcana("Fool", "0");
    Arcana Magician = new Arcana("Magician", "I");
    Arcana Councillor = new Arcana("Councillor", "1");
    Arcana Priestess = new Arcana("Priestess", "II");
    Arcana Empress = new Arcana("Empress", "III");
    Arcana Emperor = new Arcana("Emperor", "IV");
    Arcana Hierophant = new Arcana("Hierophant", "V");
    Arcana Lovers = new Arcana("Lovers", "VI");
    Arcana Chariot = new Arcana("Chariot", "VII");
    Arcana Justice = new Arcana("Justice", "VIII")
    Arcana Hermit = new Arcana("Hermit", "IX");
    Arcana Fortune = new Arcana("Fortune", "X");
    Arcana Strength = new Arcana("Strength", "XI");
    Arcana Hanged = new Arcana("Hanged Man", "XII");
    Arcana Death = new Arcana("Death", "XIII");
    Arcana Temperance = new Arcana("Temperance", "XIV");
    Arcana Devil = new Arcana("Devil", "XV");
    Arcana Tower = new Arcana("Tower", "XVI");
    Arcana Star = new Arcana
    Arcana Moon
    Arcana Sun
    Arcana Judgement
    Arcana World
    Arcana Faith = new Arcana("Faith", ""); /*(Maybe)*/
}