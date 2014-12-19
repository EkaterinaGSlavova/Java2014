package purvouprajnenie;
import java.util.Scanner;

public class PurvoUprajnenie {    

    public static void main(String[] args) {
        
        int i=5;
        i= i+10;
        
        System.out.println(i);
        
        double a = 2.5d;
        double b = 2.34d;
        
        System.out.println(a+ "+" +b + "=" + (a+b));
        System.out.println(a+ "-" +b + "=" + (a-b));
        System.out.println(a+ "*" +b + "=" + (a*b));
        System.out.println(a+ "/" +b + "=" + (a/b));
    
        double c, d;
        c = 3.57874d;
        d = 43.24564d;
        c = ++c;
        d = ++d;
        
        System.out.println(c);
        System.out.println(d);
        
        c += 3;
        d -= 4;
        a *=6;
        b /=4;
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        
        double d1 = 8.5, d2 = 3;

        zad9(d1, d2); // 8.5*3 е < 50
        zad9(2, 25); //  2*25 е = 50
        zad9(3, 25); // 3*25 e > 50
    
        double c1 = 15, c2 = 3.4;
        double f = 9.8, g = 7.6;
    
        zad11( f, g); // sum = 53.3200000
    
        Scanner input = new Scanner(System.in);
        
        double var1 = input.nextDouble();
        double var2 = input.nextDouble();
        double var3 = input.nextDouble();
        double var4 = input.nextDouble();
        
        zad11(var1, var2);
        zad11(var3, var4);
    
    }
    
    public static void zad9(double d1, double d2) {
        
        double d3 = d1*d2; 

        if (d3>50) {
            System.out.println(d1 + "*" + d2 + " = " + d3);
        }
    }

    public static void zad10(double c1, double c2) {
          
        if (c1+c2>20)
            System.out.println((c1+c2)*(c1-c2));
        else
            System.out.println((c1+c2)/5);

    }
    
    public static void zad11(double f, double g) {
        
        double sum = 0;
        sum =  f*f + 2*(f-g*g)+7*g;
        System.out.println(sum);
        
    }
    
 }