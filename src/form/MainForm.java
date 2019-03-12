package form;

import lib.PerceptronLibrary;

import javax.swing.*;

public class MainForm {
    private JButton learning, test;
    public JPanel panelMain;
    private JTextField field00, field01, field02, field03, field04, field05, field06;
    private JTextField field10, field11, field12, field13, field14, field15, field16;
    private JTextField field20, field21, field22, field23, field24, field25, field26;
    private JTextField field30, field31, field32, field33, field34, field35, field36;
    private JTextField field40, field41, field42, field43, field44, field45, field46;
    private JTextField field50, field51, field52, field53, field54, field55, field56;
    private JTextField field60, field61, field62, field63, field64, field65, field66;
    private JTextField field70, field71, field72, field73, field74, field75, field76;
    private JTextField field80, field81, field82, field83, field84, field85, field86;
    private JLabel Iteration;
    private JLabel statusLabel;

    private String status, result;
    private double theta = 0.5, output, hasil, sum;
    private double[] target = {1,-1,-1,1,-1,-1};
    private double[][] dataLearning = {
            {
                -1,-1, 1, 1,-1,-1,-1,
                -1,-1,-1, 1,-1,-1,-1,
                -1,-1,-1, 1,-1,-1,-1,
                -1,-1, 1,-1, 1,-1,-1,
                -1,-1, 1,-1, 1,-1,-1,
                -1, 1, 1, 1, 1, 1,-1,
                -1, 1,-1,-1,-1, 1,-1,
                -1, 1,-1,-1,-1, 1,-1,
                 1, 1, 1,-1, 1, 1, 1
            },
            {
                 1, 1, 1, 1, 1, 1,-1,
                -1, 1,-1,-1,-1,-1, 1,
                -1, 1,-1,-1,-1,-1, 1,
                -1, 1,-1,-1,-1,-1, 1,
                -1, 1, 1, 1, 1, 1,-1,
                -1, 1,-1,-1,-1,-1, 1,
                -1, 1,-1,-1,-1,-1, 1,
                -1, 1,-1,-1,-1,-1, 1,
                1, 1, 1, 1, 1, 1,-1

            },
            {
                -1,-1, 1, 1, 1, 1, 1,
                -1, 1,-1,-1,-1,-1, 1,
                 1,-1,-1,-1,-1,-1,-1,
                 1,-1,-1,-1,-1,-1,-1,
                 1,-1,-1,-1,-1,-1,-1,
                 1,-1,-1,-1,-1,-1,-1,
                 1,-1,-1,-1,-1,-1,-1,
                -1, 1,-1,-1,-1,-1, 1,
                -1,-1, 1, 1, 1, 1,-1,

            },
            {
                -1,-1,-1, 1,-1,-1,-1,
                -1,-1,-1, 1,-1,-1,-1,
                -1,-1,-1, 1,-1,-1,-1,
                -1,-1, 1,-1, 1,-1,-1,
                -1,-1, 1,-1, 1,-1,-1,
                -1, 1,-1,-1,-1, 1,-1,
                -1, 1, 1, 1, 1, 1,-1,
                -1, 1,-1,-1,-1, 1,-1,
                -1, 1,-1,-1,-1, 1,-1
            },
            {
                 1, 1, 1, 1, 1, 1,-1,
                 1,-1,-1,-1,-1,-1, 1,
                 1,-1,-1,-1,-1,-1, 1,
                 1,-1,-1,-1,-1,-1, 1,
                 1, 1, 1, 1, 1, 1,-1,
                 1,-1,-1,-1,-1,-1, 1,
                 1,-1,-1,-1,-1,-1, 1,
                 1,-1,-1,-1,-1,-1, 1,
                 1, 1, 1, 1, 1, 1,-1,
            },
            {
                -1,-1, 1, 1, 1,-1,-1,
                -1, 1,-1,-1,-1, 1,-1,
                 1,-1,-1,-1,-1,-1, 1,
                 1,-1,-1,-1,-1,-1,-1,
                 1,-1,-1,-1,-1,-1,-1,
                 1,-1,-1,-1,-1,-1,-1,
                 1,-1,-1,-1,-1,-1, 1,
                -1, 1,-1,-1,-1, 1,-1,
                -1,-1, 1, 1, 1,-1,-1,
            }
    };

