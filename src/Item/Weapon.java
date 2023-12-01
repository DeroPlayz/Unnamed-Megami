package Item;

public class Weapon extends Equipment{
    private int Damage;
    private int Accuracy;

    public Weapon(String Name, int Damage, int Accuracy, double Value) {
        super(Name, Value);
        this.Damage = Damage;
        this.Accuracy = Accuracy;
    }

    public String toString(){
        return (Name + "\nDamage: " + Damage + "\nAccuracy: " + Accuracy + "%\nValue: $" + super.Value + "\n");
    }

    public static Weapon Fists = new Weapon("Melee", 1, 97, 0);
    public static Weapon FinalJudgement = new Weapon("Final Judgement", 500, 99, 5000000);

}
