package Combat;

import static Combat.Element.*;

public class Skill {
    private String Name;
    private String Description; public void setDesc(){Description = ""; if(Power == 5){Description += "Weak ";} else if(Power == 10){Description += "Medium ";} else if(Power == 15){Description += "Heavy ";} else if(Power == 20){Description += "Severe ";} Description += Type.getName() + " damage to "; if(SingleTarget == true){Description += "1 foe.";} else{Description += "all foes.";}}
    private int Cost;
    private int Power; //Damage for Attacks, Potency for Healing
    private Element Type;
    private boolean SingleTarget;

    public Skill(String Name, int Cost, int Power, Element Type, boolean SingleTarget){
        this.Name = Name;
        this.Cost = Cost;
        this.Power = Power;
        this.Type = Type;
        this.SingleTarget = SingleTarget;
        if(Power == 5){
            Description += "Weak ";
        }
        else if(Power == 10){
            Description += "Medium ";
        }
        else if(Power == 15){
            Description += "Heavy ";
        }
        else if(Power == 20){
            Description += "Severe ";
        }

        Description += Type.getName() + " damage to ";

        if(SingleTarget == true){
            Description += "1 foe.";
        }
        else{
            Description += "all foes.";
        }
    }

    public String toString(){
        String s = Name + " (";
        if(Type.equals(Physical)){

        }
        else{
            s += Cost + " SP)\n";
        }
        setDesc();
        s += Description;
        return s;
    }


    //Fire
    //Single Target
    public static Skill Agi = new Skill("Agi", 3, 5, Fire, true);
    public static Skill Agilao = new Skill("Agilao", 6, 10, Fire, true);
    public static Skill Agidyne = new Skill("Agidyne", 9, 15, Fire, true);
    public static Skill Agibarion = new Skill("Agibarion", 12,  20, Fire, true);
    //Multi Target
    public static Skill Maragi = new Skill("Maragi", 6, 5, Fire, false);
    public static Skill Maragion = new Skill("Maragion", 12, 10, Fire, false);
    public static Skill Maragidyne = new Skill("Maragidyne", 18, 15, Fire, false);
    public static Skill Maragibarion = new Skill("Maragibarion", 24, 20, Fire, false);
    
    //Ice
    //Single Target
    public static Skill Bufu = new Skill("Bufu", 3, 5, Ice, true);
    public static Skill Bufula = new Skill("Bufula", 6, 10, Ice, true);
    public static Skill Bufudyne = new Skill("Bufudyne", 9, 15, Ice, true);
    public static Skill Bufubarion = new Skill("Bufubarion", 12, 20, Ice, true);
    //Multi Target
    public static Skill Mabufu = new Skill("Mabufu", 6, 5, Ice, false);
    public static Skill Mabufula = new Skill("Mabufula", 12, 10, Ice, false);
    public static Skill Mabufudyne = new Skill("Mabufudyne", 18, 15, Ice, false);
    public static Skill Mabufubarion = new Skill("Mabufubarion", 24, 20, Ice, false);
    
    //Electric
    //Single Target
    public static Skill Zio = new Skill("Zio", 3, 5, Electric, true);
    public static Skill Zionga = new Skill("Zionga", 6, 10, Electric, true);
    public static Skill Ziodyne = new Skill("Ziodyne", 9, 15, Electric, true);
    public static Skill Ziobarion = new Skill("Ziobarion", 12, 20, Electric, true);
    //Multi Target
    public static Skill Mazio = new Skill("Mazio", 6, 5, Electric, false);
    public static Skill Mazionga = new Skill("Mazionga", 12, 10, Electric, false);
    public static Skill Maziodyne = new Skill("Maziodyne", 18, 15, Electric, false);
    public static Skill Maziobarion = new Skill("Maziobarion", 24, 20, Electric, false);

    //Wind
    //Single Target
    public static Skill Garu = new Skill("Garu", 3, 5, Wind, true);
    public static Skill Garula = new Skill("Garula", 6, 10, Wind, true);
    public static Skill Garudyne = new Skill("Garudyne", 9, 15, Wind, true);
    public static Skill Garubarion = new Skill("Garubarion", 12, 20, Wind, true);

}