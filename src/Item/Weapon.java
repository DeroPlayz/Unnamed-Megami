package Item;

public class Weapon extends Equipment{
    private int Damage;
    private int Accuracy;

    public Weapon(String Name, int Damage, int Accuracy, double Value, int StrengthMod, int MagicMod, int EnduranceMod, int AgilityMod, int LuckMod) {
        super(Name, Value, StrengthMod, MagicMod, EnduranceMod, AgilityMod, LuckMod);
        this.Damage = Damage;
        this.Accuracy = Accuracy;
    }

    public Weapon(String Name, int Damage, int Accuracy, double Value) {
        super(Name, Value, 0, 0, 0, 0, 0);
        this.Damage = Damage;
        this.Accuracy = Accuracy;
    }

    public String toString(){
        return (Name + "\nDamage: " + Damage + "\nAccuracy: " + Accuracy + "%\nValue: $" + super.Value + "\n");
    }

    public static Weapon Fists = new Weapon("Melee", 1, 97, 0);
    public static Weapon FinalJudgement = new Weapon("Final Judgement", 500, 99, 5000000);

}
