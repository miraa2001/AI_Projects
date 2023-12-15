/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.myproject.aifirstproject;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Lenovo
 */
public class MatrixWithHeuristic {    
    public boolean [][]matrix;
    String s;
    public MatrixWithHeuristic(int n,boolean [][]m,String str)
    {
        matrix=new boolean[n][n];
        for (int v = 0; v < n; v++) 
            System.arraycopy(m[v], 0, matrix[v], 0, n);
        s=str;
    }
    public boolean[][] getMatrix()
    {
        return matrix;
    }
    public String getStr()
    {
        return s;
    }
}
