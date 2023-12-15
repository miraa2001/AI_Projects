/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.myproject.aifirstproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class SimulatedAnnealingFrame extends javax.swing.JFrame {

    /**
     * Creates new form HillClimbingFrame
     */
    int n;
    int nextCounter=0;
    int bestH;
    int finalH=0;
    int numSuccessor=0;
    boolean solveUsedFlag=false;
    boolean [][]currentState;
    boolean [][]finalAnswer;
    boolean [][]bestState;
    ArrayList<MatrixWithHeuristic>  allSuccessors;
    ArrayList<MatrixWithHeuristic>  pathSuccessors;
    private JLabel[][] matrixLabels;
    
    public SimulatedAnnealingFrame() {
        initComponents();
        createMatrixLabels();
        finalAnswer=new boolean[n][n];
        bestState=new boolean[n][n];
        allSuccessors=new ArrayList<MatrixWithHeuristic>();
        pathSuccessors=new ArrayList<MatrixWithHeuristic>();
    }
    
    public SimulatedAnnealingFrame(int size) {
        this.n=size;
        initComponents();
        createMatrixLabels();
        finalAnswer=new boolean[n][n];
        bestState=new boolean[n][n];
        allSuccessors=new ArrayList<MatrixWithHeuristic>();
        pathSuccessors=new ArrayList<MatrixWithHeuristic>();
        currentState=new boolean[n][n];
        panelnxn.setVisible(true);
    }
    private void createMatrixLabels() {
        int rows = n;
        int cols = n;
        matrixLabels=new JLabel[rows][cols];
        // Create JLabel objects and add them to the matrixPanel
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JLabel l=new JLabel("", SwingConstants.CENTER);
                l.setName("0"); //0 means it's an empty spot
                                    //1 means it has a queen
                //GUI desgin configuration for the labels.                    
                matrixLabels[i][j] = l;
                matrixLabels[i][j].setFont(new Font("Arial", Font.PLAIN, 20));
                matrixLabels[i][j].setOpaque(true);
                matrixLabels[i][j].setBackground(Color.WHITE);
                matrixLabels[i][j].setForeground(Color.BLACK);
                //add the labels to the Panel
                panelnxn.add(matrixLabels[i][j]);
            }
        }
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
        startPanel = new javax.swing.JPanel();
        Randomize = new javax.swing.JButton();
        simAnnealingSolveBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelnxn = new javax.swing.JPanel();
        backLabel = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pathBTN = new javax.swing.JButton();
        bestSolutionBTN = new javax.swing.JButton();
        coolingRateTF = new javax.swing.JTextField();
        initTempTF = new javax.swing.JTextField();
        coolingRateRB = new javax.swing.JRadioButton();
        tMaxRB = new javax.swing.JRadioButton();
        FTorMaxI = new javax.swing.JLabel();
        FTorMaxIterationsTF = new javax.swing.JTextField();
        initTLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        startPanel.setBackground(new java.awt.Color(153, 204, 255));
        startPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Randomize.setBackground(new java.awt.Color(255, 218, 0));
        Randomize.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        Randomize.setText("Randomize");
        Randomize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Randomize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomizeActionPerformed(evt);
            }
        });
        startPanel.add(Randomize, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 170, 60));

        simAnnealingSolveBTN.setBackground(new java.awt.Color(255, 218, 0));
        simAnnealingSolveBTN.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        simAnnealingSolveBTN.setText("Solve");
        simAnnealingSolveBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        simAnnealingSolveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simAnnealingSolveBTNActionPerformed(evt);
            }
        });
        startPanel.add(simAnnealingSolveBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 170, 60));

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 32)); // NOI18N
        jLabel3.setText("N - Queen");
        jLabel3.setOpaque(true);
        startPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 170, 40));

        panelnxn.setLayout(new java.awt.GridLayout(n, n, 5, 5));
        startPanel.add(panelnxn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 460, 340));

        backLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\E-Learning (Mira)\\aiFirstProject\\back.png"));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        startPanel.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 100, 40));

        outputLabel.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startPanel.add(outputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 370, 60));
        startPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 70, 30));

        pathBTN.setBackground(new java.awt.Color(255, 218, 0));
        pathBTN.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        pathBTN.setText("Path");
        pathBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pathBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathBTNActionPerformed(evt);
            }
        });
        startPanel.add(pathBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 170, 60));

        bestSolutionBTN.setBackground(new java.awt.Color(255, 218, 0));
        bestSolutionBTN.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        bestSolutionBTN.setText("Best Solution");
        bestSolutionBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bestSolutionBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestSolutionBTNActionPerformed(evt);
            }
        });
        startPanel.add(bestSolutionBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 170, 60));

        coolingRateTF.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        coolingRateTF.setForeground(new java.awt.Color(153, 153, 153));
        coolingRateTF.setText("Enter Cooling Rate");
        coolingRateTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coolingRateTFMouseClicked(evt);
            }
        });
        startPanel.add(coolingRateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 150, 40));

        initTempTF.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        initTempTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initTempTFActionPerformed(evt);
            }
        });
        startPanel.add(initTempTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 130, 40));

        buttonGroup1.add(coolingRateRB);
        coolingRateRB.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        coolingRateRB.setText("Cooling Rate");
        startPanel.add(coolingRateRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        buttonGroup1.add(tMaxRB);
        tMaxRB.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        tMaxRB.setText("Tmax/Log i");
        tMaxRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMaxRBActionPerformed(evt);
            }
        });
        startPanel.add(tMaxRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        FTorMaxI.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        FTorMaxI.setText("Final Temperature / Max Iterations");
        startPanel.add(FTorMaxI, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 105, 280, -1));

        FTorMaxIterationsTF.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        startPanel.add(FTorMaxIterationsTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 130, 40));

        initTLabel.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        initTLabel.setText("Initial Temperature");
        startPanel.add(initTLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 105, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(startPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(startPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void RandomizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomizeActionPerformed
        // TODO add your handling code here:
        //Empty out the label
        outputLabel.setText("");
        //Set all counters to 0 and clear ArrayLists
        nextCounter=0;
        allSuccessors.clear();
        pathSuccessors.clear();
        //If a new State is created using the randomize button
        //Then set the solveUsedFlag to Zero because Solve has not been clicked yet
        solveUsedFlag=false;
        Random rand = new Random();
        //Array of Random positions from 0 to (n-1) 
        /*   0 0 Q 0
             Q 0 0 Q
             0 0 0 0
             0 Q 0 0
             the values in randomPosition will be
            {1,3,0,1}
        */
        int []randomPosition=new int[n];
        initEmpty(); //call initEmpty() to empty all the labels in the panel
        for(int i=0;i<n;i++)
        {
            randomPosition[i]=rand.nextInt(n);
            matrixLabels[randomPosition[i]][i].setName("1");
            matrixLabels[randomPosition[i]][i].setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\E-Learning (Mira)\\aiFirstProject\\queen.png"));
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                //if label has Name=1 then put true on queenMatrix, otherwise put false
                /*
                false false true  false
                true  false false true
                false false false false
                false true  false false
                */
                currentState[i][j]= matrixLabels[i][j].getName().equals("1") ? true : false;
            }
        }
        //put the Heuristic for the random board in the label
        outputLabel.setText("Randomized State H="+calculateHeuristic(currentState));
        outputLabel.setBackground(new Color(255, 218, 0));
        outputLabel.setOpaque(true);
        outputLabel.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_RandomizeActionPerformed

    private void simAnnealingSolveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simAnnealingSolveBTNActionPerformed
        // TODO add your handling code here:
        solveUsedFlag=true;
        boolean [][]nextState=new boolean[n][n];
        int initialTemp=Integer.parseInt(initTempTF.getText());
        float coolingRate=0;
        int finalTemp=0;
        int maxIterations=0;
        int nextH,currentH=0;
        Random rand=new Random();
        ArrayList <boolean [][]> successors=new ArrayList<boolean [][]>();
        //copy currentState to best initially
        for (int v = 0; v < n; v++) 
        {
                System.arraycopy(currentState[v], 0, bestState[v], 0, n);
        }
        //clear arraylist if it has any previous elements
        pathSuccessors.clear();
        //if cooling rate method is selected proceed with formula t=t*cooling rate
        if(coolingRateRB.isSelected())
        {
            coolingRate=Float.parseFloat(coolingRateTF.getText());
            finalTemp=Integer.parseInt(FTorMaxIterationsTF.getText());
            // for loop from initT to finalT, update statement is t=t*coolingRate
            for(int t=initialTemp;t>finalTemp;t=(int) (t*coolingRate))
            {
                int randomIndex=rand.nextInt(n*(n-1));
                //choose a random number between 0 and n.(n-1)
                //if n=4, number of successors for a state will be 12 which is 
                // n*(n-1)=4*3=12
                System.out.println("Random Successor Chosen is #"+(randomIndex+1));
                //Make room for new successors
                allSuccessors.clear();
                //find successors of currentState to choose a random one
                findSuccessors(currentState);
                //copy a random successor to nextState
                for(int v=0;v<n;v++)
                    System.arraycopy(allSuccessors.get(randomIndex).getMatrix()[v], 0, nextState[v], 0, n);
                currentH=calculateHeuristic(currentState);
                nextH=calculateHeuristic(nextState);
                int deltaE=currentH-nextH;
                if(deltaE>0)
                {
                    for(int v=0;v<n;v++)
                        System.arraycopy(nextState[v], 0, currentState[v], 0, n);
                    currentH=nextH;
                    MatrixWithHeuristic q=new MatrixWithHeuristic(n,currentState,"H="+currentH);
                    pathSuccessors.add(q);
                    bestH=calculateHeuristic(bestState);
                    if(bestH>nextH)
                    {
                        for(int v=0;v<n;v++)
                            System.arraycopy(nextState[v], 0, bestState[v], 0, n);
                        bestH=nextH;
                    }
                }
                //Math.random()= 0<value<1
                else if( pow( Math.E , -deltaE/t ) > Math.random() )
                {
                    for(int v=0;v<n;v++)
                        System.arraycopy(nextState[v], 0, currentState[v], 0, n);
                    currentH=nextH;
                }
                    
            }
        }
        //if max iterations method is selected proceed with formula tc=tmax/log i
        else if(tMaxRB.isSelected())
        {
            float tc=0;
            maxIterations=Integer.parseInt(FTorMaxIterationsTF.getText());
            for(int i=2;i<maxIterations;i++)
            {
                tc= (float) ( initialTemp/ Math.log10(i));
                int indexRandom=rand.nextInt(n*(n-1));
                System.out.println("Random Successor Chosen is #"+(indexRandom+1));
                allSuccessors.clear();
                findSuccessors(currentState);
                for(int v=0;v<n;v++)
                    System.arraycopy(allSuccessors.get(indexRandom).getMatrix()[v], 0, nextState[v], 0, n);
                currentH=calculateHeuristic(currentState);
                nextH=calculateHeuristic(nextState);
                int deltaE=currentH-nextH;
                if(deltaE>0)
                {
                    for(int v=0;v<n;v++)
                        System.arraycopy(nextState[v], 0, currentState[v], 0, n);
                    currentH=nextH;
                    MatrixWithHeuristic q=new MatrixWithHeuristic(n,currentState,"H="+currentH);
                    pathSuccessors.add(q);
                    bestH=calculateHeuristic(bestState);
                    if(bestH>nextH)
                    {
                        for(int v=0;v<n;v++)
                            System.arraycopy(nextState[v], 0, bestState[v], 0, n);
                        bestH=nextH;
                    }
                }
                else if( pow(Math.E , -deltaE/tc ) > Math.random() )
                {
                    for(int v=0;v<n;v++)
                        System.arraycopy(nextState[v], 0, currentState[v], 0, n);
                    currentH=nextH;
                }
                    
            }
        }
        System.out.println("Best is");
        printMatrix(bestState);
        System.out.println("H="+bestH);
    }//GEN-LAST:event_simAnnealingSolveBTNActionPerformed
    public void findSuccessors(boolean [][]currentM)
    {
        System.out.println("Original Matrix");
        printMatrix(currentM);
        boolean [][]tempQueenMatrix=new boolean[n][n];
        int []queenPositions=new int[n];
        /*
         0      0     3     1
        true  true  false false
        false false false true
        false false false false
        false false true  false
        then queenPositions={0,0,3,1}
        */
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(currentM[i][j])
                    queenPositions[j]=i;
            }
        }
        for(int k=0;k<n;k++)
        {
            for (int v = 0; v < n; v++) 
                System.arraycopy(currentM[v], 0, tempQueenMatrix[v], 0, n);

            tempQueenMatrix[queenPositions[k]][k]=false;
            for(int otherPos=0;otherPos<n;otherPos++)
            {
                if(otherPos!=queenPositions[k])
                {
                    tempQueenMatrix[otherPos][k]=true;
                    MatrixWithHeuristic q=new MatrixWithHeuristic(n,tempQueenMatrix,"");
                    allSuccessors.add(q);
                    tempQueenMatrix[otherPos][k] = false;   
                }
            }
        }
        for(int i=0;i<allSuccessors.size();i++)
        {
            System.out.println("#"+(i+1));
            printMatrix(allSuccessors.get(i).getMatrix());
        }
    }
    public static void printMatrix(boolean[][] matrix) 
    {
        for (boolean[] row : matrix) 
        {
            for (boolean value : row) 
            {
                System.out.print((value ? "1" : "0") + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private int calculateHeuristic(boolean[][] currentState) 
    {
        int attackingPairs = 0;
            for (int row = 0; row < n; row++) 
            {
                for (int col = 0; col < n; col++) 
                {
                    if (currentState[row][col]) 
                    {
                        // Check for conflicts in the same row
                        for (int c = col + 1; c < n; c++) 
                        {
                            if (currentState[row][c]) 
                            {
                                attackingPairs++;
                            }
                        }
                        // Check for conflicts in the diagonal (right-up)
                        //r >= 0 && c < n is to maintain we stay in the matrix correct borders
                        for (int r = row - 1, c = col + 1; r >= 0 && c < n; r--, c++) 
                        {
                            if (currentState[r][c]) 
                            {
                                attackingPairs++;
                            }
                        }
                        // Check for conflicts in the diagonal (right-down)
                        //r < n && c < n is to maintain we stay in the matrix correct borders
                        for (int r = row + 1, c = col + 1; r < n && c < n; r++, c++) 
                        {
                            if (currentState[r][c]) 
                            {
                                attackingPairs++;
                            }
                        }
                    }
                }
            }
    return attackingPairs ;
}
    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        this.toBack();
        MainFrame MF=new MainFrame();
        MF.setVisible(true);
        MF.toFront();
        this.dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private void pathBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathBTNActionPerformed
        // TODO add your handling code here:
        System.out.println("Size of Path="+pathSuccessors.size());
        if(solveUsedFlag&&nextCounter<pathSuccessors.size())
        {
            updatePanel(pathSuccessors.get(nextCounter).getMatrix());
            outputLabel.setText(pathSuccessors.get(nextCounter).getStr());
            nextCounter++;
        }
    }//GEN-LAST:event_pathBTNActionPerformed

    private void bestSolutionBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestSolutionBTNActionPerformed
        // TODO add your handling code here:
        if(solveUsedFlag)
        {
            updatePanel(bestState);
            outputLabel.setText("Best Solution has H="+bestH);
        }
    }//GEN-LAST:event_bestSolutionBTNActionPerformed

    private void initTempTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initTempTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initTempTFActionPerformed

    private void tMaxRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMaxRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMaxRBActionPerformed

    private void coolingRateTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coolingRateTFMouseClicked
        // TODO add your handling code here:
        coolingRateTF.setText("");
        coolingRateTF.setForeground(Color.BLACK);
    }//GEN-LAST:event_coolingRateTFMouseClicked
    void initEmpty()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrixLabels[i][j].setName("0");
                matrixLabels[i][j].setIcon(null);
            }
        }
    }
    
    void updatePanel(boolean [][]nqueen)
    {
        initEmpty();
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matrixLabels[i][j].setIcon(nqueen[i][j]?new ImageIcon("C:\\Users\\Lenovo\\Desktop\\E-Learning (Mira)\\aiFirstProject\\queen.png"):null);
    }
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
            java.util.logging.Logger.getLogger(SimulatedAnnealingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulatedAnnealingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulatedAnnealingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulatedAnnealingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulatedAnnealingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FTorMaxI;
    private javax.swing.JTextField FTorMaxIterationsTF;
    private javax.swing.JButton Randomize;
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton bestSolutionBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton coolingRateRB;
    private javax.swing.JTextField coolingRateTF;
    private javax.swing.JLabel initTLabel;
    private javax.swing.JTextField initTempTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JPanel panelnxn;
    private javax.swing.JButton pathBTN;
    private javax.swing.JButton simAnnealingSolveBTN;
    private javax.swing.JPanel startPanel;
    private javax.swing.JRadioButton tMaxRB;
    // End of variables declaration//GEN-END:variables
}
