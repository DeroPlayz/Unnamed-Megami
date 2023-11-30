import Entities.Entity;
import src.Arcana;
public abstract class Actor extends Entity{
    private Arcana Arcana; public Arcana getArcana(){return Arcana;} public void setArcana(Arcana Arcana){this.Arcana = Arcana;}
    
    public Actor(String Name, Arcana Arcana){}
}