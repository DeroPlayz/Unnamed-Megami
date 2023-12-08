package Entity.Actor;

import Item.Item;
// import lib.MafLib;

import static Arcanum.Arcana.Fool;
// import static Game.Main.log;
// import static World.Map.World;

// import java.text.NumberFormat;
// import java.util.Locale;

import Game.Main;

public class Player extends Actor{
    private String First; public void setFirst(String First){this.First = First;} public String getFirst(){return First;}
    private String Last; public void setLast(String Last){this.Last = Last;} public String getLast(){return Last;}
    private Item[] Inventory = new Item[15]; public void setInventory(Item[] Inventory){this.Inventory = Inventory;} public Item[] getInventory(){return Inventory;}
    private double Cash; public void setCash(double Cash){this.Cash = Cash;} public double getCash(){return Cash;}
    private int Level;

    public void saveGame(){Main.saveGame();}
    public void loadGame(){Main.loadGame();}
    
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
        
        s += "<html><br>Level: " + Level + "<html><br>Cash: $" + String.format("%.2f", Cash) + "<html><br>Inventory: ";
        for(int i = 1; i < Inventory.length; i++){
            if(i%5 == 0){
                s += "<html><br>";
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
        return "";
    }

    // public void act(){
    //     String response = MafLib.askString("What would you like to do?\n1. Move.\n2. Map.\n3. Settings", true);
    //     if(response.equals("1")){
            
    //     }
    //     else if(response.equals("2")){
    //         System.out.println(World);
    //     }
    //     else if(response.equals("3")){
    //         settings();
    //     }
    //     else{
    //         act();
    //     }
    // }
}