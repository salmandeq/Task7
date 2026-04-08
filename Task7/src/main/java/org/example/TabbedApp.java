package org.example;
import javax.swing.*;

public class TabbedApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabbed Interface Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel tab1= new JPanel();
        tab1.add(new JLabel("Welcome to Tab 1"));
        tab1.add(new JTextField(15));

        JPanel tab2= new JPanel();
        tab2.add(new JLabel("Tab 2: User Info"));
        tab2.add(new JTextField("Enter name", 10));
        tab2.add(new JButton("Submit"));

        JPanel tab3 = new JPanel();
        tab3.add(new JLabel("Tab 3: Settings"));
        tab3.add(new JCheckBox("Enable feature"));
        tab3.add(new JSlider());

        JPanel tab4 = new JPanel();
        tab4.add(new JLabel("Tab 4: Display"));
        tab4.add(new JTextArea("This is a text area", 5, 20));

        JPanel tab5 = new JPanel();
        tab5.add(new JLabel("Tab 5: Actions"));
        tab5.add(new JButton("Click Me"));

        tabbedPane.addTab("Home", tab1);
        tabbedPane.addTab("User Info", tab2);
        tabbedPane.addTab("Settings", tab3);
        tabbedPane.addTab("Display", tab4);
        tabbedPane.addTab("Actions", tab5);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }

}