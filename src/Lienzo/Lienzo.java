/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lienzo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

/**
 *
 * @author Desarrollo234
 */
public class Lienzo {
    public static void main(String[] args) {
         final String title = "Test Window";
    final int width = 1200;
    final int height = width / 16 * 9;

    //Creating the frame.
    JFrame frame = new JFrame(title);

    frame.setSize(width, height);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setVisible(true);

    //Creating the canvas.
    Canvas canvas = new Canvas();

    canvas.setSize(width, height);
    canvas.setBackground(Color.BLACK);
    canvas.setVisible(true);
    canvas.setFocusable(false);


    //Putting it all together.
    frame.add(canvas);

    canvas.createBufferStrategy(3);

    boolean running = true;

    BufferStrategy bufferStrategy;
    Graphics graphics;

    while (running) {
        bufferStrategy = canvas.getBufferStrategy();
        graphics = bufferStrategy.getDrawGraphics();
        graphics.clearRect(0, 0, width, height);

        graphics.setColor(Color.GREEN);
        graphics.drawString("This is some text placed in the top left corner.", 5, 15);
        graphics.drawLine(0, 100, 50, 50);
        graphics.drawLine(50, 50, 100, 100);
        graphics.drawLine(100, 100, 170, 20);
        graphics.drawLine(0, 100, 50, 50);
        bufferStrategy.show();
        graphics.dispose();
    }
       
       
    }
    
  
}
