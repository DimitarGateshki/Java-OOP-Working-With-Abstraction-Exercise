package CardsWithPower;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String cType=sc.nextLine();
            String cColour=sc.nextLine();
            int sum=CardSuits.valueOf(cType).getPower()+CardColour.valueOf(cColour).getPower();
            System.out.printf("Card name: %s of %s; Card power: %d",cType,cColour,sum );







    }
}
