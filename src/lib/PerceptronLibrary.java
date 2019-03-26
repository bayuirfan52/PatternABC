package lib;

import java.util.Arrays;

/*
* Perceptron Library
*
* For training to the system, please use 2 Dimensional Array of Weight and 1 dimensional Array of target.
* Insert the W and b input with static function setBobot and setBias.
* Insert the Alpha and Theta with static function setAlpha and setTheta manually in your program.
* Use static function "learn" to start learning on the system.
* Use static function "test" to test your input to the system.
*
* This library may include error of logical. Your contribution are needed.
*
* Created by bayuirfan52
* Modified by bayuirfan52 at 24/03/2019, 07.42 WIB
*
* */

public class PerceptronLibrary {
    private static double alpha;
    private static double theta;
    private static double bias;
    private static double hasil;
    private static int iteration = 0, iterationFinal = 1, output;
    private static double[] bobot;

    public static String learn(double[][] input, double[] target){
        boolean isLoop, isLoopFinal;
        Boolean[] checkUpdate = new Boolean[input.length];

        for (int i = 0; i < checkUpdate.length; i++){
            checkUpdate[i] = true;
        }

        do {
            if (iteration == input.length) {
                iteration = 0;
                iterationFinal++;
            }

            hasil = iterasiCekHitung(input[iteration]);
            output = cekStatus(hasil);

            System.out.println(" ");
            System.out.println("iterasi ke : " + iterationFinal);
            System.out.println("pola ke : " + (iteration + 1));
            System.out.println("output : " + output + ", target : " + target[iteration]);

            isLoop = output != target[iteration];
            if (isLoop) {
                System.out.println("----------Get Bobot Bias------------");
                getBobotBias(input[iteration], target[iteration]);
            }

            checkUpdate[iteration] = isLoop;
            System.out.println("Value : " + isLoop);
            iteration ++;
            System.out.println("Array Check status : " + Arrays.toString(checkUpdate));
            isLoopFinal = Arrays.stream(checkUpdate).noneMatch(val -> val);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (!isLoopFinal && iterationFinal != 100);
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
        }
        bias = bias + alpha * target;
        System.out.println("Bobot : " + Arrays.toString(bobot));
        System.out.println("Bias : "+ bias);
        System.out.println("Target : "+ target);
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
