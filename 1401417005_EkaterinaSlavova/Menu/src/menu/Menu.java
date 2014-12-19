package menu;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
       
        showMenu();
        
        Scanner a = new Scanner(System.in);
        String choice; 
        int i;
        
        do { 
           
            System.out.print("Choose option from 1 to 5: ");
            i = a.nextInt();
            
            switch (i) { 
                case 1: choice = "You chose option 1: Draw Money"; break; 
                case 2: choice = "You chose option 2: Change your PIN number"; break;
                case 3: choice = "You chose option 3: Check your account"; break;
                case 4: choice = "You chose option 4: Settings"; break;
                case 5: choice = "You chose option 5: Exit"; break;
                default: choice = "This is not an option, please choose again: "; 
            }

            System.out.println(choice);
           
        } while(i!=5);

        a.close();
             
    }
    /* END MAIN */
    
    public static void showMenu() {
        
        System.out.println("Menu");
        System.out.println(" 1. Draw money");
        System.out.println(" 2. Change your PIN number");
        System.out.println(" 3. Check your account");
        System.out.println(" 4. Settings");
        System.out.println(" 5. Exit");
        System.out.print("Choose and option from 1 to 5: ");
        
    }
}