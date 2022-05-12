package CardSuit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cSuit=sc.nextLine();

        if (cSuit.equals("Card Suits")){
            System.out.println("Card Suits:");
            for (CardSuits colour:CardSuits.values()) {
                System.out.printf("Ordinal value: %d; Name value: %s%n",colour.ordinal(),colour);
            }
        }


    }
}
