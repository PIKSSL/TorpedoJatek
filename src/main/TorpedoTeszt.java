
package main;

public class TorpedoTeszt {
    private Hajo hajo = new Hajo();
    public static void main(String[] args) {
        System.out.println("TESZT");
        //assert 3==5:"Nem jó a találat ellenőrzése";
        new TorpedoTeszt().tesztLoves(4);
    }
    
    public String tesztLoves(int poz){
        String t = hajo.talalat(poz);
        assert t.equals("talált"):"nem jó a találta ellenőrzése";
        return "jo";
    }
    
    
    
    
}
