package CardRank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cSuit=sc.nextLine();

        if (cSuit.equals("Card Ranks")){
            System.out.println("Card Ranks:");
            for (CardSuits colour:CardSuits.values()) {
                System.out.printf("Ordinal value: %d; Name value: %s%n",colour.ordinal(),colour);
            }
        }


    }
}
