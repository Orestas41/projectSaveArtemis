package com.tsi.orestas;

public abstract class Objects {


    private boolean isEmpty = false;
    private boolean isArtemis = false;
    private boolean isEarth = false;
    private boolean isMars = false;
    private boolean isVenus = false;
    private boolean isUranus = false;
    private boolean isJupiter = false;
    private String displayString;

    public boolean isEmpty(){
        return isEmpty;
    }

    public void setEmpty(){
        isEmpty = true;
    }

    public boolean isArtemis(){
        return isArtemis;
    }

    public void setArtemis(boolean value){
        isArtemis = value;
    }

    public boolean isEarth(){
        return isEarth;
    }

    public void setEarth(boolean value){
        isEarth = value;
    }

    public boolean isMars(){
        return isMars;
    }

    public void setMars(boolean value){
        isMars = value;
    }

    public boolean isVenus(){
        return isVenus;
    }

    public void setVenus(boolean value){
        isVenus = value;
    }

    public boolean isUranus(){
        return isUranus;
    }

    public void setUranus(boolean value){
        isUranus = value;
    }

    public boolean isJupiter(){
        return isJupiter;
    }

    public void setJupiter(boolean value){
        isJupiter = value;
    }

    public String getDisplayString(){
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

}
