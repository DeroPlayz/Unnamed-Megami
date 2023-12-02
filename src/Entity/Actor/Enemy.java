import static Combat.Skill.*;

import Arcanum.Arcana;

import Combat.Skill;

public class Enemy extends Actor {
    private Skill[] Skills;

    public Enemy(String Name, Arcana Arcana, int MaxHP, int MaxSP, int[] SMEAL, Skill[] Skills) {
        super(Name, Arcana);
        this.Skills = Skills;
        this.MaxHP = HP = MaxHP;
        this.MaxSP = SP = MaxSP;
        Strength = SMEAL[0];
        Magic = SMEAL[1];
        Endurance = SMEAL[2];
        Agility = SMEAL[3];
        Luck = SMEAL[4];
    }

    Enemy Pixie = new Enemy("Pixie", Arcanum.Arcana.Lovers, 15, 15, new int[]{0, 0, 0, 0, 0}, new Skill[]{Dia});
   
}
