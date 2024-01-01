

// Task 2 - Palindrome Checker


import java.util.Scanner;
/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Palindrome Checker");
        System.out.println("***************************************");

        Scanner scanner = new Scanner(System.in);

        char ch;
        do {
            System.out.println("1. Check the String");
            System.out.println("2. Exit");

            System.out.println("Enter your choice::");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a string::");
                    String str = scanner.next();
                    String rstr = "";
                    
                    for (int i = 0; i < str.length(); i++) {
                        char wrd;
                        wrd = str.charAt(i);
                        rstr = wrd+rstr;
                    }
                    System.out.println(rstr);
                    if (str.toLowerCase().equals(rstr.toLowerCase())) {
                        System.out.println("String is Palindrome");
                    }
                    else {
                        System.out.println("String is not Palindrome");
                    }
                    break;
            
                case 2:
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice!!");
                    break;
        }
        System.out.println("Do you want to continue?(y/n)");
        ch = scanner.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        System.out.println("Exiting..");
    }
}