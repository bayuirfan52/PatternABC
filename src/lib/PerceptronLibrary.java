package lib;

import sun.rmi.runtime.Log;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PerceptronLibrary {
    private static double alpha;
    private static double theta;
    private static double bias;
    private static double hasil;
    private static int iteration = 0, iterationFinal = 0, output;
    private static double[] bobot;

    public static String learn(double[][] input, double[] target){
        boolean isLoop, isLoopFinal;
        Boolean[] checkUpdate = new Boolean[input.length];

        for (int i = 0; i < checkUpdate.length; i++){
            checkUpdate[i] = false;
        }

        do {
            hasil = iterasiCekHitung(input[iteration]);
            output = cekStatus(hasil);
            if (output != target[iteration]) {
                isLoop = true;
                getBobotBias(input[iteration], target[iteration]);
            }
            else {
                if (iteration == 5) iteration = 0;
                iteration ++;
                hasil = iterasiCekHitung(input[iteration]);
                output = cekStatus(hasil);
                isLoop = output != target[iteration];
                System.out.println("isLoop : " + isLoop);
            }

            checkUpdate[iteration] = isLoop;

            isLoopFinal = Arrays.stream(checkUpdate).allMatch(Boolean::booleanValue);

            System.out.println("iteration : " + iterationFinal + ", output : " + output + ", target : " + target[iteration] + ", isLoopFinal :" + isLoopFinal + ", Check Update" + Arrays.toString(checkUpdate));
            iterationFinal++;
        }while (!isLoopFinal);
        return "Selesai";
    }

    private static double iterasiCekHitung(double[] input){
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

    public static void setAlpha(double alpha){
        PerceptronLibrary.alpha = alpha;
    }

    public static void setTheta(double theta){
        PerceptronLibrary.theta = theta;
    }

    public static void setBias(double bias){
        PerceptronLibrary.bias = bias;
    }

    public static void setBobot(double[] bobot){
        PerceptronLibrary.bobot = bobot;
    }

    public static double[] getBobot(){
        return bobot;
    }

    public static double getBias(){
        return bias;
    }

    public static int getIteration(){
        return iterationFinal;
    }
}
