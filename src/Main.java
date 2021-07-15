import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Main extends JFrame {
    public static void main(String[] args) {
        // creates instance of jframe
        JFrame f = new JFrame();
        // adds a button
        JButton b1 = new JButton("Push me!");
        b1.setBounds(10, 10, 180, 40);
        // adds text
        JLabel l1 = new JLabel();
        l1.setText("Label Text");
        l1.setBounds(10, 60, 200, 40);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //user actions
                b1.setBounds(10, 10, 280, 40);
                String msg = getMessage();
                b1.setText("Not yet a card game.");
                l1.setText(msg);
            }
        });
        
    }
}