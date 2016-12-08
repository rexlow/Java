import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

// top level container
public class AddStudentFrame extends JFrame {

  private JTextField textName = new JTextField();
  private JTextField textDateOfBirth = new JTextField();
  private JRadioButton radioButtonMale = new JRadioButton("Male");
  private JRadioButton radioButtonFemale = new JRadioButton("Female");
  private JComboBox<String> comboCourse = new JComboBox<>(new String[]{"BITC", "BITD", "BITM", "BITI", "BITZ", "BITE", "BITA"});
  private JButton submitButton = new JButton("Submit");
  private JButton resetButton = new JButton("Reset");

  public AddStudentFrame() {
    super("Add Student Menu"); //title of the frame

    JPanel center = new JPanel(new GridLayout(4, 2));
    JPanel south = new JPanel();
    JPanel gender = new JPanel();

    south.add(submitButton);
    south.add(resetButton);
    this.add(new JLabel("Add Student", JLabel.CENTER), BorderLayout.NORTH);
    this.add(center, BorderLayout.CENTER);
    this.add(south, BorderLayout.SOUTH);

    //add radio button to gender panel
    gender.add(radioButtonMale);
    gender.add(radioButtonFemale);

    //create button group
    ButtonGroup groupGender = new ButtonGroup();
    groupGender.add(radioButtonMale);
    groupGender.add(radioButtonFemale);

    //add components to center panel
    center.add(new JLabel("Name: "));
    center.add(textName);
    center.add(new JLabel("Date of birth: "));
    center.add(textDateOfBirth);
    center.add(new JLabel("Gender: "));
    center.add(gender);
    center.add(new JLabel("Course: "));
    center.add(comboCourse);

    this.pack();
    this.setResizable(false);
    this.setLocationRelativeTo(null); //center on the screen
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main(String[] args) throws Exception {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    // UIManager.setLookAndFeel(new NimbusLookAndFeel());
    new AddStudentFrame();
  }

}