    public MainForm(){
        learning.addActionListener(e -> {
            result = PerceptronLibrary.learn(dataLearning,target);
            Iteration.setText(String.valueOf(PerceptronLibrary.getIteration()));
            statusLabel.setText(result);
        });
        test.addActionListener(e -> {
            double[] data = {
                    Double.valueOf(field00.getText()),
                    Double.valueOf(field01.getText()),
                    Double.valueOf(field02.getText()),
                    Double.valueOf(field03.getText()),
                    Double.valueOf(field04.getText()),
                    Double.valueOf(field05.getText()),
                    Double.valueOf(field06.getText()),
                    Double.valueOf(field10.getText()),
                    Double.valueOf(field11.getText()),
                    Double.valueOf(field12.getText()),
                    Double.valueOf(field13.getText()),
                    Double.valueOf(field14.getText()),
                    Double.valueOf(field15.getText()),
                    Double.valueOf(field16.getText()),
                    Double.valueOf(field20.getText()),
                    Double.valueOf(field21.getText()),
                    Double.valueOf(field22.getText()),
                    Double.valueOf(field23.getText()),
                    Double.valueOf(field24.getText()),
                    Double.valueOf(field25.getText()),
                    Double.valueOf(field26.getText()),
                    Double.valueOf(field30.getText()),
                    Double.valueOf(field31.getText()),
                    Double.valueOf(field32.getText()),
                    Double.valueOf(field33.getText()),
                    Double.valueOf(field34.getText()),
                    Double.valueOf(field35.getText()),
                    Double.valueOf(field36.getText()),
                    Double.valueOf(field40.getText()),
                    Double.valueOf(field41.getText()),
                    Double.valueOf(field42.getText()),
                    Double.valueOf(field43.getText()),
                    Double.valueOf(field44.getText()),
                    Double.valueOf(field45.getText()),
                    Double.valueOf(field46.getText()),
                    Double.valueOf(field50.getText()),
                    Double.valueOf(field51.getText()),
                    Double.valueOf(field52.getText()),
                    Double.valueOf(field53.getText()),
                    Double.valueOf(field54.getText()),
                    Double.valueOf(field55.getText()),
                    Double.valueOf(field56.getText()),
                    Double.valueOf(field60.getText()),
                    Double.valueOf(field61.getText()),
                    Double.valueOf(field62.getText()),
                    Double.valueOf(field63.getText()),
                    Double.valueOf(field64.getText()),
                    Double.valueOf(field65.getText()),
                    Double.valueOf(field66.getText()),
                    Double.valueOf(field70.getText()),
                    Double.valueOf(field71.getText()),
                    Double.valueOf(field72.getText()),
                    Double.valueOf(field73.getText()),
                    Double.valueOf(field74.getText()),
                    Double.valueOf(field75.getText()),
                    Double.valueOf(field76.getText()),
                    Double.valueOf(field80.getText()),
                    Double.valueOf(field81.getText()),
                    Double.valueOf(field82.getText()),
                    Double.valueOf(field83.getText()),
                    Double.valueOf(field84.getText()),
                    Double.valueOf(field85.getText()),
                    Double.valueOf(field86.getText())
            };
            result = testHasil(data);
            statusLabel.setText(result);
        });
    }

    private String testHasil(double[] data){
        double[] bobot = PerceptronLibrary.getBobot();
        double bias = PerceptronLibrary.getBias();
        for (int i = 0; i < data.length; i++){
            sum = data[i] * bobot[i];
        }
        hasil = bias + sum;
        if (cekOutput(hasil) == 1){
            status = "A";
        }
        else {
            status = "Bukan A";
        }
        return status;
    }

    private double cekOutput(double input){
        if (input > theta){
            output = 1;
        } else {
            output = -1;
        }
        return output;
    }
}
