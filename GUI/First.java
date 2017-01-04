import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class First implements ActionListener {

    private final JFrame frame = new JFrame();
    private final JPanel panel1 = new JPanel();
    private final JPanel panel2 = new JPanel();

    private final JTextField perimeterAns = new JTextField(4);
    private final JTextField widthInput = new JTextField(4);
    private final JTextField lengthInput = new JTextField(4);
    private final JTextField areaAns = new JTextField(4);

    private final JButton jbtCalculate = new JButton("Calculate");
    private final JButton jbtClear = new JButton("Clear");

    public First() {

        panel1.setLayout(new GridLayout(3,2));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel1.add(new JLabel("Enter the length: "));
        panel2.add(jbtCalculate);
        panel1.add(new JLabel("Enter the width: "));
        panel2.add(jbtClear);

        panel1.add(lengthInput);
        panel1.add(widthInput);
        panel1.add(areaAns);
        panel1.add(perimeterAns);

        //add action listener for buttons
        jbtCalculate.addActionListener(this);
        jbtClear.addActionListener(this);

        frame.setLayout(new BorderLayout());
        frame.add(panel1);
        frame.add(panel2, BorderLayout.PAGE_END);

        frame.pack();
        frame.setResizable(true);
        frame.setLocationRelativeTo(null); //center on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == jbtClear) {
            lengthInput.setText("");
            widthInput.setText("");
            areaAns.setText("");
            perimeterAns.setText("");
        } else if (source == jbtCalculate) {
            double length = Double.parseDouble(lengthInput.getText());
            double width = Double.parseDouble(widthInput.getText());
            double perimeter = (length*2) + (width*2);
            double area = length*width;
            perimeterAns.setText(Double.toString(perimeter));
            areaAns.setText(Double.toString(area));
        }
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new First();
    }

}
