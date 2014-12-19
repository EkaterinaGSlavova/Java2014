/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtorouprajnenie1;

/**
 *
 * @author Katia
 */
public class Vtorouprajnenie1 {

    public static void main(String[] args) {
        // TODO code application logic here
       /*int i = 1;
        while (i<11) {
            System.out.println("i="  +i);
            i++;
        }
        */
        /*for(int i=20; i>0; i=i-1)

        System.out.println(i);
        */
        /* int i;

        for(i=1; i<=5; i++)

            System.out.println('a');

        for(i=1; i<=10; i++)

            System.out.println('b');
        */
        //zad 10 urp 2
       /*double m[] = {1.1, 2.2, 3.3, 4.4, 5.5};


            for(int i=0; i< m.length; i++)

            System.out.println(m[i]); 
       */
        //zad 12
        /*int m[] = {1, 5, - 4, 20, -9, 33, 1, 4, 7, 8};

            for(int i=0; i<m.length; i++) {
                if(m[i]<30)

                System.out.println("m[" + i + "] = " + m[i]);

                else

                break;

            }
        
        */
        /*
        int m[] = { 1, -5, -4, 20, 0, 5, -4, 7 };

            int sum = 0;

            for (int i = 0; i < m.length; i++) {
            if (m[i] <= 0) {

            sum += m[i];

            continue;

            }

            System.out.println("m[" + i + "] = " + m[i]);

            }

            System.out.println("Сумата на отрицателните числа е "+ sum);
         */
            for (int i = 1; i <= 5; i++) {

            for(int j = 1; j <= i; j++) // за i-тия ред се извеждат i-на брой 'B'-та

            System.out.print('B');

            System.out.println(); // и след това се отпечатва край на ред

            }

    }
}