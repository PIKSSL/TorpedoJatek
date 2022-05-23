
package main;

import java.util.Scanner;

public class Program {
    static boolean sulyed;
    static int palya = 5, lovessz=0;
    
    public static void main(String[] args) {
        
    }
    
    public static void loves(){
        Hajo hajo = general();
        int hajohossz = hajo.getHossz();
        Scanner beker = new Scanner(System.in);
        while(!sulyed){
            String loves = hajo.talalat(beker.nextInt());
            lovessz++;
            //if()
            
        }
    }
    
    public static Hajo general(){
        int rnd = (int) (Math.random()*5);
        Hajo hajo = new Hajo(new int[]{rnd,rnd+1,rnd+2});
        return hajo;
    }
}
