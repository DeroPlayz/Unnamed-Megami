package Combat;

import static Combat.Element.*;
import static lib.MafLib.*;

public class Skill {
    private String Name;
    private String Description; private int Cost;
    private int Power; //Damage for Attacks, Potency for Healing, Success Rate for Instant Kills
    private Element Type;
    private boolean SingleTarget;
    private int Chance;

    public Skill(String Name, int Cost, int Power, Element Type, boolean SingleTarget, String Description){
        this.Name = Name;
        this.Cost = Cost;
        this.Power = Power;
        this.Chance = 0;
        this.Type = Type;
        this.SingleTarget = SingleTarget;
    }

    public String toString(){
        String s = "";
        
        if(Type.equals(Fire)){s = RED;}
        if(Type.equals(Ice)){s = BLUE;}
        if(Type.equals(Electric)){s = YELLOW;}
        if(Type.equals(Wind)){s = GREEN;}
        if(Type.equals(Bless)){s = WHITE;}
        if(Type.equals(Curse)){s = BLACK;}

        s += Name + " (";
        
        if(Type.equals(Physical)){

        }
        else{
            s += Cost + " SP)\n" + RESET;
        }
        
        s += Description;
        return s;
    }


    //Fire
    //Single Target
    public static Skill Agi = new Skill("Agi", 3, 5, Fire, true, "Weak fire damage to 1 foe.");
    public static Skill Agilao = new Skill("Agilao", 6, 10, Fire, true, "Medium fire damage to 1 foe.");
    public static Skill Agidyne = new Skill("Agidyne", 9, 15, Fire, true, "Heavy fire damage to 1 foe.");
    public static Skill Agibarion = new Skill("Agibarion", 12,  20, Fire, true, "Severe fire damage to 1 foe.");
    //Multi Target
    public static Skill Maragi = new Skill("Maragi", 6, 5, Fire, false, "Weak fire damage to all foes.");
    public static Skill Maragion = new Skill("Maragion", 12, 10, Fire, false, "Medium fire damage to all foes.");
    public static Skill Maragidyne = new Skill("Maragidyne", 18, 15, Fire, false, "Heavy fire damage to all foes.");
    public static Skill Maragibarion = new Skill("Maragibarion", 24, 20, Fire, false, "Severe fire damage to all foes.");
    
    //Ice
    //Single Target
    public static Skill Bufu = new Skill("Bufu", 3, 5, Ice, true, "Weak ice damage to 1 foe.");
    public static Skill Bufula = new Skill("Bufula", 6, 10, Ice, true, "Medium ice damage to 1 foe.");
    public static Skill Bufudyne = new Skill("Bufudyne", 9, 15, Ice, true, "Heavy ice damage to 1 foe.");
    public static Skill Bufubarion = new Skill("Bufubarion", 12, 20, Ice, true, "Severe ice damage to 1 foe.");
    //Multi Target
    public static Skill Mabufu = new Skill("Mabufu", 6, 5, Ice, false, "Weak ice damage to all foes.");
    public static Skill Mabufula = new Skill("Mabufula", 12, 10, Ice, false, "Medium ice damage to all foes.");
    public static Skill Mabufudyne = new Skill("Mabufudyne", 18, 15, Ice, false, "Heavy ice damage to all foes.");
    public static Skill Mabufubarion = new Skill("Mabufubarion", 24, 20, Ice, false, "Severe ice damage to all foes.");
    
    //Electric
    //Single Target
    public static Skill Zio = new Skill("Zio", 3, 5, Electric, true, "Weak electric damage to 1 foe.");
    public static Skill Zionga = new Skill("Zionga", 6, 10, Electric, true, "Medium electric damage to 1 foe.");
    public static Skill Ziodyne = new Skill("Ziodyne", 9, 15, Electric, true, "Heavy electric damage to 1 foe.");
    public static Skill Ziobarion = new Skill("Ziobarion", 12, 20, Electric, true, "Severe electric damage to 1 foe.");
    //Multi Target
    public static Skill Mazio = new Skill("Mazio", 6, 5, Electric, false, "Weak electric damage to all foes.");
    public static Skill Mazionga = new Skill("Mazionga", 12, 10, Electric, false, "Medium electric damage to all foes.");
    public static Skill Maziodyne = new Skill("Maziodyne", 18, 15, Electric, false, "Heavy electric damage to all foes.");
    public static Skill Maziobarion = new Skill("Maziobarion", 24, 20, Electric, false, "Severe electric damage to all foes.");

    //Wind
    //Single Target
    public static Skill Garu = new Skill("Garu", 3, 5, Wind, true, "Weak wind damage to 1 foe.");
    public static Skill Garula = new Skill("Garula", 6, 10, Wind, true, "Medium wind damage to 1 foe.");
    public static Skill Garudyne = new Skill("Garudyne", 9, 15, Wind, true, "Heavy wind damage to 1 foe.");
    public static Skill Garubarion = new Skill("Garubarion", 12, 20, Wind, true, "Severe wind damage to 1 foe.");
    //Multi Target
    public static Skill Magaru = new Skill("Magaru", 3, 5, Wind, false, "Weak wind damage to all foes.");
    public static Skill Magarula = new Skill("Magarula", 6, 10, Wind, false, "Medium wind damage to all foes.");
    public static Skill Magarudyne = new Skill("Magarudyne", 9, 15, Wind, false, "Heavy wind damage to all foes.");
    public static Skill Magarubarion = new Skill("Magarubarion", 12, 20, Wind, false, "Severe wind damage to all foes.");

}