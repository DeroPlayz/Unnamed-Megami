package Combat;

import static Combat.Element.*;

public class Skill {
    private String Name;
    private int Power; //Damage for Attacks, Potency for Healing
    private Element Type;
    private boolean SingleTarget;

    public Skill(String Name, int Power, Element Type){
        this.Name = Name;
        this.Power = Power;
        this.Type = Type;
    }

    //Fire
        //Single Target
            Skill Agi = new Skill("Agi", 5, Fire);
            Skill Agilao = new Skill("Agilao", 5, Fire);
            Skill Agidyne = new Skill("Agidyne", 5, Fire);
            Skill Agibarion = new Skill("Agibarion", 5, Fire);
        //Multi Target
            Skill Maragi = new Skill("Maragi", 5, Fire);
            Skill Maragion = new Skill("Maragion", 5, Fire);
            Skill Maragidyne = new Skill("Maragidyne", 5, Fire);
            Skill Maragibarion = new Skill("Maragibarion", 5, Fire);
    /*
     *
     */
    //Ice
        //Single Target
            Skill Bufu = new Skill("Bufu", 5, Ice);
            Skill Bufula = new Skill("Bufula", 5, Ice);
            Skill Bufudyne = new Skill("Bufudyne", 5, Ice);
            Skill Bufubarion = new Skill("Bufubarion", 5, Ice);
        //Multi Target
            Skill Mabufu = new Skill("Mabufu", 5, Ice);
            Skill Mabufula = new Skill("Mabufula", 5, Ice);
            Skill Mabufudyne = new Skill("Mabufudyne", 5, Ice);
            Skill Mabufubarion = new Skill("Mabufubarion", 5, Ice);
    /*
     *
     */
    //Electric
        //Single Target
            Skill Zio = new Skill("Bufu", 5, Electric);
            Skill Zionga = new Skill("Bufula", 5, Electric);
            Skill Ziodyne = new Skill("Bufudyne", 5, Electric);
            Skill Ziobarion = new Skill("Bufubarion", 5, Electric);
        //Multi Target
            Skill Mazio = new Skill("Mazio", 5, Electric);
            Skill Mazionga = new Skill("Mazionga", 5, Electric);
            Skill Maziodyne = new Skill("Maziodyne", 5, Electric);
            Skill Maziobarion = new Skill("Maziobarion", 5, Electric);

}