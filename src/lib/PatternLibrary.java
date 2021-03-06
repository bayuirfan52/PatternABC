package lib;

public class PatternLibrary {
    private static double[][] abc = {
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
    }, bcd = {
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
                     1, 1, 1, 1, 1,-1,-1,
                     1,-1,-1,-1,-1, 1,-1,
                     1,-1,-1,-1,-1,-1, 1,
                     1,-1,-1,-1,-1,-1, 1,
                     1,-1,-1,-1,-1,-1, 1,
                     1,-1,-1,-1,-1,-1, 1,
                     1,-1,-1,-1,-1,-1, 1,
                     1,-1,-1,-1,-1, 1,-1,
                     1, 1, 1, 1, 1,-1,-1,
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
            },
            {
                     1, 1, 1, 1, 1,-1,-1,
                    -1, 1,-1,-1,-1, 1,-1,
                    -1, 1,-1,-1,-1,-1, 1,
                    -1, 1,-1,-1,-1,-1, 1,
                    -1, 1,-1,-1,-1,-1, 1,
                    -1, 1,-1,-1,-1,-1, 1,
                    -1, 1,-1,-1,-1,-1, 1,
                    -1, 1,-1,-1,-1, 1,-1,
                     1, 1, 1, 1, 1,-1,-1,
            }
    }, cde = {

    }, def = {

    }, efg = {

    }, fgh = {

    }, ghi = {

    };
    private static double[][] hij = {

    }, ijk = {

    }, jkl = {

    }, klm = {

    }, lmn = {

    }, mno = {

    }, nop = {

    };

    private static String[] abcStatus = {"A", "Bukan A"};
    private static String[] bcdStatus = {"B", "Bukan B"};

    public static String[] getAbcStatus() {
        return abcStatus;
    }

    public static String[] getBcdStatus() {
        return bcdStatus;
    }

    public static String[] getCdeStatus() {
        return cdeStatus;
    }

    private static String[] cdeStatus = {"C", "Bukan C"};

    public static double[][] getAbc() {
        return abc;
    }

    public static double[][] getBcd() {
        return bcd;
    }

    public static double[][] getCde() {
        return cde;
    }

    public static double[][] getDef() {
        return def;
    }

    public static double[][] getEfg() {
        return efg;
    }

    public static double[][] getFgh() {
        return fgh;
    }

    public static double[][] getGhi() {
        return ghi;
    }

    public static double[][] getHij() {
        return hij;
    }

    public static double[][] getIjk() {
        return ijk;
    }

    public static double[][] getJkl() {
        return jkl;
    }

    public static double[][] getKlm() {
        return klm;
    }

    public static double[][] getLmn() {
        return lmn;
    }

    public static double[][] getMno() {
        return mno;
    }

    public static double[][] getNop() {
        return nop;
    }
}
