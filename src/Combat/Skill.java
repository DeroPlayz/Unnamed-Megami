package Combat;

public class Skill {
    private String Name;
    private int Power; //Damage for Attacks, Potency for Healing
    private Element Type;

    public Skill(String Name, int Power, Element Type){
        this.Name = Name;
        this.Power = Power;
        this.Type = Type;
    }
}
