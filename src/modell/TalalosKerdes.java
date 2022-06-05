
package modell;

public class TalalosKerdes{
    
    private final static String KERDES = "<html>3 láda közül az egyik rejti a kincset. Mindegyiken van egy felirat ,<br/> de csak az egyik láda állítása igaz!<html>";
    private final static String FELADAT = "Találd ki hol van a kincs! Kattints a megfelelő ládára";
    private KincsesLada[] kincsesLadak = new KincsesLada[3];

    public TalalosKerdes() {
        setKincsesLadak();
    }

    private void setKincsesLadak() {
        for (int i = 0; i < kincsesLadak.length; i++) {
            this.kincsesLadak[i] = new KincsesLada(KincsesLada.SZINEK[i]);
        }
    }

    public String getKERDES() {
        return KERDES;
    }

    public String getFELADAT() {
        return FELADAT;
    }
    
    
    
    
    public KincsesLada[] getKincsesLadak() {
        return kincsesLadak;
    }  

}
