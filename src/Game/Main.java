package Game;

// import static World.Map.*;
import static Scenes.Scene.Title;
// import java.util.concurrent.CountDownLatch;
import static lib.MafLib.response;

import java.awt.BorderLayout;
// import java.awt.Color;
import java.awt.Component;
// import java.awt.FlowLayout;
// import java.awt.Cursor;
import java.awt.Font;
// import java.awt.GridBagConstraints;
// import java.awt.GridBagLayout;
// import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
// import java.awt.event.MouseEvent;
// import java.awt.event.MouseListener;
// import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.imageio.ImageIO;
// import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
// import javax.swing.JComponent;
// import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JPopupMenu;
// import javax.swing.JComponent;
// import javax.swing.JPanel;
// import javax.swing.JList;
// import javax.swing.JPopupMenu;
// import javax.swing.JTextField;
import javax.swing.SwingConstants;
// import javax.swing.SwingUtilities;
// import javax.swing.border.Border;

import Entity.Actor.Player;
// import java.util.Properties;
import Item.Item;
import Scenes.Scene;
import lib.MafLib;

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
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        returnToTitle();
        frame.setSize(1000, 600);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void newGame(){
        MafLib.askString("<html>Initializing new save.<br>What is your name?<br>Note: Separate first and last name with a space. (\" \")");
                MafLib.response.addKeyListener(new KeyListener(){
                
                    @Override
                    public void keyTyped(KeyEvent e) {
                    }
        
                    @Override
                    public void keyPressed(KeyEvent e) {
                        if(e.getKeyCode() == 10){
                            String ans = MafLib.reduce(response.getText());
                            if(ans.equals("crazy?")){
                                String[] cheats = {"Name", "Level", "XP", "HP", "SP", "Strength", "Magic", "Endurance", "Agility", "Luck", "Cash"};
                                JComboBox devMenu = new JComboBox<>(cheats);
                                devMenu.setBackground(new Color(255, 255, 255));
                                devMenu.setVisible(true);
                                frame.add(devMenu);
                                devMenu.setBounds(69, 420, 150, 40);
                                frame.remove(MafLib.response);
                                frame.revalidate();
                                frame.repaint();
        
                                devMenu.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.out.println(devMenu.getSelectedItem());
                                        if(devMenu.getSelectedItem().equals("Name")){
                                            MafLib.askString("Cheat activated. Enter your new name.");
                                            MafLib.response.addKeyListener(new KeyListener() {
                                                @Override public void keyTyped(KeyEvent e) {}
                                                @Override
                                                public void keyPressed(KeyEvent e) {
                                                    if(e.getKeyCode() == 10){
                                                        player.setName(response.getText());
                                                    }
                                                }
                                                @Override public void keyReleased(KeyEvent e) {}
                                            });
                                        }
                                        else{
                                            MafLib.askString("Cheat activated. Enter your desired " + devMenu.getSelectedItem() + ".");
                                            MafLib.response.addKeyListener(new KeyListener() {
        
                                                @Override public void keyTyped(KeyEvent e) {}
                                                @Override
                                                public void keyPressed(KeyEvent e) {
                                                    if(e.getKeyCode() == 10){
                                                        if(MafLib.isNumeric(response.getText()) == true){
                                                            double val = Double.valueOf(response.getText());
                                                            // if(devMenu.getSelectedItem().equals("Level")){player.setLevel((int) val);}
                                                            // if(devMenu.getSelectedItem().equals("XP")){player.setXP((int) val);}
                                                            if(devMenu.getSelectedItem().equals("HP")){player.setMaxHP((int) val);}
                                                            if(devMenu.getSelectedItem().equals("SP")){player.setMaxSP((int) val);}
                                                            if(devMenu.getSelectedItem().equals("Strength")){player.setStrength((int) val);}
                                                            if(devMenu.getSelectedItem().equals("Magic")){player.setMagic((int) val);}
                                                            if(devMenu.getSelectedItem().equals("Endurance")){player.setEndurance((int) val);}
                                                            if(devMenu.getSelectedItem().equals("Agility")){player.setAgility((int) val);}
                                                            if(devMenu.getSelectedItem().equals("Luck")){player.setLuck((int) val);}
                                                            if(devMenu.getSelectedItem().equals("Cash")){player.setCash(val);}
                                                            saveGame();
                                                        }
                                                    }
                                                }
                                        @Override public void keyReleased(KeyEvent e) {}
                                            });
                                        }

                                    }
                            
                                });
                            }
                        else{
                            player = new Player(ans);
                            saveGame();
                        }
            }
        }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        
        });
        
    }

    public static void saveGame(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Save))) {
            out.writeObject(player.getFirst());
            //System.out.println(player.getFirst());
            out.writeObject(player.getLast());
            //System.out.println(player.getLast());
            out.writeObject(player.getInventory());
            //System.out.println(player.getInventory());
            out.writeObject(player.getCash());
            //System.out.println(player.getCash());
            log.setText("<html>Saved successfully.<br>" + player);
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
            MafLib.askString("<html>Error. Corrupted/non-existent save. Initializing new save.<br>What is your name?<br>Note: Separate first and last name with a space. (\" \")");
            player = new Player(MafLib.response.getText());
        }
    }

    public static void settings(){
        log.setText("What setting would you like to change?");
        openSettings(Title);
    }

    public static void clearScreen(){
        Component[] components = frame.getContentPane().getComponents();
        for(int i = 0; i < components.length; i++){
            frame.remove(components[i]);
            frame.revalidate();
            frame.repaint();
        }
    }
    public static void returnToTitle(){
        clearScreen();
        JButton exit = new JButton("Exit to Desktop");
        frame.add(start);
        frame.add(load);
        frame.add(title);
        frame.add(settings);
        frame.add(exit);

        BufferedImage icon;
        try {
            icon = ImageIO.read(new File("src/icon.png"));
            frame.setIconImage(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.setAutoRequestFocus(true);
        frame.setTitle("UNNAMED-MEGAMI (NOT FINISHED) [DO NOT DISTRIBUTE]");
        
        // JPanel panel = new JPanel();
        // panel.setLayout(new FlowLayout());
        // frame.getContentPane().add(panel);

        frame.setLayout(null);

        frame.add(title);
        
        frame.add(start, BorderLayout.CENTER);
        frame.add(load, BorderLayout.CENTER);
        frame.add(settings, BorderLayout.CENTER);
        frame.add(log, BorderLayout.WEST);
        
        title.setBounds(600, 100, frame.getWidth(), 50);
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        
        log.setBounds(1, 0, frame.getWidth(), frame.getWidth());
        log.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        log.setVerticalAlignment(SwingConstants.TOP);

        load.setBounds(680, 275, 200, 50);
        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadGame();
            }

        });

        start.setBounds(680, 200, 200, 50);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newGame();
            }
        });

        settings.setBounds(680, 350, 200, 50);    
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                settings();
            }
        });

        exit.setBounds(680, 425, 200, 50);
        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            
        });
    }

    public static void openSettings(Scene s){
        clearScreen();
        JButton back = new JButton("Back");
        JButton deleteSave = new JButton("Delete Current Save File.");
        back.setBounds(680, 400, 200, 50);
        deleteSave.setBounds(680, 500, 200, 50);
        frame.add(back);
        frame.add(deleteSave);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(s.equals(Title)){
                    returnToTitle();
                }
            }
        });
        deleteSave.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                File save = new File("Save");  
                save.delete();
                log.setText("Save deleted.");
                player = new Player();
            }
        });
    }
}