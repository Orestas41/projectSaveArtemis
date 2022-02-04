package com.tsi.orestas;

public class Planets extends Objects {

        public void findDisplayString()
        {
                if(isEarth() && !isEmpty() && !isVenus() && !isMars() && !isUranus() && !isJupiter() && !isArtemis()){
                        setDisplayString(" \uD83C\uDF0E  ");
                }
                if(isMars() && !isEmpty() && !isUranus() && !isJupiter() && !isArtemis() && !isEarth() && !isVenus()){
                        setDisplayString(" \uD83D\uDC7D  ");
                }
                if(isVenus() && !isEmpty() && !isUranus() && !isJupiter() && !isArtemis() && !isEarth() && !isMars()){
                        setDisplayString(" \uD83C\uDF11  ");
                }
                if(isUranus() && !isEmpty() && !isJupiter() && !isArtemis() && !isEarth() && !isMars() && !isVenus()){
                        setDisplayString(" \uD83E\uDE90  ");
                }
                if(isJupiter() && !isEmpty() && !isArtemis() && !isEarth() && !isMars() && !isVenus() && !isUranus()){
                        setDisplayString(" \uD83C\uDF15  ");
                }
                if(isArtemis() && !isEmpty() && !isEarth() && !isVenus() && !isMars() && !isUranus() && !isJupiter()){
                        setDisplayString(" \uD83D\uDE80  ");
                }
                if(!isArtemis() && !isEarth() && !isVenus() && !isMars() && !isUranus() && !isJupiter()){
                        setDisplayString("  .  ");
                }
        }
}
