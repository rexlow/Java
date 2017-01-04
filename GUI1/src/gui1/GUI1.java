package gui1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author rexlow
 */
public class GUI1  {

    private final JFrame frame = new JFrame();
    private final JPanel panel1 = new JPanel();
    private final JPanel panel2 = new JPanel();
    
    private final JTextField perimeterAns = new JTextField(4);
    private final JTextField widthInput = new JTextField(4);
    private final JTextField lengthInput = new JTextField(4);
    private final JTextField areaAns = new JTextField(4);
    
    private final JButton jbtCalculate = new JButton("Calculate");
    private final JButton jbtClear = new JButton("Clear");
    
    public GUI1() {
        
        panel1.setLayout(new GridLayout(3,2));
//        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        panel1.add(new JLabel("Enter the length: "));
        panel2.add(jbtCalculate);
        panel1.add(new JLabel("Enter the width: "));
        panel2.add(jbtClear);
        
        panel1.add(lengthInput);
        panel1.add(widthInput);
        panel1.add(areaAns);
        panel1.add(perimeterAns);
        
        frame.setLayout(new BorderLayout());
        frame.add(panel1);
        frame.add(panel2, BorderLayout.PAGE_END);
        
        frame.pack();
        frame.setResizable(true);
        frame.setLocationRelativeTo(null); //center on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new GUI1();
    }
    
}
