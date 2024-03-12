package Entity;

import static Arcanum.Arcana.Fool;
// import static Game.Main.log;
// import static World.Map.World;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Item.Item;
// import lib.MafLib;
import lib.MafLib;

public class Player extends Entity{
    public static Player player = new Player();

    private String First;                       public void setFirst(String First){this.First = First;}                 public String getFirst(){return First;}
    private String Last;                        public void setLast(String Last){this.Last = Last;}                     public String getLast(){return Last;}
    private Item[] Inventory = new Item[15];    public void setInventory(Item[] Inventory){this.Inventory = Inventory;} public Item[] getInventory(){return Inventory;}
    private double Cash;                        public void setCash(double Cash){this.Cash = Cash;}                     public double getCash(){return Cash;}
    private int Level;                          public void setLevel(int Level){this.Level = Level;}                    public int getLevel(){return Level;}

    public void saveGame(){
        FileOutputStream FOS;
        try{
            new File("Save/Player").createNewFile();
            FOS = new FileOutputStream("Save/Player");
            ObjectOutputStream OOS = new ObjectOutputStream(FOS);
            OOS.writeObject(First);
            OOS.writeObject(Last);
            OOS.writeObject(Inventory);
            OOS.writeObject(Cash);
            OOS.writeObject(Level);
            OOS.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void loadGame(){
            try{
                FileInputStream FIS = new FileInputStream("Save/Player");
                ObjectInputStream OIS = new ObjectInputStream(FIS);
                First = (String) OIS.readObject();
                Last = (String) OIS.readObject();
                Inventory = (Item[]) OIS.readObject();
                Cash = (double) OIS.readObject();
                Level = (int) OIS.readObject();
                OIS.close();
            }
            catch(ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
    }
    
    public Player(String First, String Last){
        super((First + Last), Fool);
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
        String s = First + Last + "\nLevel: " + Level + "\nCash: $" + String.format("%.2f", Cash) + "\nInventory: ";
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

    public static final int Act_Mode_World_Map = 0;
    public static final int Act_Mode_Combat = 1;

    public void act(int actMode){
        if(actMode == 0){
            System.out.println("What would you like to do?\n1. Move\n2. Party Status\n3. Settings");
            int answer = MafLib.askInt("", false);
            if(answer == 1){
                move();
            }
            
        }
        else if(actMode == 1){
            System.out.println("What would you like to do?\n1. Melee\n2. Magic\n3. Items\n4. Party Status\n5. Attempt to Escape");
        }
    }

    public void move(){
        System.out.println("Where would you like to move?\n1. Up.\n2. Down\n3. Left\n4. Right\n0. Go Back");
        int answer = MafLib.askInt("", false);
        if(answer == 1){
            setZ(getZ() - 1);
        }
        if(answer == 2){
            setZ(getZ() + 1);
        }
        if(answer == 3){
            setZ(getZ() - 1);
        }
        if(answer == 4){
            setZ(getZ() + 1);
        }
        if(answer == 5){
            act(Act_Mode_World_Map);
        }
    }
}