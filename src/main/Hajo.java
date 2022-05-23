
package main;

public class Hajo {
    private int[] poz;//=new int[3];
    
    Hajo(int[] pozk){
        this.poz=pozk;
    }
    
    public String talalat(int pozk){
        int i = 0, N=this.poz.length;
        while (i<N && !(poz[i]==pozk)) {
        i++;
        }
        return i < N ? "talált":"nem talált";
    }
    public int getHossz(){
        return poz.length;
    }
}
