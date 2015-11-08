/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sanat
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public int[][] mines = {{1,0,0,1,0},{0,1,0,1,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,1,1,0}} ;
    public int[][] mines2 = {{1,0,0,1,0,0,1},{0,1,0,1,0,0,0},{1,1,0,0,1,1,0},{1,1,0,0,1,1,0},{1,1,0,0,1,1,0},{0,0,0,1,0,1,1},{1,1,0,0,1,1,0}} ;
    public static String size = "";
    public NewJFrame() {
        String[] choices = { "5x5", "7x7", "10x10" };
        size= (String) JOptionPane.showInputDialog(null, "Choose Now",
        "Choose Number Of Grids", JOptionPane.QUESTION_MESSAGE, null,
        choices,
        choices[0]);
        initComponents();
        
        switch(size){
            case "5x5": 
       
       jInternalFrame1.setLayout(new GridLayout(5,5));
       final JButton[][] button = new JButton[5][5];
       //final JLabel [][] label = new JLabel[5][5];
       for(int i=0;i<5;i++){
       for(int j=0;j<5;j++){   
       //label[i][j] = new JLabel("Clicked");
               
       button[i][j] = new JButton();    
       button[i][j].setName("button"+Integer.toString(i)+Integer.toString(j));
       button[i][j].setVisible(true);
       final int k=i,l=j;
       button[i][j].addActionListener(new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent ae) {
               if(mines[k][l] == 1){
               
                   JOptionPane.showMessageDialog(null,"Your Game is Over !");
                   System.exit(0);
               }
           int count=calculate_mines(k,l,5);
           if(count != 0){
           button[k][l].setText(Integer.toString(count));
           }
           else{
           for(int m=-1;m<2;m++){
           for(int n=-1;n<2;n++){
           
               if((k+m)>=0 && (k+m)<5 && (l+n)>=0&& (l+n)<5){
               button[k+m][l+n].setText(Integer.toString(calculate_mines(k+m,l+n,5)));
               }
           
           }
           }
           }
           
           }
           
           
       });
       //label[i][j].add(button[i][j],BorderLayout.EAST);
       //jInternalFrame1.add(label[i][j]);
      jInternalFrame1.add(button[i][j]);
       }} break;
            case "7x7": 
                
       
       jInternalFrame1.setLayout(new GridLayout(7,7));
       final JButton[][] button2 = new JButton[7][7];
       for(int i=0;i<7;i++){
       for(int j=0;j<7;j++){
       button2[i][j] = new JButton();
       button2[i][j].setName("button"+Integer.toString(i)+Integer.toString(j));
       button2[i][j].setVisible(true);
       final int k=i,l=j;
       button2[i][j].addActionListener(new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent ae) {
                          if(mines[k][l] == 1){
               
                   JOptionPane.showMessageDialog(null,"Your Game is Over !");
                   System.exit(0);
               }
           int count=calculate_mines(k,l,7);
           if(count != 0){
           button2[k][l].setText(Integer.toString(count));
           }
           else{
           for(int m=-1;m<2;m++){
           for(int n=-1;n<2;n++){
           
               if((k+m)>=0 && (k+m)<7 && (l+n)>=0&& (l+n)<7){
               button2[k+m][l+n].setText(Integer.toString(calculate_mines(k+m,l+n,7)));
               }
           
           }
           }
           }
           
           }
           
           
       });
       jInternalFrame1.add(button2[i][j]);        
        }} break;
            case "10x10": 
                
       jInternalFrame1.setLayout(new GridLayout(10,10));
       final JButton[][] button3 = new JButton[10][10];
       for(int i=0;i<10;i++){
       for(int j=0;j<10;j++){  
       button3[i][j] = new JButton();
       button3[i][j].setVisible(true);
       button3[i][j].setName("button"+Integer.toString(i)+Integer.toString(j));
       final int k=i,l=j;
       button3[i][j].addActionListener(new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent ae) {
           button3[k][l].setText(Integer.toString(k)+Integer.toString(l));
           
           }
           
           
       });
       jInternalFrame1.add(button3[i][j]);
       }} break;
            default:
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

        jInternalFrame1 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    // End of variables declaration//GEN-END:variables

   
    public int calculate_mines(int k,int l,int a){
    
               int count=0;
           for(int m=-1;m<2;m++){
           for(int n=-1;n<2;n++){
           
               if((k+m)>=0 && (k+m)<a && (l+n)>=0 && (l+n)<a){
               if(mines[k+m][l+n]==1){
               count++;
               }
               }
           
           }
           }
           return count;
        
    }
}
