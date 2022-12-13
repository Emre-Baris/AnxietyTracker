import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class MyFrame extends JFrame {

    JButton btnSet = new JButton("Set As Todays Data!");
    JLabel lblAnxietyLevel = new JLabel("Level Of anxiety", CENTER);
    JLabel lblSleepHrs = new JLabel("Hours Of Sleep", CENTER);
    JLabel lblInfo = new JLabel(" Additional Info:");
    JTextField txtAnxietyLevel = new JTextField();
    JTextField txtSleepHrs = new JTextField();
    JTextArea txtInfo = new JTextArea();




    public MyFrame(){

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,1));
        this.setSize(300, 400);
        JPanel panelCalender = new JPanel();
        panelCalender.setLayout(new GridLayout(5,7));
        JPanel panelInput = new JPanel();
        panelInput.setLayout(new BorderLayout());
        JPanel panelTop = new JPanel();
        panelTop.setLayout(new GridLayout(2,2));
        JPanel panelMother = new JPanel(new GridLayout(2,1));
        panelTop.add(this.lblAnxietyLevel);
        panelTop.add(this.lblSleepHrs);
        panelTop.add(this.txtAnxietyLevel);
        panelTop.add(this.txtSleepHrs);
        panelMother.add(panelTop);
        panelMother.add(lblInfo);
        panelInput.add(panelMother, "North");
        panelInput.add(txtInfo, "Center");
        panelInput.add(btnSet, "South");
        this.add(panelCalender);
        this.add(panelInput);


    }


}
