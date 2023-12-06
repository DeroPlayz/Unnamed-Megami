package Game;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.CountDownLatch;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

// import java.util.Properties;
import Item.Item;
import lib.MafLib;
import Entity.Actor.Player;

// import static lib.MafLib.*;
import static World.Map.*;

// FileInputStream input = new FileInputStream("src/settings.properties");
// Properties p = new Properties();
// p.load(input);

public class Main implements Serializable{
    public static JFrame frame = new JFrame();
    public static JLabel log = new JLabel();
    public static JLabel title = new JLabel("UNNAMED MEGAMI BETA");
    public static JButton load = new JButton("Load");
    public static JButton start = new JButton("New");
    public static JButton settings = new JButton("Settings");

    public static Player player = new Player();
    static final String Save = "Save";
        
    public static void main(String[] args) throws IOException{
        BufferedImage icon = ImageIO.read(new File("src/icon.png"));
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setFocusable(true);
        frame.setAutoRequestFocus(true);
        frame.setTitle("UNNAMED-MEGAMI (NOT FINISHED) [DO NOT DISTRIBUTE]");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setIconImage(icon);
        frame.setLayout(null);
        frame.add(title);
        frame.add(load);
        frame.add(start);
        frame.add(settings);
        frame.add(log);
        title.setBounds(700, 100, 200, 15);
        load.setBounds(680, 275, 200, 50);
        start.setBounds(680, 200, 200, 50);
        settings.setBounds(680, 350, 200, 50);
        log.setVerticalAlignment(SwingConstants.TOP);
        log.setBounds(1, 0, frame.getWidth(), frame.getWidth());
        

        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadGame();
            }

        });
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newGame();
                saveGame();
            }
        });
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                settings();
            }
        });
        frame.addMouseMotionListener((MouseMotionListener) new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent e) {
            }

            @Override
            public void mouseDragged(MouseEvent e) {
            }
        });
    }

    public static void newGame(){
        player = new Player(MafLib.askString("<html>Initializing new save.<br>What is your name?<br>Note: Separate first and last name with a space. (\" \")"));
        MafLib.response.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                saveGame();
            }
        });
    }

    public static void saveGame(){
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Save))) {
                out.writeObject(player.getFirst());
                out.writeObject(player.getLast());
                out.writeObject(player.getInventory());
                out.writeObject(player.getCash());
                log.setText("Saved successfully.");
            } catch (IOException i) {
                i.printStackTrace();
            }                
    }
    public static void loadGame() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(Save))) {
            player.setFirst((String) in.readObject());
            player.setLast((String) in.readObject());
            player.setName(player.getFirst() + " " + player.getLast());
            player.setInventory((Item[]) in.readObject());
            player.setCash((double) in.readObject());
            log.setText("<html>Save loaded.<br>" + player.toString());
        } catch (IOException | ClassNotFoundException e) {
            player = new Player(MafLib.askString("Error. Corrupted/non-existent save. Initializing new save.<br>What is your name?<br>Note: Separate first and last name with a space. (\" \")"));
            saveGame();
        }
    }

    public static void settings(){
        log.setText("What setting would you like to change?");
        openSettings();
    }

    public static void clearScreen(){
        Component[] components = frame.getContentPane().getComponents();
        for(int i = 0; i < components.length; i++){
            frame.remove(components[i]);
        }
    }
    public static void returnToTitle(){
        clearScreen();
        frame.add(start);
        frame.add(load);
        frame.add(title);
        frame.add(settings);
    }

    public static void openSettings(String goBack){
        clearScreen();
        JButton back = new JButton();
        JButton deleteSave = new JButton("Delete Current Save File.");
        back.setbounds(680, 350, 200, 50);
        frame.add(back);
        frame.add(deleteSave);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(goBack.equals("Title")){
                    returnToTitle();               
                }
                if(goBack.equals("Game")){

                }
            }
        });
        deleteSave.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                File save = new File("Save");  
                save.delete();
            }
        });
    }
}