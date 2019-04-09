package form;

import data.Data;
import lib.PatternLibrary;

import javax.swing.*;

public class DefaultPattern extends JFrame{
    private JRadioButton rbABC;
    private JRadioButton rbBCD;
    private JRadioButton rbCDE;
    private JButton select;
    private JPanel mainPanel;
    private ButtonGroup grup;

    DefaultPattern(){
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(DefaultPattern.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();

        grup = new ButtonGroup();
        grup.add(rbABC);
        grup.add(rbBCD);
        grup.add(rbCDE);

        select.addActionListener(v -> {
            if (rbABC.isSelected()){
                Data.setDataLearning(PatternLibrary.getAbc());
            }
            else if (rbBCD.isSelected()){
                Data.setDataLearning(PatternLibrary.getBcd());
            }
            else if (rbCDE.isSelected()){
                Data.setDataLearning(PatternLibrary.getCde());
            }
            this.setVisible(false);
        });
    }
}
