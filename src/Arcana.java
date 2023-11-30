class Arcana{
    private String Name;
    private String Number;
    private int ID;

    public Arcana(String Name, String Number, int ID){
        this.Name = Name;
        this.Number = Number;
        this.ID = ID;
    }

    @Override
    public String toString(){
        return (Name + "(" + Number + ")");
    }

    Arcana Null = new Arcana("None", "-1", -1);
    Arcana Fool = new Arcana("Fool", "0", 0);
    Arcana Magician = new Arcana("Magician", "I", 1);
    Arcana Councillor = new Arcana("Councillor", "1", 22);
    Arcana Priestess = new Arcana("Priestess", "II", 2);
    Arcana Empress = new Arcana("Empress", "III", 3);
    Arcana Emperor = new Arcana("Emperor", "IV", 4);
    Arcana Hierophant = new Arcana("Hierophant", "V", 5);
    Arcana Lovers = new Arcana("Lovers", "VI", 6);
    Arcana Chariot = new Arcana("Chariot", "VII", 7);
    Arcana Justice = new Arcana("Justice", "VIII", 8);
    Arcana Hermit = new Arcana("Hermit", "IX", 9);
    Arcana Fortune = new Arcana("Fortune", "X", 10);
    Arcana Strength = new Arcana("Strength", "XI", 11);
    Arcana Hanged = new Arcana("Hanged Man", "XII", 12);
    Arcana Death = new Arcana("Death", "XIII", 13);
    Arcana Temperance = new Arcana("Temperance", "XIV", 14);
    Arcana Devil = new Arcana("Devil", "XV", 15);
    Arcana Tower = new Arcana("Tower", "XVI", 16);
    Arcana Star = new Arcana("Star", "XVII", 17);
    Arcana Moon = new Arcana("Moon", "XVIII", 18);
    Arcana Sun = new Arcana("Sun", "XIX", 19);
    Arcana Judgement = new Arcana("Judgement", "XX", 20);
    Arcana World = new Arcana("World", "XXI", 21);
    Arcana Faith = new Arcana("Faith", "", 23); /*(Maybe)*/
}