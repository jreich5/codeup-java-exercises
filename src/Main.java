public class Main {

    public static void main(String[] args) {


        System.out.println();


        // Not truthy or falsy
        /*
        int number = 5;
        if (number) {
            System.out.println("This will not print.");
        }
        */
























        // 5.3 - Control Statements

        /*
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }


        int i = 100;
        while (i >= 0 ) {
            System.out.println(i);
            i -= 5;
        }


        int i = 2;

        do {
            System.out.println(i);
            i *= i;
        } while(i < 1000000 && i != 0);


        for (int i = 100; i >= 0; i -=5) {
            System.out.println(i);
        }

        for (int i = 2; i < 1000000 && i != 0; i *= i) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
             if (i % 5 == 0 && i % 3 == 0) {
                 System.out.println("FizzBuzz");
             } else if (i % 3 == 0) {
                 System.out.println("Fizz");
             } else if (i % 5 == 0) {
                 System.out.println("Buzz");
             } else {
                 System.out.println(i);
             }
         }



        int userInput;
        String continueGame = "yes";


        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number:");
            userInput = sc.nextInt();

            for (int i = 1; i <= userInput; i++) {
                System.out.print("\n" + i + " to the power of 2 is " + (i * i));
                System.out.print(" || " + i + " to the power of 3 is " + (i * i * i));
            }

            System.out.println("\n\nWould you like to enter another number?");
            continueGame = sc.next();

        } while (Objects.equals(continueGame, "yes"));



        int userInput;
        String continueGame = "yes";


        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number grade:");
            userInput = sc.nextInt();

            if (userInput <= 60) {
                System.out.println("The letter grade is F");
            } else if (userInput <= 66) {
                System.out.println("The letter grade is D");
            } else if (userInput <= 79) {
                System.out.println("The letter grade is C");
            } else if (userInput <= 87) {
                System.out.println("The letter grade is B");
            } else {
                System.out.println("The letter grade is A");
            }

            System.out.println("\nWould you like to enter another number grade?");
            continueGame = sc.next();

        } while (Objects.equals(continueGame, "yes"));
        */


    }

    public static boolean isTrue() {
        return true;
    }














}
