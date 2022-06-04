package main;

import modell.KincsesLada;

public class Program {

    
    public static void main(String[] args) {
        KincsesLada arany = new KincsesLada("Arany");
        System.out.println(arany.toString());
        KincsesLada ezust = new KincsesLada("Ezüst");
        System.out.println(ezust.toString());
        KincsesLada bronz = new KincsesLada("Bronz");
        System.out.println(bronz.toString());
        
    }
    
}
