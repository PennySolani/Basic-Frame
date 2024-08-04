
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

public class MyFirstFrame extends JFrame{
    
    public MyFirstFrame()
    {
        setTitle("My first frame");
        setSize(50, 50);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.yellow);
        setVisible(true);
    }
}
