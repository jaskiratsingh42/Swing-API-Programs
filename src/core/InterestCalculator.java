package core;

import Index.Index;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InterestCalculator.java
 *
 * Created on 22 Jul, 2015, 5:23:08 AM
 */

/**
 *
 * @author GAMER
 INTERS*/
public class InterestCalculator extends javax.swing.JFrame {

    /** Creates new form principalamnt */
    public InterestCalculator() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        CALCULATE = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INTEREST CALCULAOR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 90, 32));

        t2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 106, 38));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ENTER PRINCIPAL AMOUNT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ENTER TIME PERIOD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("RATE OF INTEREST FOR YOU IS ---");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, -1, -1));

        t3.setEditable(false);
        t3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 45, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("INTEREST AMOUNT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 212, -1, -1));

        t4.setEditable(false);
        t4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 211, 87, 36));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("GRAND TOTAL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 271, 183, -1));

        t5.setEditable(false);
        t5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 271, 74, 34));

        CALCULATE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CALCULATE.setText("CALCULATE");
        CALCULATE.setName(""); // NOI18N
        CALCULATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULATEActionPerformed(evt);
            }
        });
        getContentPane().add(CALCULATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, 41));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("%");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 150, -1, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText(">>");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 265, 45, 41));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Index/home.png"))); // NOI18N
        home.setToolTipText("Go Back to Index Page");
        home.setBorderPainted(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CALCULATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULATEActionPerformed
 int PRINCIPAL =Integer.parseInt(t1.getText());
int TIME = Integer.parseInt(t2.getText());
if (PRINCIPAL>10000)
    t3.setText("6");
else
    t3.setText("5");
 int RATE = Integer. parseInt(t3.getText());
 int INTEREST = PRINCIPAL*RATE*TIME/100;
 t4.setText(""+INTEREST);
 int TOTAL = PRINCIPAL+INTEREST;
 t5.setText(""+TOTAL);

 

      
    }//GEN-LAST:event_CALCULATEActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Index  frame =new Index();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterestCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CALCULATE;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables

}
