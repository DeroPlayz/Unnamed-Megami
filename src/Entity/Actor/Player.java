package Entity.Actor;

import Item.Item;
import lib.MafLib;

import static Arcanum.Arcana.Fool;
import static World.Map.World;

import Game.Main;

public class Player extends Actor{
    private String First; public void setFirst(String First){this.First = First;} public String getFirst(){return First;}
    private String Last; public void setLast(String Last){this.Last = Last;} public String getLast(){return Last;}
    String Name = First + " " + Last;
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

    public Player(){
        super("Dummy", Fool);
    }

    public String toString(){
        Name = First + " " + Last;        
        String s = "Name: " + Name + "\nLevel: " + Level;
        return s;
    }

    public void act(){
        String response = MafLib.askString("What would you like to do?\n1. Move.\n2. Map.\n3. Settings", true);
        if(response.equals("1")){
            
        }
        else if(response.equals("2")){
            System.out.println(World);
        }
        else if(response.equals("3")){
            settings();
        }
        else{
            act();
        }
    }

    public void settings(){
        String response = MafLib.askString("What setting would you like to change?\n1. Save.\n2. Load.\n0. Back.", true);
            if(response.equals("1")){
                saveGame();
            }
            else if(response.equals("2")){
                loadGame();
            }
            else if(response.equals("0")){
                act();
            }
            else{
                settings();
            }
            // else if(response.equals("3")){
            //     response = MafLib.askString("What response type would you like?\nNumerical - Answer with the number corresponding to your desired action.\nText - Answer by typing out the action you would like to take, verbatim (but not case-sensitive.)\nDifficult - The same as Text, but the game will not print out the options to show you.", true);
            // }
    }
}