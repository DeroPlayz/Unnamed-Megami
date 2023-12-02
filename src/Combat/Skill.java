package Combat;

import static Combat.Element.*;
import static lib.MafLib.*;

import java.util.ArrayList;

public class Skill {
    private String Name;
    private String Description; private int Cost;
    private int Power; //Damage for Attacks, Potency for Healing, Success Rate for Instant Kills
    private Element Type;
    private boolean SingleTarget;
    
    private int Function; 
        static final int Damage = 0;
        static final int Healing = 1;
        static final int Instant = 2;
        static final int Assist = 3; 

    public Skill(String Name, int Function, int Cost, int Power, Element Type, boolean SingleTarget, String Description){
        this.Name = Name;
        this.Cost = Cost;
        this.Power = Power;
        this.Type = Type;
        this.Function = Function;
        this.SingleTarget = SingleTarget;
        this.Description = Description;
    }

    public String toString(){
        String s = "";
        
        if(Type.equals(Fire)){s = RED;}
        if(Type.equals(Ice)){s = BLUE;}
        if(Type.equals(Electric)){s = YELLOW;}
        if(Type.equals(Wind)){s = GREEN;}
        if(Type.equals(Bless)){s = WHITE;}
        if(Type.equals(Curse)){s = BLACK;}
        if(Type.equals(Support)){s = CYAN;}

        s += Name + " (";
        
        if(Type.equals(Physical)){

        }
        else{
            s += Cost + " SP)\n";
        }
        
        s += Description + RESET + "\n";
        return s;
    }


    //Fire
        //Single Target
            public static Skill Agi = new Skill("Agi", Damage, 3, 5, Fire, true, "Weak fire damage to 1 foe.");//
            public static Skill Agilao = new Skill("Agilao", Damage, 6, 10, Fire, true, "Medium fire damage to 1 foe.");
            public static Skill Agidyne = new Skill("Agidyne", Damage, 9, 15, Fire, true, "Heavy fire damage to 1 foe.");
            public static Skill Agibarion = new Skill("Agibarion", Damage, 12,  20, Fire, true, "Severe fire damage to 1 foe.");
        //Multi Target
            public static Skill Maragi = new Skill("Maragi", Damage, 6, 5, Fire, false, "Weak fire damage to all foes.");
            public static Skill Maragion = new Skill("Maragion", Damage, 12, 10, Fire, false, "Medium fire damage to all foes.");
            public static Skill Maragidyne = new Skill("Maragidyne", Damage, 18, 15, Fire, false, "Heavy fire damage to all foes.");
            public static Skill Maragibarion = new Skill("Maragibarion", Damage, 24, 20, Fire, false, "Severe fire damage to all foes.");
    
    //Ice
        //Single Target
            public static Skill Bufu = new Skill("Bufu", Damage, 3, 5, Ice, true, "Weak ice damage to 1 foe.");
            public static Skill Bufula = new Skill("Bufula", Damage, 6, 10, Ice, true, "Medium ice damage to 1 foe.");
            public static Skill Bufudyne = new Skill("Bufudyne", Damage, 9, 15, Ice, true, "Heavy ice damage to 1 foe.");
            public static Skill Bufubarion = new Skill("Bufubarion", Damage, 12, 20, Ice, true, "Severe ice damage to 1 foe.");
        //Multi Target
            public static Skill Mabufu = new Skill("Mabufu", Damage, 6, 5, Ice, false, "Weak ice damage to all foes.");
            public static Skill Mabufula = new Skill("Mabufula", Damage, 12, 10, Ice, false, "Medium ice damage to all foes.");
            public static Skill Mabufudyne = new Skill("Mabufudyne", Damage, 18, 15, Ice, false, "Heavy ice damage to all foes.");
            public static Skill Mabufubarion = new Skill("Mabufubarion", Damage, 24, 20, Ice, false, "Severe ice damage to all foes.");
    
    //Electric
        //Single Target
            public static Skill Zio = new Skill("Zio", Damage, 3, 5, Electric, true, "Weak electric damage to 1 foe.");
            public static Skill Zionga = new Skill("Zionga", Damage, 6, 10, Electric, true, "Medium electric damage to 1 foe.");
            public static Skill Ziodyne = new Skill("Ziodyne", Damage, 9, 15, Electric, true, "Heavy electric damage to 1 foe.");
            public static Skill Ziobarion = new Skill("Ziobarion", Damage, 12, 20, Electric, true, "Severe electric damage to 1 foe.");
        //Multi Target
            public static Skill Mazio = new Skill("Mazio", Damage, 6, 5, Electric, false, "Weak electric damage to all foes.");
            public static Skill Mazionga = new Skill("Mazionga", Damage, 12, 10, Electric, false, "Medium electric damage to all foes.");
            public static Skill Maziodyne = new Skill("Maziodyne", Damage, 18, 15, Electric, false, "Heavy electric damage to all foes.");
            public static Skill Maziobarion = new Skill("Maziobarion", Damage, 24, 20, Electric, false, "Severe electric damage to all foes.");

