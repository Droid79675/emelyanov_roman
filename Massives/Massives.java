import java.util.Random;
public class Massives {
    static Random random = new Random();
    static double[] ufe = new double[25];
    public static void main(String[] args) {
        int operator[] = new int[10];
        for (int i = 0; i < operator.length; i++) {
            operator[i] = random.nextInt();
            System.out.println(operator[i]);
        }
        gyp();
        pou();
        han();
        vuw();
    }



    private static void gyp() {
        double[] slurp = new double[9];
        slurp = ufe;
        for (int i = 0; i < ufe.length; i++) {
            ufe[i] = random.nextDouble();
            System.out.println(ufe[i]);
        }
    }
    private static void pou() {
        double[] lox = new double[8];
        for (int i = 0; i < lox.length; i++) {
            lox[i] = random.nextDouble();
            System.out.println(lox[i]);
        }
    }

    public static void han() {
        long [] wow = new long[17];
        for (int i = 0; i < wow.length; i++) {
            wow[i] = random.nextLong();
            System.out.println(wow[i]);
        }
    }
    public static void vuw() {
        boolean [] nice = new boolean[5];
        for (int i = 0; i < nice.length; i++) {
            nice[i] = random.nextBoolean();
            System.out.println(nice[i]);
        }
    }

}


