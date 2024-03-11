package Entity.Actor;

import static Combat.Skill.*;

import java.util.ArrayList;

import Arcanum.Arcana;

import Combat.Skill;

public class Enemy extends Actor {
    public Enemy(String Name, Arcana Arcana, int MaxHP, int MaxSP, int[] SMEAL, Skill[] Skills) {
        super(Name, Arcana);
        super.Skills = Skills;
        this.MaxHP = HP = MaxHP;
        this.MaxSP = SP = MaxSP;
        Strength = SMEAL[0];
        Magic = SMEAL[1];
        Endurance = SMEAL[2];
        Agility = SMEAL[3];
        Luck = SMEAL[4];
    }

    final Enemy Pixie = new Enemy("Pixie", Arcanum.Arcana.Lovers, 15, 15, new int[]{0, 0, 0, 0, 0}, new Skill[]{Dia});
    public static Enemy eOne;
    public static Enemy eTwo;
    public static Enemy eThree;
    public static Enemy eFour;
    public static Enemy eFive;
    public static Enemy eSix;

    public static ArrayList<Enemy> EnemyParty = new ArrayList<>(){{
        // add(eOne);
        // add(eTwo);
        // add(eThree);
        // add(eFour);
        // add(eFive);
        // add(eSix);
    }};
}
