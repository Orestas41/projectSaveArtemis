package com.tsi.orestas;

import java.util.Scanner;

public class Space {

        Earth[][] space;
        int spaceSize;

        public Space(int size) {
            int xPos, yPos;

            setSpaceSize(size);
            space = new Earth[spaceSize][spaceSize];

            for (xPos = 0; xPos < spaceSize; xPos++) {
                for (yPos = 0; yPos < spaceSize; yPos++) {
                    Earth emptyTile = new Earth();
                    emptyTile.setEarth(false);
                    emptyTile.setArtemis(false);
                    emptyTile.findDisplayString();
                    space[xPos][yPos] = emptyTile;
                }
            }

            Earth earth = new Earth();
            int yEarth = (int)(Math.random()*10-1);
            int xEarth = (int)(Math.random()*10-1);

            Earth mars = new Earth();
            int yMars = (int)(Math.random()*10-1);
            int xMars = (int)(Math.random()*10-1);

            Earth venus = new Earth();
            int yVenus = (int)(Math.random()*10-1);
            int xVenus = (int)(Math.random()*10-1);

            Earth uranus = new Earth();
            int yUranus = (int)(Math.random()*10-1);
            int xUranus = (int)(Math.random()*10-1);

            Earth jupiter = new Earth();
            int yJupiter = (int)(Math.random()*10-1);
            int xJupiter = (int)(Math.random()*10-1);

            Earth artemis = new Earth();
            int xArtemis = 4;
            int yArtemis = 4;


            System.out.println("You are piloting a space ship called Artemis. You need to get back to the Earth");


            double distanceToEarth;

            do {

                if (space[xEarth][yEarth].isEarth() == false) {
                    earth.setEarth(true);
                    earth.findDisplayString();
                    space[xEarth][yEarth] = earth;
                }

                if (space[xMars][yMars].isMars() == false) {
                    mars.setMars(true);
                    mars.findDisplayString();
                    space[xMars][yMars] = mars;
                }

                if (space[xVenus][yVenus].isVenus() == false) {
                    venus.setVenus(true);
                    venus.findDisplayString();
                    space[xVenus][yVenus] = venus;
                }

                if (space[xUranus][yUranus].isUranus() == false) {
                    uranus.setUranus(true);
                    uranus.findDisplayString();
                    space[xUranus][yUranus] = uranus;
                }

                if (space[xJupiter][yJupiter].isJupiter() == false) {
                    jupiter.setJupiter(true);
                    jupiter.findDisplayString();
                    space[xJupiter][yJupiter] = jupiter;
                }

                if (space[xArtemis][yArtemis].isArtemis() == false) {
                    artemis.setArtemis(true);
                    artemis.findDisplayString();
                    space[xArtemis][yArtemis] = artemis;
                }

                int xDistance = xEarth - xArtemis;
                int yDistance = yEarth - yArtemis;

                distanceToEarth = Math.sqrt(((xDistance * xDistance) + (yDistance * yDistance)));

                for (int i = 0; i < spaceSize; i++) {
                    System.out.println("\n");
                    for (int j = 0; j < spaceSize; j++) {
                        System.out.print(space[i][j].getDisplayString());
                    }
                }

                Earth emptyTile = new Earth();
                emptyTile.setEarth(false);
                emptyTile.setArtemis(false);
                emptyTile.setMars(false);
                emptyTile.setVenus(false);
                emptyTile.setUranus(false);
                emptyTile.setJupiter(false);
                emptyTile.findDisplayString();
                space[xEarth][yEarth] = emptyTile;
                space[xMars][yMars] = emptyTile;
                space[xVenus][yVenus] = emptyTile;
                space[xUranus][yUranus] = emptyTile;
                space[xJupiter][yJupiter] = emptyTile;

                System.out.println("\n");
                System.out.println("Earth is " + distanceToEarth + " light-years away");

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
                }
            } while ((int)(Math.round(distanceToEarth)) >= 1);

            System.out.println("Artemis has reached the Earth");

        }

        public void setSpaceSize(int value) {
            spaceSize = value;
        }

    }




    /*private String displayString;

    static int[] x = new int[10];
    static int[] y = new int[10];

    //static int[] y = {-4,-3,-2,-1,0,1,2,3,4};

    static int[][] space = new int[10][10];

    static int earth = space[(int)(Math.random()*10-1)][(int)(Math.random()*10-1)];

    static int artemis = space[5][5];

    static String empty = " . ";

    */


