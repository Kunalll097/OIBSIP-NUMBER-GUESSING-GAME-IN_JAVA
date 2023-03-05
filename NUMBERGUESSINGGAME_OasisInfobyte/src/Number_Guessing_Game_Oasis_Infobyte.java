//KunalLade OIB/M1/IP5783

import java.util.*;

class Number_Guessing_Game_Oasis_Infobyte {


    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);

        System.out.println("-------------------------------------------------------");
        System.out.println("--------------KunalLade OIB/M1/IP5783------------------");
        System.out.println("------Hi!------");
        System.out.println("------I Am Kunal Lade The developer of This Game-------");
        System.out.println("-------------------------------------------------------");
        System.out.println("\n");
        System.out.println("_______________--  Guess The Number.  --_______________");
        System.out.println("You have Max 6 chances to Guess the no ... ");
        System.out.println("The Number is Between the range of 1 to 100 ");

        System.out.println("");

        int min = 0;
        int max = 100;
        Random r = new Random();
        int x = r.nextInt(1, 100);


        System.out.println("Enter Your Number. ");

        int i;
        int no = 0;
        for (i = 1; i <= 6; i++) {

            no = si.nextInt();

            if (no == x) {
                System.out.println("Congratulation!!!!!... Your Guess is Correct ");
                System.exit(0);
            } else {
                if (x > no) {
                    System.out.println("Your Guess is Small than the Number ... ");
                    System.out.println("Please Try Again... \n And Guess Higher Number  ... ");
                    System.out.println("----------------------------------------------------");
                } else {
                    System.out.println("Your Guess is Greater than the Number ... ");
                    System.out.println("Please Try Again  ... \n And Guess Lower Number");
                    System.out.println("----------------------------------------------------");
                }

            }
        }
        int Score = 100 - i;
        System.out.println("Your Score is : " + Score);
    }
}
