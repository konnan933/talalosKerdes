package teszt;
import modell.KincsesLada;

public class Teszt {
   
    public static void main(String[] args) {
        new Teszt();  
    }

    public Teszt() {
        szinTeszt();
        kincses_eTeszt();
        allitasTeszt();
        
    }
   
   
   public void szinTeszt (){
       KincsesLada arany = new KincsesLada("arany");
       if(arany.getSzin().equals("arany")){
           System.out.println("Névteszt végigment sikeresen!");
       }
  }
   
   public void kincses_eTeszt(){
       KincsesLada ezust = new KincsesLada("ezüst");
       if (ezust.getKincses_e() == true) {
           System.out.println("Kincses_e teszt végigment sikeresen");
       }
   }
   public void allitasTeszt(){
       KincsesLada bronz = new KincsesLada("bronz");
       if(bronz.getAllitas()=="az arany hazudik"){
           System.out.println("Az állitás teszt végigment sikeresen");
       }
   }
    
    
    
}
