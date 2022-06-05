package nezet;

import java.awt.Component;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import modell.TalalosKerdes;

public class TalalosKerdesFrame extends javax.swing.JFrame {
    private final URL[] DEFURL = {getClass().getResource("/nezet/arany_lada.jpg"),getClass().getResource("/nezet/ezust_lada.jpg"),getClass().getResource("/nezet/bronz_lada.jpg")};
    private Icon[] defIcon = new Icon[3];
    private JButton[] ladaGombok = new JButton[3];
    private final static TalalosKerdes talalosKerdes = new TalalosKerdes();
    private Boolean felfedve = false;

    public TalalosKerdesFrame() {
        initComponents();
        cimekLada();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        allitasokPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        aranyAllitas = new javax.swing.JLabel();
        ezustAllitas = new javax.swing.JLabel();
        bronzAllitas = new javax.swing.JLabel();
        kerdesHely = new javax.swing.JLabel();
        vezerlesPanel = new javax.swing.JPanel();
        felfedBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ladakPanel = new javax.swing.JPanel();
        aranyBtn = new javax.swing.JButton();
        ezustBtn = new javax.swing.JButton();
        bronzBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Találos Kérdés"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Feladat"));

        jLabel3.setText("Kérdés:");

        allitasokPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Állítások"));

        jLabel6.setText("Ezüst:");

        jLabel5.setText("Arany:");

        jLabel7.setText("Bronz:");

        javax.swing.GroupLayout allitasokPanelLayout = new javax.swing.GroupLayout(allitasokPanel);
        allitasokPanel.setLayout(allitasokPanelLayout);
        allitasokPanelLayout.setHorizontalGroup(
            allitasokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allitasokPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allitasokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allitasokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aranyAllitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ezustAllitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bronzAllitas, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addContainerGap())
        );
        allitasokPanelLayout.setVerticalGroup(
            allitasokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allitasokPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allitasokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(aranyAllitas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allitasokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ezustAllitas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allitasokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bronzAllitas))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kerdesHely, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(allitasokPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addComponent(kerdesHely, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allitasokPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        vezerlesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Vezérlés"));

        felfedBtn.setText("Kincs felfedése");
        felfedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                felfedBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Újra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ujra(evt);
            }
        });

        javax.swing.GroupLayout vezerlesPanelLayout = new javax.swing.GroupLayout(vezerlesPanel);
        vezerlesPanel.setLayout(vezerlesPanelLayout);
        vezerlesPanelLayout.setHorizontalGroup(
            vezerlesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vezerlesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vezerlesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(felfedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vezerlesPanelLayout.setVerticalGroup(
            vezerlesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vezerlesPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(felfedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        ladakPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ládák"));

        aranyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/arany_lada.jpg"))); // NOI18N
        aranyBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        aranyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aranyBtnActionPerformed(evt);
            }
        });

        ezustBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ezust_lada.jpg"))); // NOI18N
        ezustBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ezustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ezustBtnActionPerformed(evt);
            }
        });

        bronzBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/bronz_lada.jpg"))); // NOI18N
        bronzBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bronzBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bronzBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ladakPanelLayout = new javax.swing.GroupLayout(ladakPanel);
        ladakPanel.setLayout(ladakPanelLayout);
        ladakPanelLayout.setHorizontalGroup(
            ladakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ladakPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(aranyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(ezustBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(bronzBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ladakPanelLayout.setVerticalGroup(
            ladakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ladakPanelLayout.createSequentialGroup()
                .addGroup(ladakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ladakPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aranyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ladakPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(ladakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bronzBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ezustBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ladakPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(vezerlesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(vezerlesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(ladakPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JButton[] gombok(JButton[] gombok) {
        Component comp[] = ladakPanel.getComponents();

        for (int i = 0; i < gombok.length; i++) {
            gombok[i] = (JButton) comp[i];
        }
        return gombok;
    }

    private void ladakepcsere(int melyik, Boolean kincses_e) {
        URL iconURL;
        if (kincses_e) {
            iconURL = getClass().getResource("/nezet/kincses.jpg");
        } else {
            iconURL = getClass().getResource("/nezet/kincsnelkuli.png");
        }
        defIcon[melyik] = ladaGombok[melyik].getIcon();
        ImageIcon icon = new ImageIcon(iconURL);
        ladaGombok[melyik].setIcon(icon);
        
    }
    
    private int ablak(String szoveg){
        int ablak = new JOptionPane().showConfirmDialog(null, szoveg);
        return ablak;
    }
    private void ujrakezdes_e(int valasz){
        if(valasz == 0){
            for (int i = 0; i < defIcon.length; i++) {
            if (defIcon[i] != null) {
                ladaGombok[i].setIcon(defIcon[i]);
            }
        }
        }              
    }
    private void felugro(Boolean kicnses_e){
        int valasz;
        if (kicnses_e) {
            valasz = ablak("Gratulálok eltaláltad!\nElölről kezded?");
        }
        else{
            valasz = ablak("Sajnálom nem eltaláltad.\nElölről kezded?");
        }
        ujrakezdes_e(valasz);
    }
    private void aranyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aranyBtnActionPerformed
        ladakepcsere(0, false);
        felugro(false);
    }//GEN-LAST:event_aranyBtnActionPerformed

    private void ezustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ezustBtnActionPerformed
        ladakepcsere(1, true);
        felugro(true);
    }//GEN-LAST:event_ezustBtnActionPerformed

    private void bronzBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bronzBtnActionPerformed
        ladakepcsere(2, false);
        felugro(false);
        
    }//GEN-LAST:event_bronzBtnActionPerformed

    private void felfedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_felfedBtnActionPerformed
        if (!felfedve) {
            felfedve = true;
            for (int i = 0; i < ladaGombok.length; i++) {
                if (i % 2 == 0) {
                    ladakepcsere(i, false);
                } else {
                    ladakepcsere(i, true);
                }
            }
            felfedBtn.setText("Kincs elfedése");
        } else {
            felfedve = false;
            ujrakezdes_e(0);
            felfedBtn.setText("Kincs felfedése");
        }
        
    }//GEN-LAST:event_felfedBtnActionPerformed

    private void ujra(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ujra
        for (int i = 0; i < ladaGombok.length ; i++) {
            ImageIcon icon = new ImageIcon(DEFURL[i]);
            ladaGombok[i].setIcon(icon);
        }
    }//GEN-LAST:event_ujra

    private void cimekLada() {

        ladaGombok = gombok(ladaGombok);

        for (int i = 0; i < ladaGombok.length; i++) {

            Border borderTitle = BorderFactory.createTitledBorder(talalosKerdes.getKincsesLadak()[i].getSzin());
            ladaGombok[i].setBorder(borderTitle);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allitasokPanel;
    private javax.swing.JLabel aranyAllitas;
    private javax.swing.JButton aranyBtn;
    private javax.swing.JLabel bronzAllitas;
    private javax.swing.JButton bronzBtn;
    private javax.swing.JLabel ezustAllitas;
    private javax.swing.JButton ezustBtn;
    private javax.swing.JButton felfedBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kerdesHely;
    private javax.swing.JPanel ladakPanel;
    private javax.swing.JPanel vezerlesPanel;
    // End of variables declaration//GEN-END:variables
}
