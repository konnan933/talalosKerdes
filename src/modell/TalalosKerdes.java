
package modell;

public class TalalosKerdes{
    
    private String kerdes;
    private String feladat;
    private KincsesLada[] kincsesLadak = new KincsesLada[3];

    public TalalosKerdes(String kerdes, String feladat) {
        this.kerdes = kerdes;
        this.feladat = feladat;
        setKincsesLadak();
    }

    private void setKincsesLadak() {
        for (int i = 0; i < kincsesLadak.length; i++) {
            this.kincsesLadak[i] = new KincsesLada(KincsesLada.SZINEK[i]);
        }
    }
    
    

}
