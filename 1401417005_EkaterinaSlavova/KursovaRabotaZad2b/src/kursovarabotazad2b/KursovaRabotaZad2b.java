package kursovarabotazad2b;
import java.util.Random;
import java.lang.Math;

public class KursovaRabotaZad2b {

    public static void main(String[] args) {
         // Initializing arrays
        int[] array1 = new int[20];
        int[] array2 = new int[20];
        int[] array3 = new int[20];

        // Initializing random number
        int randomNumber;
        Random rand = new Random();

        // Filling arrays with numbers
        for (int number = 0; number <= 19; number++) {
            // Array 1
            randomNumber = rand.nextInt(200) - 100;
            array1[number] = randomNumber;
            // Array 2
            randomNumber = rand.nextInt(200) - 100;
            array2[number] = randomNumber;
            // Array 3
            randomNumber = rand.nextInt(200) - 100;
            array3[number] = randomNumber;
        }

        // stoinostite ot proizvedeniqta na masivite
        int result1 = proizvedenie(array1);
        int result2 = proizvedenie(array2);
        int result3 = proizvedenie(array3);

        // Printing result of multiplication
        System.out.println("Multiplication result (Array 1): " + proizvedenie(array1));
        System.out.println("Multiplication result (Array 2): " + proizvedenie(array2));
        System.out.println("Multiplication result (Array 3): " + proizvedenie(array3));

        // Sredno geometri4no
        System.out.println("Srg : " + average(result1*result2*result3));
    }

    // Multiplication
    public static int proizvedenie(int array[]) {
        int result = 1;
        for (int i = 0; i <= 19; i++) {
            if (array[i] != 0 && array[i] % 2 == 1) {
                result *= array[i];
            }
        }
        return result;
    }
    // Average
    private static double average(double a) {
        a = Math.abs(a);
        return Math.pow(a, 1.0/3);
    }
}