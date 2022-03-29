/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladoresVistas;

import Modelos.Circulo;
import Modelos.Cuadrado;
import Modelos.FiguraGeometrica;
import Modelos.Imagen;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;

/**
 *
 * @author pipet
 */
public class Lienzo extends javax.swing.JPanel {

    private LinkedList<FiguraGeometrica> figuras;

    /**
     * Creates new form Lienzo
     */
    public Lienzo() {
        initComponents();
        this.figuras = new LinkedList<>();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Estudiante2;
        dibujarFiguras(g);
        
    }
//    
//    public void Estudiante2 ()
//    {
//        for (int j = 240; j < 481; j=j+30) {     
//            for (int i = 0; i < 481; i=i+30) {
//                Cuadrado c1 = new Cuadrado(j, i, Color.black, Color.white,30);
//                this.getFiguras().add(c1);
//            }
//        }
//    }
    
    public void dibujarFiguras(Graphics g){
        for(FiguraGeometrica figuraActual: this.figuras){
            if (figuraActual instanceof Cuadrado) {
                dibujarCuadrado(g,(Cuadrado) figuraActual);
            }else if (figuraActual instanceof Circulo) {
                dibujarCirculo(g, (Circulo) figuraActual);
            }else if (figuraActual instanceof Imagen) {
                dibujarImagen(g,(Imagen)figuraActual);
            }
        }
    }
    public void dibujarCuadrado(Graphics g,Cuadrado elCuadrado){
        g.setColor(elCuadrado.getColorRelleno());
        g.fillRect(elCuadrado.getX(), 
                   elCuadrado.getY(), 
                   elCuadrado.getLado(), 
                   elCuadrado.getLado());
        g.setColor(elCuadrado.getBorde());
        g.drawRect(elCuadrado.getX(), 
                   elCuadrado.getY(), 
                   elCuadrado.getLado(), 
                   elCuadrado.getLado());
    }
    public void dibujarCirculo(Graphics g,Circulo elCirculo){
        g.setColor(elCirculo.getColorRelleno());
        g.drawOval(elCirculo.getX(),
                   elCirculo.getY(),
                   elCirculo.getRadio(),
                   elCirculo.getRadio());
        
        g.setColor(elCirculo.getBorde());
        g.fillOval(elCirculo.getX(),
                   elCirculo.getY(),
                   elCirculo.getRadio(),
                   elCirculo.getRadio());
        
    }
    public void dibujarImagen(Graphics g,Imagen laImagen){
    Toolkit t = Toolkit.getDefaultToolkit ();
    Image imagen = t.getImage (laImagen.getRuta());
    g.drawImage(imagen,
                laImagen.getX(),
                laImagen.getY(),
                laImagen.getAncho(),
                laImagen.getAlto(),
                this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return the figuras
     */
    public LinkedList<FiguraGeometrica> getFiguras() {
        return figuras;
    }

    /**
     * @param figuras the figuras to set
     */
    public void setFiguras(LinkedList<FiguraGeometrica> figuras) {
        this.figuras = figuras;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
