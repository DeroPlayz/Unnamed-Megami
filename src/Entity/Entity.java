package Entity;

public abstract class Entity{
    private String Name; public String getName(){return Name;} public void setName(String Name){this.Name = Name;}
    private String Arcana; public String getArcana(){return Arcana;} public void setArcana(String Arcana){this.Arcana = Arcana;}

    public Entity(String Name){
        this.Name = Name;
    }
}