/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User1
 */
public class Ablak extends javax.swing.JFrame {

//    private Modell modell=null;

    /**
     * Creates new form Ablak
     */
    
   public Ablak() {

        initComponents();
     
    }

//   public Ablak(Modell modell) {
//        this.modell=modell;
//        initComponents();
//        setLocationRelativeTo(this);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        Jfeladat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jvalasz = new javax.swing.JTextField();
        jBMasikFeladat = new javax.swing.JButton();
        jBMegoldas = new javax.swing.JButton();
        jBUjra = new javax.swing.JButton();
        jPanelStat = new javax.swing.JPanel();
        jLKerdesekSzama = new javax.swing.JLabel();
        jLProbalkozasok = new javax.swing.JLabel();
        jLMuveletrebontas = new javax.swing.JLabel();
        jLSzazalekosEredmeny = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Összeadás", "Kivonás", "Szorzás", "Osztás" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Jfeladat.setText("feladat");
        Jfeladat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Jfeladat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JfeladatMouseClicked(evt);
            }
        });
        Jfeladat.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                JfeladatInputMethodTextChanged(evt);
            }
        });

        jLabel4.setText("=");

        jBMasikFeladat.setText("Másik feladatot kérek!");
        jBMasikFeladat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMasikFeladatActionPerformed(evt);
            }
        });

        jBMegoldas.setText("Kérem a megoldást!");
        jBMegoldas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBMegoldasMouseClicked(evt);
            }
        });

        jBUjra.setText("Újra");

        jPanelStat.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        jLKerdesekSzama.setText("Kérdések száma:");

        jLProbalkozasok.setText("Összes próbálkozás:");

        jLMuveletrebontas.setText("Eredmények műveletekre bontása: ");

        jLSzazalekosEredmeny.setText("Elért eredmény százalékos formában:");

        javax.swing.GroupLayout jPanelStatLayout = new javax.swing.GroupLayout(jPanelStat);
        jPanelStat.setLayout(jPanelStatLayout);
        jPanelStatLayout.setHorizontalGroup(
            jPanelStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatLayout.createSequentialGroup()
                .addGroup(jPanelStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLProbalkozasok)
                    .addComponent(jLMuveletrebontas)
                    .addComponent(jLKerdesekSzama)
                    .addComponent(jLSzazalekosEredmeny))
                .addGap(0, 101, Short.MAX_VALUE))
        );
        jPanelStatLayout.setVerticalGroup(
            jPanelStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLKerdesekSzama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLProbalkozasok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMuveletrebontas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSzazalekosEredmeny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(67, Short.MAX_VALUE)
                        .addComponent(jBUjra)
                        .addGap(18, 18, 18)
                        .addComponent(jBMasikFeladat)
                        .addGap(18, 18, 18)
                        .addComponent(jBMegoldas))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(Jfeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jvalasz, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jfeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Jvalasz, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMasikFeladat)
                    .addComponent(jBMegoldas)
                    .addComponent(jBUjra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//        Random rnd=new Random();
//        int szam= rnd.nextInt(101);
////        System.out.println(szam);
//        int oszto=rnd.nextInt(101);
////        System.out.println(oszto);
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        Random rnd=new Random();
        int szam= rnd.nextInt(101);
//        System.out.println(szam);
        int oszto=rnd.nextInt(101);
//        System.out.println(oszto);
System.out.println("");        System.out.println("Feladat: ");

        System.out.printf(szam+"/"+ oszto+"=");
        System.out.println("");
        Scanner sc=new Scanner(System.in);
        System.out.println("Kérem az eredményt: ");
        int valasz=sc.nextInt();
//        System.out.println(valasz);
        System.out.println("");
        int eredmeny= szam/oszto;
        if (valasz!=eredmeny) {
            System.out.println("Rossz válasz. Ez lett volna a helyes válasz: "+eredmeny);
        }else{
            System.out.println("Helyes válasz!");
        }
        
//        System.out.println(eredmeny);

//        String f = "12/3";
//        System.out.println();
//                System.out.println("12/2=");
                
     
    }//GEN-LAST:event_jComboBox1ActionPerformed
 
    private void jBMasikFeladatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMasikFeladatActionPerformed
        // TODO add your handling code here:
//        System.out.println("");
        System.out.println("*másik feladat*");
////        Random rnd=new Random();
////        int szam= rnd.nextInt(101);
//////        System.out.println(szam);
////        int oszto=rnd.nextInt(101);
////        System.out.println(oszto);
//
//        System.out.printf(szam+"/"+ oszto+"=");
////        System.out.println("");
    }//GEN-LAST:event_jBMasikFeladatActionPerformed

    private void JfeladatInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JfeladatInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JfeladatInputMethodTextChanged

    private void JfeladatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JfeladatMouseClicked
        // TODO add your handling code here:
        System.out.println("feladat");
    }//GEN-LAST:event_JfeladatMouseClicked

    private void jBMegoldasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMegoldasMouseClicked
        // TODO add your handling code here:
//        System.out.printf(szam+"/"+ oszto+"=");
//        System.out.println("");
    }//GEN-LAST:event_jBMegoldasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ablak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jfeladat;
    private javax.swing.JTextField Jvalasz;
    private javax.swing.JButton jBMasikFeladat;
    private javax.swing.JButton jBMegoldas;
    private javax.swing.JButton jBUjra;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLKerdesekSzama;
    private javax.swing.JLabel jLMuveletrebontas;
    private javax.swing.JLabel jLProbalkozasok;
    private javax.swing.JLabel jLSzazalekosEredmeny;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelStat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
