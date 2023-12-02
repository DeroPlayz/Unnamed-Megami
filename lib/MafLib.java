package lib;

import java.util.Scanner;

public class MafLib{
    public static final String RESET = "\033[0m";
    public static final String CLEARC = "\033[39m";
    public static final String CLEARF = "\033[22m" + "\033[23m" + "\033[24m" + "\033[27m" + "\033[28" + "\033[29m";
    public static final String BLACK = "\033[30m";
    public static final String RED = "\033[31m";
    public static final String GREEN = "\033[32m"; //Mint Green
    public static final String YELLOW = "\033[33m";
    public static final String BLUE = "\033[34m"; //Dark Blue
    public static final String MAGENTA = "\033[35m";
    public static final String CYAN = "\033[36m";
    public static final String WHITE = "\033[37m";
    public static final String BOLD = "\033[1m";
    public static final String UNDERLINE = "\033[4m";
    public static final String STRIKE = "\033[9m";
    public static final String INVERT = "\033[7m";
    public static final String HIDE = "\033[8m";
    
    static Scanner Scan = new Scanner(System.in);
    
    public static String askString(String Prompt, Boolean EndOnNewline){
        if(EndOnNewline == true){
            System.out.println(Prompt);
        }
        if(EndOnNewline == false){
            System.out.print(Prompt);
        } 
        String response = Scan.nextLine();
        return response;
    }

    public static int askInt(String Prompt, Boolean EndOnNewline){
        String nl = "";
        if(EndOnNewline == true){
            nl = "\n";
        }
        System.out.print(Prompt + nl);
        String response = Scan.next();
        response = response.replaceAll("[^0-9.]", "");
        int dot = response.indexOf(".");
        if(dot == -1){
            response = response.replaceAll("[^0-9]", "");
        }
        else{
            response = response.substring(0, dot);
        }
        return Integer.valueOf(response);
        
    }

    public static double askDouble(String Prompt, Boolean EndOnNewline){
        String nl = "";
        if(EndOnNewline == true){
            nl = "\n";
        }
        System.out.print(Prompt + nl);
        String response = Scan.next();
        response = response.replaceAll("[^0-9]", "");
        if(response.contains(".") == false){
            return Double.valueOf(response + ".0");
        }
        else{
            return Integer.valueOf(response);
        }
        
    }

    public static boolean isAlpha(String s){
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            int j = i + 1;
            String t;
            if(i + 1 >= s.length()){
                t = s.substring(i);
            }
            else{
                t = s.substring(i, j);
            }
            if("abcdefghijklmnopqrstuvwxyz".contains(t) == false){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isNumeric(String s){
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if("1234567890.".contains(asString(s.charAt(i))) == false){
                return false;
            }
        }
        return true;
    }
     
    public static String asString(char c){
        return String.valueOf(c);
    }

    public static String reduce(String s){
        return s.strip().toLowerCase();
    }

    public static int ArrayInd(Object[] a, String s){
        int ind = -1;
        for(int i = 0; i < a.length; i ++){
            if(s.equals(a[i])){
                ind = i;
            }
        }
        return ind;
    }
}