package form;

import data.Data;
import lib.PerceptronLibrary;

import javax.swing.*;
import java.awt.*;

/*
* Form class
* This class is place of All Event of the program from form are already created.
* */

public class MainForm {
    private JButton learning, test;
    public JPanel panelMain;
    private JLabel Iteration;
    private JLabel statusLabel;
    private JTextField AlphaTF;
    private JTextField ThetaTF;
    private JButton a11;
    private JButton a12;
    private JButton a13;
    private JButton a14;
    private JButton a15;
    private JButton a16;
    private JButton a17;
    private JButton a21;
    private JButton a22;
    private JButton a23;
    private JButton a24;
    private JButton a25;
    private JButton a26;
    private JButton a27;
    private JButton a31;
    private JButton a32;
    private JButton a33;
    private JButton a34;
    private JButton a35;
    private JButton a36;
    private JButton a37;
    private JButton a41;
    private JButton a42;
    private JButton a43;
    private JButton a44;
    private JButton a45;
    private JButton a46;
    private JButton a47;
    private JButton a51;
    private JButton a52;
    private JButton a53;
    private JButton a54;
    private JButton a55;
    private JButton a56;
    private JButton a57;
    private JButton a61;
    private JButton a62;
    private JButton a63;
    private JButton a64;
    private JButton a65;
    private JButton a66;
    private JButton a67;
    private JButton a71;
    private JButton a72;
    private JButton a73;
    private JButton a74;
    private JButton a75;
    private JButton a76;
    private JButton a77;
    private JButton a81;
    private JButton a82;
    private JButton a83;
    private JButton a84;
    private JButton a85;
    private JButton a86;
    private JButton a87;
    private JButton a91;
    private JButton a92;
    private JButton a93;
    private JButton a94;
    private JButton a95;
    private JButton a96;
    private JButton a97;
    private JButton clear;
    private JButton changePattern;

    private String result;
    private double sum;

    //Initialize the data array from -1
    private double[] data =
            {
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1
            };

