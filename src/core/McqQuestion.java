package core;

import Index.Index;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * McqQuestion.java
 *
 * Created on 22 Jul, 2015, 6:21:03 AM
 */

/**
 *
 * @author GAMER
 */
public class McqQuestion extends javax.swing.JFrame {

    /** Creates new form temperature */
    public McqQuestion() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        l1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c = new javax.swing.JRadioButton();
        a = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        b = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        d = new javax.swing.JRadioButton();
        ANSWER = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ANSWER THIS QUESTION");
        setBackground(new java.awt.Color(255, 204, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.red);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 660, 70));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 740, 10));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("WHAT IS THE BOILING POINT OF WATER");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("(a.)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("(c.)");

        buttonGroup1.add(c);
        c.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c.setText("100ºC");

        buttonGroup1.add(a);
        a.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a.setText("102ºC");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("(b.)");

        buttonGroup1.add(b);
        b.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b.setText("284 K");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("(d.)");

        buttonGroup1.add(d);
        d.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d.setText("300 K");

        ANSWER.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ANSWER.setForeground(new java.awt.Color(51, 204, 0));
        ANSWER.setText("Check answer");
        ANSWER.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        ANSWER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANSWERActionPerformed(evt);
            }
        });

        EXIT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Index/home.png"))); // NOI18N
        home.setToolTipText("Go Back to Index Page");
        home.setBorderPainted(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(c)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(a)
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b)
                                    .addComponent(d)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(ANSWER)
                                .addGap(40, 40, 40)
                                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a)
                        .addComponent(jLabel6)
                        .addComponent(b)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(d))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c)
                        .addComponent(jLabel5)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EXIT)
                    .addComponent(ANSWER, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 580, 300));

        getAccessibleContext().setAccessibleName("temp. of water");
        getAccessibleContext().setAccessibleDescription("temp. of water");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ANSWERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANSWERActionPerformed

if (c.isSelected()==true)

     l1.setText("YOUR ANSWER IS RIGHT. ");
else
    l1.setText("YOUR ANSWER IS WRONG .RIGHT ANSWER IS option.(c) ");
    
    }//GEN-LAST:event_ANSWERActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
System.exit(0);  
    }//GEN-LAST:event_EXITActionPerformed

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
                new McqQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANSWER;
    private javax.swing.JButton EXIT;
    private javax.swing.JRadioButton a;
    private javax.swing.JRadioButton b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton c;
    private javax.swing.JRadioButton d;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables

}