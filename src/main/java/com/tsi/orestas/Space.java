package com.tsi.orestas;

import java.security.SecureRandom;
import java.util.Scanner;

public class Space {

        Planets[][] gameSpace;
        int spaceSize;

        public Space(int size) {
            int xPos;
            int yPos;
            SecureRandom random = new SecureRandom();

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

            System.out.println("""
                                               *     .--.
                                                    / /  `
                                   +               | |
                                          '         \\ \\__,
                                      *          +   '--'  *
                                          +   /\\
                             +              .'  '.   *
                                    *      /======\\      +
                                          ;:.  _   ;
                                          |:. (_)  |
                                          |:.  _   |
                                +         |:. (_)  |          *
                                          ;:.      ;
                                        .' \\:.    / `.
                                       / .-'':._.'`-. \\
                                       |/    /||\\    \\|
                                   _..--\"\"\"````\"\"\"--.._
                               _.-'``                    ``'-._
                             -'                                '-""");

            System.out.println("You are piloting a Spaceship called Artemis."
                    + "\n" + "You have been stranded on the moon and you need to get back to the Earth");

            double distanceToEarth;
            double distanceToMars;
            double distanceToVenus;
            double distanceToUranus;
            double distanceToJupiter;

            do {

                int xEarthDistance = xEarth - xArtemis;
                int yEarthDistance = yEarth - yArtemis;

                distanceToEarth = Math.sqrt(((xEarthDistance * xEarthDistance) + (yEarthDistance * yEarthDistance)));

                int xMarsDistance = xMars - xArtemis;
                int yMarsDistance = yMars - yArtemis;

                distanceToMars = Math.sqrt(((xMarsDistance * xMarsDistance) + (yMarsDistance * yMarsDistance)));

                int xVenusDistance = xVenus - xArtemis;
                int yVenusDistance = yVenus - yArtemis;

                distanceToVenus = Math.sqrt(((xVenusDistance * xVenusDistance) + (yVenusDistance * yVenusDistance)));

                int xUranusDistance = xUranus - xArtemis;
                int yUranusDistance = yUranus - yArtemis;

                distanceToUranus = Math.sqrt(((xUranusDistance * xUranusDistance) + (yUranusDistance * yUranusDistance)));

                int xJupiterDistance = xJupiter - xArtemis;
                int yJupiterDistance = yJupiter - yArtemis;

                distanceToJupiter = Math.sqrt(((xJupiterDistance * xJupiterDistance) + (yJupiterDistance * yJupiterDistance)));

                if (distanceToMars < 1){
                    System.out.println(
                            "        ~+\n" +
                            "\n" +
                            "                 *       +\n" +
                            "           '                  |\n" +
                            "       ()       ,=\"``\"=.    - o -\n" +
                            "               /    O \\     |\n" +
                            "          *   |  '       |\n" +
                            "               \\  '     /          '\n" +
                            "            .   '=.__.='          *\n" +
                            "   +                         +\n" +
                            "        O      *        '       .Mars");
                }
                if (distanceToVenus < 1){
                    System.out.println(
                            "             _______\n" +
                            "          .-' _____ '-.\n" +
                            "        .' .-'.  ':'-. '.\n" +
                            "       / .''::: .:    '. \\\n" +
                            "      / /   :::::'      \\ \\\n" +
                            "     | ;.    ':' `       ; |\n" +
                            "     | |       '..       | |\n" +
                            "     | ; '      ::::.    ; |\n" +
                            "      \\ \\       '::::   / /\n" +
                            "       \\ '.      :::  .' /\n" +
                            "        '. '-.___'_.-' .'\n" +
                            "Venus     '-._______.-");
                }
                if (distanceToUranus < 1){
                    System.out.println(
                            "                                                                    ..;===+.\n" +
                            "                                                                .:=iiiiii=+=\n" +
                            "                                                             .=i))=;::+)i=+,\n" +
                            "                                                          ,=i);)I)))I):=i=;\n" +
                            "                                                       .=i==))))ii)))I:i++\n" +
                            "                                                     +)+))iiiiiiii))I=i+:'\n" +
                            "                                .,:;;++++++;:,.       )iii+:::;iii))+i='\n" +
                            "                             .:;++=iiiiiiiiii=++;.    =::,,,:::=i));=+'\n" +
                            "                           ,;+==ii)))))))))))ii==+;,      ,,,:=i))+=:\n" +
                            "                         ,;+=ii))))))IIIIII))))ii===;.    ,,:=i)=i+\n" +
                            "                        ;+=ii)))IIIIITIIIIII))))iiii=+,   ,:=));=,\n" +
                            "                      ,+=i))IIIIIITTTTTITIIIIII)))I)i=+,,:+i)=i+\n" +
                            "                     ,+i))IIIIIITTTTTTTTTTTTI))IIII))i=::i))i='\n" +
                            "                    ,=i))IIIIITLLTTTTTTTTTTIITTTTIII)+;+i)+i`\n" +
                            "                    =i))IIITTLTLTTTTTTTTTIITTLLTTTII+:i)ii:'\n" +
                            "                   +i))IITTTLLLTTTTTTTTTTTTLLLTTTT+:i)))=,\n" +
                            "                   =))ITTTTTTTTTTTLTTTTTTLLLLLLTi:=)IIiii;\n" +
                            "                  .i)IIITTTTTTTTLTTTITLLLLLLLT);=)I)))))i;\n" +
                            "                  :))IIITTTTTLTTTTTTLLHLLLLL);=)II)IIIIi=:\n" +
                            "                  :i)IIITTTTTTTTTLLLHLLHLL)+=)II)ITTTI)i=\n" +
                            "                  .i)IIITTTTITTLLLHHLLLL);=)II)ITTTTII)i+\n" +
                            "                  =i)IIIIIITTLLLLLLHLL=:i)II)TTTTTTIII)i'\n" +
                            "                +i)i)))IITTLLLLLLLLT=:i)II)TTTTLTTIII)i;\n" +
                            "              +ii)i:)IITTLLTLLLLT=;+i)I)ITTTTLTTTII))i;\n" +
                            "             =;)i=:,=)ITTTTLTTI=:i))I)TTTLLLTTTTTII)i;\n" +
                            "           +i)ii::,  +)IIITI+:+i)I))TTTTLLTTTTTII))=,\n" +
                            "         :=;)i=:,,    ,i++::i))I)ITTTTTTTTTTIIII)=+'\n" +
                            "       .+ii)i=::,,   ,,::=i)))iIITTTTTTTTIIIII)=+\n" +
                            "      ,==)ii=;:,,,,:::=ii)i)iIIIITIIITIIII))i+:'\n" +
                            "     +=:))i==;:::;=iii)+)=  `:i)))IIIII)ii+'\n" +
                            "   .+=:))iiiiiiii)))+ii;\n" +
                            "  .+=;))iiiiii)));ii+\n" +
                            " .+=i:)))))))=+ii+\n" +
                            ".;==i+::::=)i=;\n" +
                            ",+==iiiiii+,\n" +
                            "`+=+++;`Uranus");
                }
                if (distanceToJupiter < 1){
                    System.out.println(
                            "                .                                            .\n" +
                            "     *   .                  .              .        .   *          .\n" +
                            "  .         .                     .       .           .      .        .\n" +
                            "        o                             .                   .\n" +
                            "         .              .                  .           .\n" +
                            "          0     .\n" +
                            "                 .          .                 ,                ,    ,\n" +
                            " .          \\          .                         .\n" +
                            "      .      \\   ,\n" +
                            "   .          o     .                 .                   .            .\n" +
                            "     .         \\                 ,             .                .\n" +
                            "               #\\##\\#      .                              .        .\n" +
                            "             #  #O##\\###                .                        .\n" +
                            "   .        #*#  #\\##\\###                       .                     ,\n" +
                            "        .   ##*#  #\\##\\##               .                     .\n" +
                            "      .      ##*#  #o##\\#         .                             ,       .\n" +
                            "          .     *#  #\\#     .                    .             .          ,\n" +
                            "                      \\          .                         .\n" +
                            "____^/\\___^--____/\\____O______________/\\/\\---/\\___________---______________\n" +
                            "   /\\^   ^  ^    ^                  ^^ ^  '\\ ^          ^       ---\n" +
                            "         --           -            --  -      -         ---  __       ^\n" +
                            "   --  __                      ___--  ^  ^                         --  __");
                }

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

                if (xEarth<0) {xEarth+=size;}
                if (yEarth<0) {yEarth+=size;}
                if (xEarth==size) {xEarth-=size;}
                if (yEarth==size) {yEarth-=size;}
                earth.setEarth(true);
                earth.findDisplayString();
                gameSpace[xEarth][yEarth] = earth;

                if (xMars<0) {xMars+=size;}
                if (yMars<0) {yMars+=size;}
                if (xMars==size) {xMars-=size;}
                if (yMars==size) {yMars-=size;}
                mars.setMars(true);
                mars.findDisplayString();
                gameSpace[xMars][yMars] = mars;

                if (xVenus<0) {xVenus+=size;}
                if (yVenus<0) {yVenus+=size;}
                if (xVenus==size) {xVenus-=size;}
                if (yVenus==size) {yVenus-=size;}
                venus.setVenus(true);
                venus.findDisplayString();
                gameSpace[xVenus][yVenus] = venus;

                if (xUranus<0) {xUranus+=size;}
                if (yUranus<0) {yUranus+=size;}
                if (xUranus==size) {xUranus-=size;}
                if (yUranus==size) {yUranus-=size;}
                uranus.setUranus(true);
                uranus.findDisplayString();
                gameSpace[xUranus][yUranus] = uranus;

                if (xJupiter<0) {xJupiter+=size;}
                if (yJupiter<0) {yJupiter+=size;}
                if (xJupiter==size) {xJupiter-=size;}
                if (yJupiter==size) {yJupiter-=size;}
                jupiter.setJupiter(true);
                jupiter.findDisplayString();
                gameSpace[xJupiter][yJupiter] = jupiter;

                artemis.setArtemis(true);
                artemis.findDisplayString();
                gameSpace[xArtemis][yArtemis] = artemis;

            } while (distanceToEarth > 1);

            System.out.println(
                    "              _-o#&&*''''?d:>b\\_\n" +
                    "          _o/\"`''  '',, dMF9MMMMMHo_\n" +
                    "       .o&#'        `\"MbHMMMMMMMMMMMHo.\n" +
                    "     .o\"\" '         vodM*$&&HMMMMMMMMMM?.\n" +
                    "    ,'              $M&ood,~'`(&##MMMMMMH\\\n" +
                    "   /               ,MMMMMMM#b?#bobMMMMHMMML\n" +
                    "  &              ?MMMMMMMMMMMMMMMMM7MMM$R*Hk\n" +
                    " ?$.            :MMMMMMMMMMMMMMMMMMM/HMMM|`*L\n" +
                    "|               |MMMMMMMMMMMMMMMMMMMMbMH'   T,\n" +
                    "$H#:            `*MMMMMMMMMMMMMMMMMMMMb#}'  `?\n" +
                    "]MMH#             \"\"*\"\"\"\"*#MMMMMMMMMMMMM'    -\n" +
                    "MMMMMb_                   |MMMMMMMMMMMP'     :\n" +
                    "HMMMMMMMHo                 `MMMMMMMMMT       .\n" +
                    "?MMMMMMMMP                  9MMMMMMMM}       -\n" +
                    "-?MMMMMMM                  |MMMMMMMMM?,d-    '\n" +
                    " :|MMMMMM-                 `MMMMMMMT .M|.   :\n" +
                    "  .9MMM[                    &MMMMM*' `'    .\n" +
                    "   :9MMk                    `MMM#\"        -\n" +
                    "     &M}                     `          .-\n" +
                    "      `&.                             .\n" +
                    "        `~,   .                     ./\n" +
                    "            . _                  .-\n" +
                    "              '`--._,dd###pp=\"\"'");
            System.out.println("Artemis has reached the Earth");


        }

        public void setSpaceSize(int value) {
            spaceSize = value;
        }

    }


