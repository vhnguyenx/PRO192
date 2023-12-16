package view;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;

public class UserInterface extends JFrame {

    JFrame jFrame = new JFrame();

    public void Show() {

        this.setSize(600, 500);
        this.setTitle("University Management");
        this.setLocationRelativeTo(null);

        ThanhPhan();
        setVisible(true);
    }
    public void ThanhPhan()
    {
     FlowLayout flowLayout = new FlowLayout();
        this.setLayout(flowLayout);
        JButton jButton = new JButton("Add information");
        this.add(jButton);
        JButton jButton2 = new JButton("Find information");
        this.add(jButton2);
        JButton jButton3 = new JButton();
    }
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.Show();

    }
}