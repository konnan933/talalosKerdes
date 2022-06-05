

package modell;


public class KincsesLada {
    private final String[] ALLITASOK = {"én rejtem a kincset", "nem én rejtem a kincset", "az arany hazudik"};
    public final static String[] SZINEK = {"arany","ezüst","bronz"};
    private String szin;
    private String allitas;
    private Boolean kincses_e;
    
    public KincsesLada(String szin) {
        setSzin(szin);
        setAllitas(szin);
        setKincses_e(szin);
    }
    

    private void setSzin(String szin) {
        this.szin = szin;
    }

    private void setAllitas(String szin) {
        szin = szin.toLowerCase();
        if(szin.equals(SZINEK[0])){
            this.allitas = ALLITASOK[0];
        }else if(szin.equals(SZINEK[1])){
            this.allitas = ALLITASOK[1];
        }else if(szin.equals(SZINEK[2])){
            this.allitas = ALLITASOK[2];
        }
    }

    private void setKincses_e(String szin) {
        szin = szin.toLowerCase();
        if(szin.equals(SZINEK[0])){
            this.kincses_e = false;
        }else if(szin.equals(SZINEK[1])){
            this.kincses_e = true;
        }else if(szin.equals(SZINEK[2])){
            this.kincses_e = false;
        }
    }

    public String getSzin() {
        return szin;
    }

    public String getAllitas() {
        return allitas;
    }

    public Boolean getKincses_e() {
        return kincses_e;
    }  
    @Override
    public String toString() {
        return "KincsesLada{" + "szin=" + szin + ", allitas=" + allitas + ", kincses_e=" + kincses_e + '}';
    }
    
    
}


