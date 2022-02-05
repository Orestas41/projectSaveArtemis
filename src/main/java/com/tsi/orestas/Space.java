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
                    emptyTile.findDisplayString();
                    gameSpace[xPos][yPos] = emptyTile;
                }
            }

            Planets earth = new Planets();
            int yEarth = random.nextInt(size);
            int xEarth = random.nextInt(size);
            earth.setEarth(true);
            earth.findDisplayString();
            gameSpace[xEarth][yEarth] = earth;

            Planets mars = new Planets();
            int yMars = random.nextInt(size);
            int xMars = random.nextInt(size);
            mars.setMars(true);
            mars.findDisplayString();
            gameSpace[xMars][yMars] = mars;

            Planets venus = new Planets();
            int yVenus = random.nextInt(size);
            int xVenus = random.nextInt(size);
            venus.setVenus(true);
            venus.findDisplayString();
            gameSpace[xVenus][yVenus] = venus;

            Planets uranus = new Planets();
            int yUranus = random.nextInt(size);
            int xUranus = random.nextInt(size);
            uranus.setUranus(true);
            uranus.findDisplayString();
            gameSpace[xUranus][yUranus] = uranus;

            Planets jupiter = new Planets();
            int yJupiter = random.nextInt(size);
            int xJupiter = random.nextInt(size);
            jupiter.setJupiter(true);
            jupiter.findDisplayString();
            gameSpace[xJupiter][yJupiter] = jupiter;

            Planets artemis = new Planets();
            int xArtemis = size / 2;
            int yArtemis = size / 2;
            artemis.setArtemis(true);
            artemis.findDisplayString();
            gameSpace[xArtemis][yArtemis] = artemis;

            System.out.println("                           *     .--.\n" +
                    "                                / /  `\n" +
                    "               +               | |\n" +
                    "                      '         \\ \\__,\n" +
                    "                  *          +   '--'  *\n" +
                    "                      +   /\\\n" +
                    "         +              .'  '.   *\n" +
                    "                *      /======\\      +\n" +
                    "                      ;:.  _   ;\n" +
                    "                      |:. (_)  |\n" +
                    "                      |:.  _   |\n" +
                    "            +         |:. (_)  |          *\n" +
                    "                      ;:.      ;\n" +
                    "                    .' \\:.    / `.\n" +
                    "                   / .-'':._.'`-. \\\n" +
                    "                   |/    /||\\    \\|\n" +
                    "             jgs _..--\"\"\"````\"\"\"--.._\n" +
                    "           _.-'``                    ``'-._\n" +
                    "         -'                                '-");

            System.out.println("You are piloting a Spaceship called Artemis."
                    + "\n" + "You have been stranded on the moon and you need to get back to the Earth");

            double distanceToEarth;

            do {

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
                System.out.println("/////////////////////////////////////////////////");
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
                    default:
                        System.out.println("Wrong input. You can only use: Up, Down, Left, Right");
                        break;
                }

                if (xEarth<0) {xEarth+=9;}
                if (yEarth<0) {yEarth+=9;}
                if (xEarth>8) {xEarth-=9;}
                if (yEarth>8) {yEarth-=9;}
                earth.setEarth(true);
                earth.findDisplayString();
                gameSpace[xEarth][yEarth] = earth;

                if (xMars<0) {xMars+=9;}
                if (yMars<0) {yMars+=9;}
                if (xMars>8) {xMars-=9;}
                if (yMars>8) {yMars-=9;}
                mars.setMars(true);
                mars.findDisplayString();
                gameSpace[xMars][yMars] = mars;

                if (xVenus<0) {xVenus+=9;}
                if (yVenus<0) {yVenus+=9;}
                if (xVenus>8) {xVenus-=9;}
                if (yVenus>8) {yVenus-=9;}
                venus.setVenus(true);
                venus.findDisplayString();
                gameSpace[xVenus][yVenus] = venus;

                if (xUranus<0) {xUranus+=9;}
                if (yUranus<0) {yUranus+=9;}
                if (xUranus>8) {xUranus-=9;}
                if (yUranus>8) {yUranus-=9;}
                uranus.setUranus(true);
                uranus.findDisplayString();
                gameSpace[xUranus][yUranus] = uranus;

                if (xJupiter<0) {xJupiter+=9;}
                if (yJupiter<0) {yJupiter+=9;}
                if (xJupiter>8) {xJupiter-=9;}
                if (yJupiter>8) {yJupiter-=9;}
                jupiter.setJupiter(true);
                jupiter.findDisplayString();
                gameSpace[xJupiter][yJupiter] = jupiter;

            } while ((int)(Math.round(distanceToEarth)) >= 1);

            System.out.println("                     ▓▓██████████████                      \n" +
                    "                      ▓▓████████████████████▓▓                  \n" +
                    "                  ██████▓▓▒▒▒▒▓▓██████████▓▓██████              \n" +
                    "              ▒▒████▓▓▒▒▒▒▒▒▒▒▒▒██████████▒▒▒▒██████░░          \n" +
                    "            ▓▓████▒▒▓▓██▒▒▒▒▓▓██████████▓▓▒▒▒▒▒▒▓▓████          \n" +
                    "          ██████▒▒██▓▓▓▓████████▓▓▒▒▓▓██▒▒▒▒▒▒▒▒▒▒▒▒████░░      \n" +
                    "          ██▓▓▒▒██████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████      \n" +
                    "        ██▓▓▓▓██████████▓▓▓▓██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████    \n" +
                    "      ████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████  \n" +
                    "      ████████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██  \n" +
                    "    ▓▓████████████████▒▒▒▒▒▒▒▒▓▓▒▒▒▒████▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  \n" +
                    "    ████████████████▓▓▒▒▓▓████▒▒▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██\n" +
                    "  ▓▓██████████████████▒▒▒▒▒▒██▓▓████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
                    "  ██████████████████▒▒▒▒▒▒▒▒▓▓████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
                    "  ████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓▓▓▒▒▒▒▒▒▒▒██▒▒██\n" +
                    "▒▒██████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒████████▒▒▒▒██████\n" +
                    "▓▓██████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▓▓████▓▓▒▒██████\n" +
                    "██████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒██████████▒▒██████\n" +
                    "▓▓██▓▓██████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████████████████████\n" +
                    "▒▒██▓▓▒▒████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████████████████\n" +
                    "  ████▒▒▓▓██████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████████████████\n" +
                    "  ████▒▒▒▒████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████████████████\n" +
                    "  ▒▒██▒▒▒▒████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓████████████████████\n" +
                    "    ████▒▒██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████████████████▓▓\n" +
                    "    ▓▓██▒▒██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████████████████  \n" +
                    "      ██████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒██▒▒████████████████  \n" +
                    "      ▒▒████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓██████████████▒▒  \n" +
                    "        ▓▓████████████████████▒▒▒▒▒▒▒▒▒▒██▓▓██████████████▓▓    \n" +
                    "          ████████████████████▒▒▒▒▒▒▒▒████████████████████      \n" +
                    "          ░░████████████████████████████████████████████        \n" +
                    "              ▓▓████████████████████████████████████▒▒          \n" +
                    "                  ████████████████████████████████              \n" +
                    "                      ▓▓████████████████████▓▓   ");
            System.out.println("Artemis has reached the Earth");

        }

        public void setSpaceSize(int value) {
            spaceSize = value;
        }

    }


