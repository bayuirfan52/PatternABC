package data;

public class Data {
    //Input for learning to the program. This Array pattern are called by input in PerceptronLibrary.
    private static double[][] dataLearning = {
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

    //Array of Target. Type the target with starting from pattern of input. If the input are 6 pattern, type 6 pattern of the target too.
    private static double[] target =
            { 1,-1,-1, 1,-1,-1};

    //Initialize the W
    private static double[] bobot =
            {
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0
            };

    public static double[][] getDataLearning() {
        return dataLearning;
    }

    public static void setDataLearning(double[] dataLearning, int index) {
        Data.dataLearning[index] = dataLearning;
    }

    public static double[] getTarget() {
        return target;
    }

    public static void setTarget(double[] target) {
        Data.target = target;
    }

    public static double[] getBobot() {
        return bobot;
    }
}
