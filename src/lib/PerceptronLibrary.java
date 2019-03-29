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
* Modified by bayuirfan52 at 26/03/2019, 14.32 WIB
*
* */

public class PerceptronLibrary {
    private static double alpha;
    private static double theta;
    private static double bias;
    private static double hasil;
    private static int iteration = 0, iterationFinal = 0, output;
    private static double[] bobot;

    /*
    * Learn function
    * Use with static method. This algorithm can be read on the Artificial Neural Network module.
    * Insert input with double 2D array and double 1D array of target.
    *
    * */

    public static String learn(double[][] input, double[] target){
        //This variable is used to checking when output from activation function is same with target or not.
        boolean isLoop;
        //This variable is used to checking when all of W can be use to input pattern to get output that same with the target.
        boolean isLoopFinal;
        //Array for checking all pattern of W are can be used to get same output with target from input
        Boolean[] checkUpdate = new Boolean[input.length];

        //Initialize the Array
        for (int i = 0; i < checkUpdate.length; i++){
            checkUpdate[i] = true;
        }

        //Iteration for all of process (Main Method)
        do {
            //Go back the iteration index after iteration = index of input
            if (iteration == input.length) {
                iteration = 0;
                // Add 1 Epoch value
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
        }while (!isLoopFinal);
        return "Selesai";
    }

    /*
    * Get the net value
    * Read the ANN module
    * */
    private static double iterasiCekHitung(double[] input){
        double sum = 0;
        for (int i = 0; i < input.length; i++){
            sum = sum + input[i] * bobot[i];
        }
        hasil = bias + sum;

        return hasil;
    }

    /*
    * Update all values of W and b
    * This function is reference to ANN module of Perceptron
    * */
    private static void getBobotBias(double[] input, double target){
        for (int i = 0; i < input.length; i++){
            bobot[i] = bobot[i] + (alpha * target * input[i]);
        }
        bias = bias + alpha * target;
        System.out.println("Bobot : " + Arrays.toString(bobot));
        System.out.println("Bias : "+ bias);
    }

    /*
    * Activation function [ f(net) ]
    * In this requirement of program, just used to get output with 1 and -1
    *
    * */
    public static int cekStatus(double hasil){
        if (hasil > theta){
            output = 1;
        }
        else {
            output = -1;
        }
        return output;
    }

    /*
    * Functions to set All main value of the program to get compatible W and b
    *
    * set W, use setBobot function
    * set b, use setBias function
    * Alpha and Theta, you can read the name of set function.
    * */

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

    /*
    * Getter function.
    * Use this functions to get value of W, b, and Epoch from another class.
    * W is getBobot
    * b is getBias
    * Epoch is getIteration
    * */

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
