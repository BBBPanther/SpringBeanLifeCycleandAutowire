
import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class FutureValueFrame extends JFrame {
    public FutureValueFrame()
    
    {
        setTitle("Future Value Calculator");
        setBounds(267,200,267,200);
        setResizable(false);
        centerWindow(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new FutureValuePanel();
        this.add(panel);
    }
    private void centerWindow(Window w)
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth())/2,
            (d.height-w.getHeight())/2);
    }
}
