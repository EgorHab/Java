package finalProject;

import finalProject.components.DigitJButton;
import finalProject.components.OperatorJButton;
import finalProject.listeners.ButtonListener;
import finalProject.listeners.ClearFieldButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AplicationForm extends JFrame {
    private JTextField inputField;


    public AplicationForm(String title) {
        super(title);
        setBounds(830, 350, 250, 370);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        setLayout(new BorderLayout());
        add(createTopPanel(), BorderLayout.NORTH);
        setJMenuBar(createMenu());
        add(createCenterPanel(), BorderLayout.CENTER);
        setVisible(true);
    }


    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        menuFile.add(clear);
        menuFile.add(new JMenuItem("Просто кнопка"));
        menuFile.add(new JMenuItem("Exit"));
        menuBar.add(menuFile);

        menuBar.add(new JMenuItem("Help"));
        menuBar.add(new JMenuItem("About"));
        menuBar.add(new JMenuItem("Exit"));

        return (menuBar);
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener), BorderLayout.WEST);

        return centerPanel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4, 3));

        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new DigitJButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }
        JButton calc = new OperatorJButton("=");
        digitsPanel.add(calc);
        calc.setEnabled(false);

        JButton clear = new OperatorJButton("C");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        digitsPanel.add(clear);


        return digitsPanel;
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));

        JButton minus = new OperatorJButton("-");
        minus.addActionListener(buttonListener);
        panel.add(minus);

        JButton plus = new OperatorJButton("+");
        plus.addActionListener(buttonListener);
        panel.add(plus);

        JButton multiply = new OperatorJButton("X");
        multiply.addActionListener(buttonListener);
        panel.add(multiply);

        JButton divide = new OperatorJButton("/");
        divide.addActionListener(buttonListener);
        panel.add(divide);

        return panel;
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());


        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);
        inputField.setFont(new Font("Arial", Font.PLAIN, 25));
        inputField.setMargin(new Insets(8, 0, 8, 0));
        inputField.setBackground(new Color(121, 236, 110));
        //inputField.setText("2+2=4");

        return top;
    }
}
