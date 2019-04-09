package form;

import data.Data;

import javax.swing.*;
import java.awt.*;

public class ChangeData extends JFrame{
    private JButton a11;
    private JButton a16;
    private JButton a17;
    private JButton a12;
    private JButton a13;
    private JButton a14;
    private JButton a15;
    private JButton a21;
    private JButton a26;
    private JButton a27;
    private JButton a22;
    private JButton a23;
    private JButton a24;
    private JButton a25;
    private JButton a31;
    private JButton a36;
    private JButton a37;
    private JButton a32;
    private JButton a33;
    private JButton a34;
    private JButton a35;
    private JButton a41;
    private JButton a46;
    private JButton a47;
    private JButton a42;
    private JButton a43;
    private JButton a44;
    private JButton a45;
    private JButton a51;
    private JButton a56;
    private JButton a57;
    private JButton a52;
    private JButton a53;
    private JButton a54;
    private JButton a55;
    private JButton a61;
    private JButton a66;
    private JButton a67;
    private JButton a62;
    private JButton a63;
    private JButton a64;
    private JButton a65;
    private JButton a71;
    private JButton a76;
    private JButton a77;
    private JButton a72;
    private JButton a73;
    private JButton a74;
    private JButton a75;
    private JButton a81;
    private JButton a86;
    private JButton a87;
    private JButton a82;
    private JButton a83;
    private JButton a84;
    private JButton a85;
    private JButton a91;
    private JButton a96;
    private JButton a97;
    private JButton a92;
    private JButton a93;
    private JButton a94;
    private JButton a95;
    private JRadioButton pola1;
    private JRadioButton pola2;
    private JRadioButton pola3;
    private JRadioButton pola4;
    private JRadioButton pola5;
    private JRadioButton pola6;
    private JButton submit;
    public JPanel mainDialog;
    ButtonGroup patternGroup;

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

    ChangeData(){
        this.setTitle("Change Pattern");

        submit.addActionListener(v -> {
            if (pola1.isSelected()){
                Data.setDataLearning(data,0);
            }
            else if (pola2.isSelected()){
                Data.setDataLearning(data,1);
            }
            else if (pola3.isSelected()){
                Data.setDataLearning(data,2);
            }
            else if (pola4.isSelected()){
                Data.setDataLearning(data,3);
            }
            else if (pola5.isSelected()){
                Data.setDataLearning(data,4);
            }
            else if (pola6.isSelected()){
                Data.setDataLearning(data,5);
            }

            System.out.println("Submitted");
            this.setVisible(false);
            }
        );

        patternGroup = new ButtonGroup();
        patternGroup.add(pola1);
        patternGroup.add(pola2);
        patternGroup.add(pola3);
        patternGroup.add(pola4);
        patternGroup.add(pola5);
        patternGroup.add(pola6);

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
}
