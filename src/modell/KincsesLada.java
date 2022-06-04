

package modell;


public class KincsesLada {
    private final String[] ALLITASOK = {"én rejtem a kincset", "nem én rejtem a kincset", "az arany hazudik"};
    private String szin;
    private String allitas;
    private Boolean kincses_e;

    public KincsesLada(String szin, String allitas, Boolean kincses_e) {
        setSzin(szin);
        setAllitas(szin);
        setKincses_e(kincses_e);
    }
    
    
    

    private void setSzin(String szin) {
        this.szin = szin;
    }

    private void setAllitas(String szin) {
        if(szin.equals("arany")){
            this.allitas = ALLITASOK[0];
        }else if(szin.equals("ezüst")){
            this.allitas = ALLITASOK[1];
        }else if(szin.equals("bronz")){
            this.allitas = ALLITASOK[2];
        }
    }

    private void setKincses_e(Boolean kincses_e) {
        this.kincses_e = kincses_e;
    }
    
    
}


