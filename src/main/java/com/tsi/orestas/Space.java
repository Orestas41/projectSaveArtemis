package com.tsi.orestas;

import java.util.Random;
import java.util.Scanner;

public class Space {

        Planets[][] gameSpace;
        int spaceSize;

        public Space(int size) {
            int xPos;
            int yPos;
            Random random = new Random();

            setSpaceSize(size);
            gameSpace = new Planets[spaceSize][spaceSize];

            for (xPos = 0; xPos < spaceSize; xPos++) {
                for (yPos = 0; yPos < spaceSize; yPos++) {
                    Planets emptyTile = new Planets();
                    emptyTile.setEarth(false);
                    emptyTile.setArtemis(false);
                    emptyTile.findDisplayString();
                    gameSpace[xPos][yPos] = emptyTile;
                }
            }

            Planets earth = new Planets();
            int yEarth = random.nextInt(9);
            int xEarth = random.nextInt(9);

            Planets mars = new Planets();
            int yMars = random.nextInt(9);
            int xMars = random.nextInt(9);

            Planets venus = new Planets();
            int yVenus = random.nextInt(9);
            int xVenus = random.nextInt(9);

            Planets uranus = new Planets();
            int yUranus = random.nextInt(9);
            int xUranus = random.nextInt(9);

            Planets jupiter = new Planets();
            int yJupiter = random.nextInt(9);
            int xJupiter = random.nextInt(9);

            Planets artemis = new Planets();
            int xArtemis = 4;
            int yArtemis = 4;


            System.out.println("You are piloting a Spaceship called Artemis. You need to get back to the Planets");


            double distanceToEarth;

            do {

                if (!gameSpace[xEarth][yEarth].isEarth()) {
                    earth.setEarth(true);
                    earth.findDisplayString();
                    gameSpace[xEarth][yEarth] = earth;
                }

                if (!gameSpace[xMars][yMars].isMars()) {
                    mars.setMars(true);
                    mars.findDisplayString();
                    gameSpace[xMars][yMars] = mars;
                }

                if (!gameSpace[xVenus][yVenus].isVenus()) {
                    venus.setVenus(true);
                    venus.findDisplayString();
                    gameSpace[xVenus][yVenus] = venus;
                }

                if (!gameSpace[xUranus][yUranus].isUranus()) {
                    uranus.setUranus(true);
                    uranus.findDisplayString();
                    gameSpace[xUranus][yUranus] = uranus;
                }

                if (!gameSpace[xJupiter][yJupiter].isJupiter()) {
                    jupiter.setJupiter(true);
                    jupiter.findDisplayString();
                    gameSpace[xJupiter][yJupiter] = jupiter;
                }

                if (!gameSpace[xArtemis][yArtemis].isArtemis()) {
                    artemis.setArtemis(true);
                    artemis.findDisplayString();
                    gameSpace[xArtemis][yArtemis] = artemis;
                }

                int xDistance = xEarth - xArtemis;
                int yDistance = yEarth - yArtemis;

                distanceToEarth = Math.sqrt(((xDistance * xDistance) + (yDistance * yDistance)));

                for (int i = 0; i < spaceSize; i++) {
                    System.out.println("\n");
                    for (int j = 0; j < spaceSize; j++) {
                        System.out.print(gameSpace[i][j].getDisplayString());
                    }
                }

                Planets emptyTile = new Planets();
                emptyTile.setEarth(false);
                emptyTile.setArtemis(false);
                emptyTile.setMars(false);
                emptyTile.setVenus(false);
                emptyTile.setUranus(false);
                emptyTile.setJupiter(false);
                emptyTile.findDisplayString();
                gameSpace[xEarth][yEarth] = emptyTile;
                gameSpace[xMars][yMars] = emptyTile;
                gameSpace[xVenus][yVenus] = emptyTile;
                gameSpace[xUranus][yUranus] = emptyTile;
                gameSpace[xJupiter][yJupiter] = emptyTile;

                System.out.println("\n");
                System.out.println("Planets is " + distanceToEarth + " light-years away");

                Scanner directionInput = new Scanner(System.in);
                System.out.println("Enter the direction you want to move ");

                String direction = directionInput.next();

                switch (direction) {
                    case "Up":
                        xEarth = xEarth + 1;
                        xMars = xMars + 1;
                        xVenus = xVenus + 1;
                        xUranus = xUranus + 1;
                        xJupiter = xJupiter + 1;
                        break;
                    case "Right":
                        yEarth = yEarth - 1;
                        yMars = yMars - 1;
                        yVenus = yVenus - 1;
                        yUranus = yUranus - 1;
                        yJupiter = yJupiter - 1;
                        break;
                    case "Down":
                        xEarth = xEarth - 1;
                        xMars = xMars - 1;
                        xVenus = xVenus - 1;
                        xUranus = xUranus - 1;
                        xJupiter = xJupiter - 1;
                        break;
                    case "Left":
                        yEarth = yEarth + 1;
                        yMars = yMars + 1;
                        yVenus = yVenus + 1;
                        yUranus = yUranus + 1;
                        yJupiter = yJupiter + 1;
                        break;
                    default:
                        System.out.println("Wrong input. You can only use: Up, Down, Left, Right");
                        break;
                }
            } while ((int)(Math.round(distanceToEarth)) >= 1);

            System.out.println("Artemis has reached the Planets");

        }

        public void setSpaceSize(int value) {
            spaceSize = value;
        }

    }


