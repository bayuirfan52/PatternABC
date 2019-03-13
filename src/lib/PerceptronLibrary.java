package lib;

public class PerceptronLibrary {
    private static final double alpha = 1;
    private static final double theta = 0.5;
    private static double bias = 0;
    private static double hasil;
    private static int iteration = -1, output;
    private static boolean isLoop = false;
    private static double[] bobot = {
            0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,
            0,0,0,0,0,0,0
    };

    public static String learn(double[][] input, double[] target){
        do {
            if (isLoop) getBobotBias(input[iteration], target[iteration]);
            iteration ++;
            hasil = iteraasiCekHitung(input[iteration]);
            output = cekStatus(hasil);
            isLoop = output != target[iteration];
            System.out.println("output : "+ output + ", target : " + target[iteration] + ", iteration : " + iteration);
        } while (output != target[iteration]);

        iteration ++;
        return "Selesai";
    }

    private static double iteraasiCekHitung(double[] input){
        double sum = 0;
        for (int i = 0; i < input.length; i++){
            sum = input[i] * bobot[i];
        }
        hasil = bias + sum;

        return hasil;
    }

    private static void getBobotBias(double[] input, double target){
        for (int i = 0; i < input.length; i++){
            bobot[i] = bobot[i] + (alpha * target * input[i]);
            System.out.println("Bobot["+ i +"] :" + bobot[i]);
        }
        bias = bias + alpha * target;
        System.out.println("Bias : "+ bias);
    }

    private static int cekStatus(double hasil){
        if (hasil > theta){
            output = 1;
        }
        else {
            output = -1;
        }
        return output;
    }

    public static double[] getBobot(){
        return bobot;
    }

    public static double getBias(){
        return bias;
    }

    public static int getIteration(){
        return iteration;
    }
}
