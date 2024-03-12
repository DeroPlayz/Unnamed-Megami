import static Entity.Player.player;
// FileInputStream input = new FileInputStream("src/settings.properties");
// Properties p = new Properties();
// p.load(input);

import Entity.Enemy;
import lib.MafLib;

public class Main{
    
    public static void main(String[] args){
        player.setName(MafLib.askString("Welcome. What is your first and last name?", true));
        player.setFirst(player.getName().substring(0, player.getName().indexOf("")));
        player.setLast(player.getName().substring(player.getName().indexOf("")));
        player.saveGame();
    }


}