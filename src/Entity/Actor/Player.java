import Item.Item;
import static Arcanum.Arcana.Fool;

class Player extends Actor{
    private String First; public void setFirst(String First){this.First = First;} public String getFirst(){return First;}
    private String Last; public void setLast(String Last){this.Last = Last;} public String getLast(){return Last;}
    String Name = First + " " + Last;
    private Item[] Inventory = new Item[15]; public void setInventory(Item[] Inventory){this.Inventory = Inventory;} public Item[] getInventory(){return Inventory;}
    private double Cash; public void setCash(double Cash){this.Cash = Cash;} public double getCash(){return Cash;}
    private int Level;
    
    public Player(String First, String Last){
        super((First + " " + Last), Fool);
        this.First = First;
        this.Last = Last;
    }

    public Player(){
        super("Dummy", Fool);
    }

    public String toString(){
        Name = First + " " + Last;        
        String s = "Name: " + Name + "\nLevel: " + Level;
        return s;
    }
}