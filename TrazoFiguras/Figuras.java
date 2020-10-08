/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrazoFiguras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author valti
 */
public class Figuras extends JPanel {

    private JFrame ventana;
    private Container contenedor;

    public Figuras() {
        ventana = new JFrame("Dibujando formas basicas");
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);

        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);

        contenedor.add(this, BorderLayout.CENTER);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        
        g.setColor(Color.gray);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);
        
      // trazo de rectangulos 
      g.setColor(Color.blue);
      g.drawRect(280, 50, 100, 50);
      g.fillRect(280, 110, 100, 50);
      
      // trazo de rectangulos redondeados(ovalos)
      g.setColor(Color.black);
      g.drawRoundRect(450, 50, 100, 50, 50, 50);
      g.fillRoundRect(450, 110, 100, 50, 20, 20);
      
      // trazo de circulos
      
      g.setColor(Color.orange);
      g.drawOval(100, 200, 80, 80);
      g.fillOval(100, 290, 50, 50);
      
      // trazo de ovalos a traves de circunferencias 
      g.setColor(Color.green);
      g.drawOval(280, 200, 80, 40);
      g.fillOval(280, 290, 40, 80);
      
      //dibujar triangulo
      g.setColor(Color.MAGENTA);
      g.drawLine(450, 300, 550, 300);
      g.drawLine(450, 300, 500, 250);
      g.drawLine(550, 300, 500, 250);
      
      // dibujo de cadenas de texto 
      g.setColor(Color.black);
      g.drawString("EJEMPLO DE TRAZO DE FIGURITAS BASIQUITAS, ASI MERO!", 200, 400);
      
      // Agregar como se traza un arco.
      g.setColor(Color.blue);
      
      //fig 1 
    g.setColor(Color.black);
    g.drawArc(550, 350, 150, 100, 0, 270);
      
      // fig 2
      g.setColor(Color.red);
    g.fillArc(400, 400, 150, 100, 0, 270);
 
      
      //Figura 1: Solo contorno
      //Figura 2: Relleno
      
      //Generar un programa que genere el dibujo que tome captura.
      //Generar un reporte, en el desarrollo describir que se esta creando. O generando
      // en el ejercicio
      //en la conclusion lo que aprendimos y las dificultades encontradas.
    }

}
