package Entity;

import static Arcanum.Arcana.Fool;
// import static Game.Main.log;
// import static World.Map.World;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Item.Item;
// import lib.MafLib;

public class Player extends Entity{
    public static Player player = new Player();

    private String First;                       public void setFirst(String First){this.First = First;}                 public String getFirst(){return First;}
    private String Last;                        public void setLast(String Last){this.Last = Last;}                     public String getLast(){return Last;}
    private Item[] Inventory = new Item[15];    public void setInventory(Item[] Inventory){this.Inventory = Inventory;} public Item[] getInventory(){return Inventory;}
    private double Cash;                        public void setCash(double Cash){this.Cash = Cash;}                     public double getCash(){return Cash;}
    private int Level;                          public void setLevel(int Level){this.Level = Level;}                    public int getLevel(){return Level;}

    public void saveGame() throws IOException{
        FileOutputStream FOS = new FileOutputStream("Save/Player");
        ObjectOutputStream OOS = new ObjectOutputStream(FOS);
        OOS.writeObject(First);
        OOS.writeObject(Last);
        OOS.writeObject(Inventory);
        OOS.writeObject(Cash);
        OOS.writeObject(Level);
        OOS.close();
    }

    public void loadGame() throws IOException, ClassNotFoundException{
        FileInputStream FIS = new FileInputStream("Save/Player");
        ObjectInputStream OIS = new ObjectInputStream(FIS);
        First = (String) OIS.readObject();
        Last = (String) OIS.readObject();
        Inventory = (Item[]) OIS.readObject();
        Cash = (double) OIS.readObject();
        Level = (int) OIS.readObject();
        OIS.close();
    }
    
    public Player(String First, String Last){
        super((First + " " + Last), Fool);
        this.First = First;
        this.Last = Last;
    }

    public Player(String name){
        super(name, Fool);
        if(name.indexOf(" ") == -1){
            First = name;
            Last = "";
        }
        else{
            First = name.substring(0, name.indexOf(" "));
            Last = name.substring(name.indexOf(" "));
        }
    }

    public Player(){
        super("Dummy", Fool);
    }

    public String toString(){
        String s = "";
        if(Last.equals("")){
            s += "Name: " + First;
        }
        else{
            s += Last + ", " + First;
        }
        
        s += "\nLevel: " + Level + "\nCash: $" + String.format("%.2f", Cash) + "\nInventory: ";
        for(int i = 1; i < Inventory.length; i++){
            if(i%5 == 0){
                s += "\n";
            }
            if(i == Inventory.length - 1){
                s += "& ";
            }
            if(Inventory[i] == null){
                s += "Empty.";
                return s;
            }
            else{
                s += Inventory[i] + ", ";
            }
        }
        return s;
    }
}