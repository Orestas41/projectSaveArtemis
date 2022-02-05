package com.tsi.orestas;

public class Planets extends Objects {

        public void findDisplayString()
        {
                String planetIcon = " \uD83E\uDE90  "; // - 🪐

                if(isEarth() && !isEmpty() && !isVenus() && !isMars() && !isUranus() && !isJupiter() && !isArtemis()){
                        setDisplayString(planetIcon);
                }
                if(isMars() && !isEmpty() && !isUranus() && !isJupiter() && !isArtemis() && !isEarth() && !isVenus()){
                        setDisplayString(planetIcon);
                }
                if(isVenus() && !isEmpty() && !isUranus() && !isJupiter() && !isArtemis() && !isEarth() && !isMars()){
                        setDisplayString(planetIcon);
                }
                if(isUranus() && !isEmpty() && !isJupiter() && !isArtemis() && !isEarth() && !isMars() && !isVenus()){
                        setDisplayString(planetIcon);
                }
                if(isJupiter() && !isEmpty() && !isArtemis() && !isEarth() && !isMars() && !isVenus() && !isUranus()){
                        setDisplayString(planetIcon);
                }
                if(isArtemis() && !isEmpty() && !isEarth() && !isVenus() && !isMars() && !isUranus() && !isJupiter()){
                        setDisplayString(" \uD83D\uDE80  "); // - 🚀
                }
                if(!isArtemis() && !isEarth() && !isVenus() && !isMars() && !isUranus() && !isJupiter()){
                        setDisplayString("  .  ");
                }
        }
}