    //Wind
        //Single Target
            public static Skill Garu = new Skill("Garu", Damage, 3, 5, Wind, true, "Weak wind damage to 1 foe.");
            public static Skill Garula = new Skill("Garula", Damage, 6, 10, Wind, true, "Medium wind damage to 1 foe.");
            public static Skill Garudyne = new Skill("Garudyne", Damage, 9, 15, Wind, true, "Heavy wind damage to 1 foe.");
            public static Skill Garubarion = new Skill("Garubarion", Damage, 12, 20, Wind, true, "Severe wind damage to 1 foe.");
        //Multi Target
            public static Skill Magaru = new Skill("Magaru", Damage, 3, 5, Wind, false, "Weak wind damage to all foes.");
            public static Skill Magarula = new Skill("Magarula", Damage, 6, 10, Wind, false, "Medium wind damage to all foes.");
            public static Skill Magarudyne = new Skill("Magarudyne", Damage, 9, 15, Wind, false, "Heavy wind damage to all foes.");
            public static Skill Magarubarion = new Skill("Magarubarion", Damage, 12, 20, Wind, false, "Severe wind damage to all foes.");

    //Light
        //Single Target
            public static Skill Hama = new Skill("Hama", Instant, 8, 20, Bless, true, "Low chance to instantly kill 1 foe.");
            public static Skill Hamaon = new Skill("Hamaon", Instant, 16, 40, Bless, true, "Medium chance to instantly kill 1 foe.");
            public static Skill Hamadyne = new Skill("Hamadyne", Instant, 20, 60, Bless, true, "High chance to instantly kill 1 foe.");
        //Multi Target
            public static Skill Mahama = new Skill("Mahama", Instant, 16, 20, Bless, true, "Low chance to instantly kill all foes.");
            public static Skill Mahamaon = new Skill("Mahamaon", Instant, 32, 40, Bless, true, "Medium chance to instantly kill all foes.");
            public static Skill Mahamadyne = new Skill("Mahamadyne", Instant, 40, 60, Bless, true, "High chance to instantly kill all foes.");

    //Dark
        //Single Target
            public static Skill Mudo = new Skill("Mudo", Instant, 8, 20, Curse, true, "Low chance to instantly kill 1 foe.");
            public static Skill Mudoon = new Skill("Mudoon", Instant, 16, 40, Curse, true, "Medium chance to instantly kill 1 foe.");
            public static Skill Mudodyne = new Skill("Mudodyne", Instant, 20, 60, Curse, true, "High chance to instantly kill 1 foe.");
        //Multi Target
            public static Skill Mamudo = new Skill("Mamudo", Instant, 16, 20, Curse, true, "Low chance to instantly kill all foes.");
            public static Skill Mamudoon = new Skill("Mamudoon", Instant, 32, 40, Curse, true, "Medium chance to instantly kill all foes.");
            public static Skill Mamudodyne = new Skill("Mamudodyne", Instant, 40, 60, Curse, true, "High chance to instantly kill all foes.");


    //Support
        //Healing
            //Single Target
                public static Skill Dia = new Skill("Dia", Healing, 6, 6, Support, true, "Slightly heal 1 ally.");
                public static Skill Diarama = new Skill("Dia", Healing, 12, 9, Support, true, "Moderately heal 1 ally.");
                public static Skill Diarahan = new Skill("Dia", Healing, 24, 100, Support, true, "Fully heal 1 ally.");
            //Multi Target
                public static Skill Media = new Skill("Media", Healing, 12, 6, Support, false, "Slightly heal all allies.");
                public static Skill Mediarama = new Skill("Mediarama", Healing, 24, 9, Support, false, "Moderately heal all allies.");
                public static Skill Mediarahan = new Skill("Mediarahan", Healing, 48, 100, Support, false, "Fully heal all allies.");
        //Buffs
            //Single Target
                public static Skill Tarukaja = new Skill("Tarukaja", Assist, 8, 0, Support, true, "Raise 1 ally's attack for 3 turns.");
                public static Skill Rakukaja = new Skill("Rakukaja", Assist, 8, 0, Support, true, "Raise 1 ally's defense for 3 turns.");
                public static Skill Sukukaja = new Skill("Sukukaja", Assist, 8, 0, Support, true, "Raise 1 ally's accuracy for 3 turns.");
            //Multi Target
                public static Skill Matarukaja = new Skill("Matarukaja", Assist, 24, 0, Support, false, "Raise party's attack for 3 turns.");
                public static Skill Marakukaja = new Skill("Marakukaja", Assist, 24, 0, Support, false, "Raise party's defense for 3 turns.");
                public static Skill Masukukaja = new Skill("Masukukaja", Assist, 24, 0, Support, false, "Raise party's accuracy for 3 turns.");

        public static Skill[] SKILLS = {Agi, Agilao, Agidyne, Agibarion, Maragi, Maragion, Maragidyne, Maragibarion, Bufu, Bufula, Bufudyne, Bufubarion, Mabufu, Mabufula, Mabufudyne, Mabufubarion, Zio, Zionga, Ziodyne, Ziobarion, Mazio, Mazionga, Maziodyne, Maziobarion, Garu, Garula, Garudyne, Garubarion, Magaru, Magarula, Magarudyne, Magarubarion, Hama, Hamaon, Hamadyne, Mahama, Mahamaon, Mahamadyne, Mudo, Mudoon, Mudodyne, Mamudo, Mamudoon, Mamudodyne, Dia, Diarama, Diarahan, Media, Mediarama, Mediarahan, Tarukaja, Rakukaja, Sukukaja, Matarukaja, Marakukaja, Masukukaja};
}