/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.myproject.aisecondproject;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    extendedPanel jPanel2;
    public Shape shape;
    public ArrayList<Shape>myShapes;
    Double LearningRate;
    int epoch;
    public MainFrame() 
    {
        initComponents();
        shape=new Shape();
        myShapes = new ArrayList<Shape>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new extendedPanel();
        jLabel1 = new javax.swing.JLabel();
        triangleRB = new javax.swing.JRadioButton();
        squareRB = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        LRTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        classifyBTN = new javax.swing.JButton();
        epNumTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 410, 350));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        jLabel1.setText("Binary Classifier");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        buttonGroup1.add(triangleRB);
        triangleRB.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        triangleRB.setText("Triangle");
        jPanel1.add(triangleRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        buttonGroup1.add(squareRB);
        squareRB.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        squareRB.setText("Square");
        jPanel1.add(squareRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel2.setText("Learning Rate");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        LRTF.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        LRTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LRTFActionPerformed(evt);
            }
        });
        jPanel1.add(LRTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 130, 40));

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel3.setText("# epoch");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        classifyBTN.setBackground(new java.awt.Color(255, 218, 0));
        classifyBTN.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        classifyBTN.setText("Classify");
        classifyBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        classifyBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classifyBTNActionPerformed(evt);
            }
        });
        jPanel1.add(classifyBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 110, 50));

        epNumTF.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        epNumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epNumTFActionPerformed(evt);
            }
        });
        jPanel1.add(epNumTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void LRTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LRTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LRTFActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:;
 
        shape = new Shape();
        Point p =new Point();
        p.x=evt.getX();
        p.y=evt.getY();
        shape.setX(p.x);
        shape.setY(p.y);

        if(triangleRB.isSelected())
            shape.setType("triangle");

        else if (squareRB.isSelected())
            shape.setType("square");

        myShapes.add(shape);
        jPanel2.draw(shape);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void classifyBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classifyBTNActionPerformed
        // TODO add your handling code here:
        jPanel2.clearLines();
        LearningRate=Double.parseDouble(LRTF.getText());
        System.out.println(LearningRate);
        epoch=Integer.parseInt(epNumTF.getText());
//        double max=2.4/2;
//        double min=-2.4/2;
//        double range = (max - min) + 1;     
//        TH= (int)(Math.random() * range) + min;
//        Weight_1=(int)(Math.random() * range) + min;
//        Weight_2=(int)(Math.random() * range) + min;
//        
//        
//         if(Classes.getSelectedIndex()==1)
//        {   
//            
//            Perceptron_Learn("circle");
//            getPoints();
//            p1.drawLine((int)x1,(int)y1,(int) x2, (int)y2);
//            System.out.println("(x1,y1)  ("+x1+","+y1+")");
//            System.out.println("(x2,y2)  ("+x2+","+y2+")");
//        }
    }//GEN-LAST:event_classifyBTNActionPerformed

    private void epNumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epNumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epNumTFActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LRTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton classifyBTN;
    private javax.swing.JTextField epNumTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton squareRB;
    private javax.swing.JRadioButton triangleRB;
    // End of variables declaration//GEN-END:variables
}
