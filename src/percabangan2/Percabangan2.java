package percabangan2;

import java.util.Scanner;

public class Percabangan2 {

    public static void main(String[] args) {
        String huruf;
        
        Scanner key = new Scanner(System.in);
        System.out.print("masukkan huruf = ");
        huruf = key.next();
        
        if (huruf.equalsIgnoreCase("a")){
            System.out.println(huruf + " huruf vokal");
        } else if (huruf.equalsIgnoreCase("i")){
            System.out.println(huruf + " huruf vokal");
        } else if (huruf.equalsIgnoreCase("u")){
            System.out.println(huruf + " huruf vokal");
        } else if (huruf.equalsIgnoreCase("e")){
            System.out.println(huruf + " huruf vokal");
        } else if (huruf.equalsIgnoreCase("o")){
            System.out.println(huruf + " huruf vokal");  
        } else {
            System.out.println(huruf + " huruf konsonan");
        }
    }
    
}
