/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladoresVistas;

import Modelos.Circulo;
import Modelos.Cuadrado;
import Modelos.Imagen;
import java.awt.Color;
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> c8473ffab4e6905980ba2c39c579e35ef5dbcbb8

/**
 *
 * @author pipet
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {

        initComponents();
        primeraParte();
//        Cuadrado cuadrado1= new Cuadrado(10, 10, Color.black, Color.red, 90);
//        Circulo circulo1=new Circulo(100, 10, Color.blue, Color.green, 70);
//        Imagen elHongo=new Imagen(10, 100, "src/Imagenes/hongo.png", 64, 64);
//        this.lienzo1.getFiguras().add(cuadrado1);
//        this.lienzo1.getFiguras().add(circulo1);
//        this.lienzo1.getFiguras().add(elHongo);
        int numerosParaMatriz[][] = {{1,1,2,2,2,2,2,1,1,3,3,3,3,0,0,0},
                                     {1,1,4,4,2,4,2,3,3,3,5,3,3,3,0,0},
                                     {0,1,2,2,4,4,2,1,1,1,3,3,3,3,6,6},
                                     {0,1,0,2,2,4,0,1,1,1,1,2,3,3,6,6},
                                     {0,1,0,2,2,4,0,0,1,1,2,2,2,0,6,6},
                                     {0,0,0,0,2,0,0,0,0,1,2,2,2,0,0,6},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};                      
       
        int f = 0;  
        int cantidad = 0; 
        Color relleno = Color.white; 
        
        for (int j = 240; j < 481; j=j+30) 
        {   
            int c = 0; 
            if(f < 8)
            {
                for (int i = 0; i < 481; i=i+30) 
                {
                    if(c < 16)
                    {
                        if(numerosParaMatriz[f][c]==1)
                        {
                            relleno = Color.red; 
                        }else if(numerosParaMatriz[f][c]==2)
                        {
                            relleno = Color.orange; 
                        }else if(numerosParaMatriz[f][c]==3)
                        {
                            relleno = Color.blue;
                        }else if(numerosParaMatriz[f][c]==4)
                        {
                            relleno = Color.black;
                        }else if(numerosParaMatriz[f][c]==5)
                        {
                            relleno = Color.yellow;
                        }else if(numerosParaMatriz[f][c]==6)
                        {
                            relleno = Color.darkGray;
                        }else 
                        {
                            relleno = Color.white;
                        }
                        
                         Cuadrado c1 = new Cuadrado(j, i, Color.black, relleno,30);
                        this.lienzo1.getFiguras().add(c1);
                        c++;
                    }
                }
                
                f++;
            }
        }
//          Cuadrado cuadrado1= new Cuadrado(0, 0, Color.blue, Color.green, 30);
//          Cuadrado cuadrado2= new Cuadrado(0, 30, Color.blue, Color.green, 30);
//          this.lienzo1.getFiguras().add(cuadrado1);
//       this.lienzo1.getFiguras().add(cuadrado2);
//            double notas[]=new double[128];
//            0,0,0,0,0,1,1,1 
//                            ,0,0,0,0,1,1,1,1
//                            ,0,0,0,0,2,2,2,4
//                            ,0,0,0,2,4,2,4,4
//                            ,0,0,0,2,4,2,2,4
//                            ,0,0,0,0,2,4,4,4
//                            ,0,0,0,0,0,4,4,4
//                            ,0,0,0,0,1,1,5,1
//                            ,0,0,0,1,1,1,5,1
//                            ,0,0,1,1,1,1,5,5
//                            ,0,0,4,4,1,5,6,5
//                            ,0,0,4,4,4,5,5,5
//                            ,0,0,4,4,5,5,5,5
//                            ,0,0,0,0,5,5,5,0
//                            ,0,0,0,2,2,2,0,0
//                            ,0,0,2,2,2,2,0,0
                                                                                                                   
            }
    public void primeraParte(){
         double vector[]=
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
            ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
            ,0,0,0,0,0,0,0,0,0,1,4,4,4,0,0,2
            ,0,0,0,2,2,0,0,0,1,1,4,4,4,0,2,2
            ,0,1,2,4,4,2,0,1,1,1,1,4,5,5,2,2
            ,1,1,2,2,2,4,4,1,1,1,5,5,5,5,2,2
            ,1,1,2,4,2,4,4,5,5,5,6,5,5,5,0,0
            ,1,1,4,4,4,4,4,1,1,5,5,5,5,0,0,0};
            //declaración de iterador
            int z=0;
            Color color=Color.WHITE;
            for(int i=0;i<240;i+=30){
                for(int j=0;j<480;j+=30){
                    System.out.println(i);

                    if(vector[z]==0){
                        color=Color.WHITE;
                    }
                    else if(vector[z]==1){
                        color=Color.RED;
                    }
                     else if(vector[z]==2){
                        color=Color.DARK_GRAY;
                    }
                    else if(vector[z]==3){
                        color=Color.BLACK;
                    }
                    else if(vector[z]==4){
                        color=Color.ORANGE;
                    }
                    else if(vector[z]==5){
                        color=Color.BLUE;
                    }
                    else{
                        color=Color.YELLOW;
                    }
                    Cuadrado cuadrado=new Cuadrado(i, j, Color.BLACK, color, 30);
                    this.lienzo1.getFiguras().add(cuadrado); 
                    z++;
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

        lienzo1 = new ControladoresVistas.Lienzo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 977, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ControladoresVistas.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables
}
