package com.tsi.orestas;

import static com.tsi.orestas.Earth.xEarth;
import static com.tsi.orestas.Earth.yEarth;

public class Artemis extends Earth {

        static int artemisCurrentX = x[4];
        static int artemisCurrentY = y[4];

        static int xDistance = xEarth - artemisCurrentX;
        static int yDistance = yEarth - artemisCurrentY;

        static double distanceToEarth = Math.sqrt(((xDistance*xDistance)+(yDistance*yDistance)));

}