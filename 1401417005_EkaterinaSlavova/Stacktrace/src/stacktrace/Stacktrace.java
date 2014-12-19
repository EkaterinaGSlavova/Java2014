
package stacktrace;

/**
 *
 * @author Katia
 */
public class Stacktrace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Start main");
        m1();
        System.out.println("End main");
    }
    public static void m1() {
        System.out.println("Second method m1");
        m2();
    }
    public static void m2() {
        System.out.println("last method 2");
        int x = 10;
        int y = 0;
        int z = x/y;
        System.out.println(z);
    }
}
