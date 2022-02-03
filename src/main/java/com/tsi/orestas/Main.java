package com.tsi.orestas;

import java.util.Scanner;

import static com.tsi.orestas.Artemis.artemisCurrentX;
import static com.tsi.orestas.Artemis.artemisCurrentY;
import static com.tsi.orestas.Artemis.distanceToEarth;
import static com.tsi.orestas.Earth.xEarth;
import static com.tsi.orestas.Earth.yEarth;

public class Main {
    public static void main(String[] args) {

        //Earth earthLocation = new Earth();
        //Artemis artemisLocation = new Artemis();
        System.out.println("You are piloting a space ship called Artemis. You need to get back to the Earth");
        //System.out.print(xEarth);
        //System.out.print(yEarth);


        while (distanceToEarth != 0.0) {

            int xDistance = xEarth - artemisCurrentX;
            int yDistance = yEarth - artemisCurrentY;

            double distanceToEarth = Math.sqrt(((xDistance*xDistance)+(yDistance*yDistance)));

            //System.out.println(artemisCurrentX);
            //System.out.println(artemisCurrentY);

            System.out.println("Earth is " + distanceToEarth + " light-years away");

            Scanner directionInput = new Scanner(System.in);
            System.out.println("Enter the direction you want to move ");

            String direction = directionInput.next();
            //String[] possibleDirections = {"North", "East", "South", "West"};

            switch (direction) {
                case "North":
                    artemisCurrentY = artemisCurrentY + 1;
                    break;
                case "East":
                    artemisCurrentX = artemisCurrentX + 1;
                    break;
                case "South":
                    artemisCurrentY = artemisCurrentY - 1;
                    break;
                case "West":
                    artemisCurrentX = artemisCurrentX - 1;
                    break;
            }
        }

        System.out.println("Artemis has reached the Earth");


    }
}
