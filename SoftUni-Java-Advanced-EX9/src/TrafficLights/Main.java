package TrafficLights;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split("\\s+");
        int updates=Integer.parseInt(sc.nextLine());
        ArrayList<TrafficLight> lights=new ArrayList<>();
        for (String el:input) {
            TrafficLight cr=new TrafficLight(Colour.valueOf(el));
            lights.add(cr);
        }

        for (int i = 0; i < updates; i++) {
            for (TrafficLight cr:lights) {
                cr.update();
                System.out.print(cr.getLight()+" ");
            }
            System.out.println();

        }





    }
}
