/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sliderPanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Desarrollo234
 */
public class Demo {
    static public void main(final String[] args) throws Exception {
    SwingUtilities.invokeAndWait(new Runnable() {
        @Override
        public void run() {
            final JFrame jFrame = new JFrame() {
                {
                    final PanelSlider42<JFrame> slider = new PanelSlider42<JFrame>(this);
                    final JPanel jPanel = slider.getBasePanel();

                    slider.addComponent(new JButton("1"));
                    slider.addComponent(new JButton("22"));
                    slider.addComponent(new JButton("333"));
                    slider.addComponent(new JButton("4444"));

                    getContentPane().add(jPanel);
                    setSize(300, 300);
                    setLocationRelativeTo(null);
                    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    setVisible(true);
                }
            };
        }
    });
}
}
