import java.util.Scanner;

public class MafLib{
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