    public MainForm(){
        //Learning buttton Event.
        learning.addActionListener(e -> {
            PerceptronLibrary.setAlpha(Double.valueOf(AlphaTF.getText()));
            PerceptronLibrary.setTheta(Double.valueOf(ThetaTF.getText()));
            PerceptronLibrary.setBobot(Data.getBobot());
            PerceptronLibrary.setBias(0);
            result = PerceptronLibrary.learn(Data.getDataLearning(),Data.getTarget());
            Iteration.setText("Epoch = " + PerceptronLibrary.getIteration());
            statusLabel.setText(result);
        });

        //Baris 1
        a11.addActionListener(v -> data[0] = changeColor(a11));
        a12.addActionListener(v -> data[1] = changeColor(a12));
        a13.addActionListener(v -> data[2] = changeColor(a13));
        a14.addActionListener(v -> data[3] = changeColor(a14));
        a15.addActionListener(v -> data[4] = changeColor(a15));
        a16.addActionListener(v -> data[5] = changeColor(a16));
        a17.addActionListener(v -> data[6] = changeColor(a17));

        //Baris 2
        a21.addActionListener(v -> data[7] = changeColor(a21));
        a22.addActionListener(v -> data[8] = changeColor(a22));
        a23.addActionListener(v -> data[9] = changeColor(a23));
        a24.addActionListener(v -> data[10] = changeColor(a24));
        a25.addActionListener(v -> data[11] = changeColor(a25));
        a26.addActionListener(v -> data[12] = changeColor(a26));
        a27.addActionListener(v -> data[13] = changeColor(a27));

        //Baris 3
        a31.addActionListener(v -> data[14] = changeColor(a31));
        a32.addActionListener(v -> data[15] = changeColor(a32));
        a33.addActionListener(v -> data[16] = changeColor(a33));
        a34.addActionListener(v -> data[17] = changeColor(a34));
        a35.addActionListener(v -> data[18] = changeColor(a35));
        a36.addActionListener(v -> data[19] = changeColor(a36));
        a37.addActionListener(v -> data[20] = changeColor(a37));

        //Baris 4
        a41.addActionListener(v -> data[21] = changeColor(a41));
        a42.addActionListener(v -> data[22] = changeColor(a42));
        a43.addActionListener(v -> data[23] = changeColor(a43));
        a44.addActionListener(v -> data[24] = changeColor(a44));
        a45.addActionListener(v -> data[25] = changeColor(a45));
        a46.addActionListener(v -> data[26] = changeColor(a46));
        a47.addActionListener(v -> data[27] = changeColor(a47));

        //Baris 5
        a51.addActionListener(v -> data[28] = changeColor(a51));
        a52.addActionListener(v -> data[29] = changeColor(a52));
        a53.addActionListener(v -> data[30] = changeColor(a53));
        a54.addActionListener(v -> data[31] = changeColor(a54));
        a55.addActionListener(v -> data[32] = changeColor(a55));
        a56.addActionListener(v -> data[33] = changeColor(a56));
        a57.addActionListener(v -> data[34] = changeColor(a57));

        //Baris 6
        a61.addActionListener(v -> data[35] = changeColor(a61));
        a62.addActionListener(v -> data[36] = changeColor(a62));
        a63.addActionListener(v -> data[37] = changeColor(a63));
        a64.addActionListener(v -> data[38] = changeColor(a64));
        a65.addActionListener(v -> data[39] = changeColor(a65));
        a66.addActionListener(v -> data[40] = changeColor(a66));
        a67.addActionListener(v -> data[41] = changeColor(a67));

        //Baris 7
        a71.addActionListener(v -> data[42] = changeColor(a71));
        a72.addActionListener(v -> data[43] = changeColor(a72));
        a73.addActionListener(v -> data[44] = changeColor(a73));
        a74.addActionListener(v -> data[45] = changeColor(a74));
        a75.addActionListener(v -> data[46] = changeColor(a75));
        a76.addActionListener(v -> data[47] = changeColor(a76));
        a77.addActionListener(v -> data[48] = changeColor(a77));

        //Baris 8
        a81.addActionListener(v -> data[49] = changeColor(a81));
        a82.addActionListener(v -> data[50] = changeColor(a82));
        a83.addActionListener(v -> data[51] = changeColor(a83));
        a84.addActionListener(v -> data[52] = changeColor(a84));
        a85.addActionListener(v -> data[53] = changeColor(a85));
        a86.addActionListener(v -> data[54] = changeColor(a86));
        a87.addActionListener(v -> data[55] = changeColor(a87));

        //Baris 9
        a91.addActionListener(v -> data[56] = changeColor(a91));
        a92.addActionListener(v -> data[57] = changeColor(a92));
        a93.addActionListener(v -> data[58] = changeColor(a93));
        a94.addActionListener(v -> data[59] = changeColor(a94));
        a95.addActionListener(v -> data[60] = changeColor(a95));
        a96.addActionListener(v -> data[61] = changeColor(a96));
        a97.addActionListener(v -> data[62] = changeColor(a97));

        /*
        * Test Button Event
        * Test your inputs to check, is the program is understand target of the input?
        *
        * */
        test.addActionListener(e -> {
            result = testHasil(data);
            statusLabel.setText(result);
        });

        // Clear Button Event
        clear.addActionListener(e -> {
            data[0] = resetColor(a11);
            data[1] = resetColor(a12);
            data[2] = resetColor(a13);
            data[3] = resetColor(a14);
            data[4] = resetColor(a15);
            data[5] = resetColor(a16);
            data[6] = resetColor(a17);

            data[7] = resetColor(a21);
            data[8] = resetColor(a22);
            data[9] = resetColor(a23);
            data[10] = resetColor(a24);
            data[11] = resetColor(a25);
            data[12] = resetColor(a26);
            data[13] = resetColor(a27);

            data[14] = resetColor(a31);
            data[15] = resetColor(a32);
            data[16] = resetColor(a33);
            data[17] = resetColor(a34);
            data[18] = resetColor(a35);
            data[19] = resetColor(a36);
            data[20] = resetColor(a37);

            data[21] = resetColor(a41);
            data[22] = resetColor(a42);
            data[23] = resetColor(a43);
            data[24] = resetColor(a44);
            data[25] = resetColor(a45);
            data[26] = resetColor(a46);
            data[27] = resetColor(a47);

            data[28] = resetColor(a51);
            data[29] = resetColor(a52);
            data[30] = resetColor(a53);
            data[31] = resetColor(a54);
            data[32] = resetColor(a55);
            data[33] = resetColor(a56);
            data[34] = resetColor(a57);

            data[35] = resetColor(a61);
            data[36] = resetColor(a62);
            data[37] = resetColor(a63);
            data[38] = resetColor(a64);
            data[39] = resetColor(a65);
            data[40] = resetColor(a66);
            data[41] = resetColor(a67);

            data[42] = resetColor(a71);
            data[43] = resetColor(a72);
            data[44] = resetColor(a73);
            data[45] = resetColor(a74);
            data[46] = resetColor(a75);
            data[47] = resetColor(a76);
            data[48] = resetColor(a77);

            data[49] = resetColor(a81);
            data[50] = resetColor(a82);
            data[51] = resetColor(a83);
            data[52] = resetColor(a84);
            data[53] = resetColor(a85);
            data[54] = resetColor(a86);
            data[55] = resetColor(a87);

            data[56] = resetColor(a91);
            data[57] = resetColor(a92);
            data[58] = resetColor(a93);
            data[59] = resetColor(a94);
            data[60] = resetColor(a95);
            data[61] = resetColor(a96);
            data[62] = resetColor(a97);
        });

        changePattern.addActionListener(v -> {
            ChangeData changePattern = new ChangeData();
            changePattern.setContentPane(changePattern.mainDialog);
            changePattern.setDefaultCloseOperation(ChangeData.DISPOSE_ON_CLOSE);
            changePattern.setLocationRelativeTo(null);
            changePattern.pack();
            changePattern.setVisible(true);
        });
    }

    private int changeColor(JButton button){
        int value;
        if (button.getBackground() == Color.BLACK){
            button.setBackground(Color.WHITE);
            value = -1;
        }
        else {
            button.setBackground(Color.BLACK);
            value = 1;
        }

        return value;
    }

    private int resetColor(JButton button){
        button.setBackground(Color.WHITE);

        return -1;
    }

    /*
    * Testing function
    * Check the inputs have been understand with the program
    * */
    private String testHasil(double[] data){
        double[] bobot = PerceptronLibrary.getBobot();
        double bias = PerceptronLibrary.getBias();

        for (int i = 0; i < data.length; i++){
            sum = sum + data[i] * bobot[i];
        }
        double hasil = bias + sum;
        String status;
        if (PerceptronLibrary.cekStatus(hasil) == 1){
            status = Data.getStatusGoal();
        }
        else {
            status = Data.getStatusFail();
        }

        System.out.println("cek output : " + (PerceptronLibrary.cekStatus(hasil)));
        return status;
    }
}
