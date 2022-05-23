
package main;

public class TorpedoTeszt {
    private Hajo hajo;
    public static void main(String[] args) {
        //System.out.println("TESZT");
        //assert 3==5:"Nem jó a találat ellenőrzése";
        //String e = new TorpedoTeszt().tesztLoves(4);
        //System.out.println(e);
    }
    
    public String tesztLoves(int poz){
       
        
        String t = hajo.talalat(poz);
        assert t.equals("talált"):"nem jó a találta ellenőrzése";
        return t;
    }
    
    
    
    
}
