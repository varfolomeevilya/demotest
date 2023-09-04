package org.example;

public class Transmission {
    private int wear_and_tear;
    private String name;
    public Transmission(){
        this.name="BAR007";
        this.wear_and_tear= 1;
    }
    public Transmission(String name, int wear_and_tear){
        this.name=name;
        this.wear_and_tear=wear_and_tear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWear_and_tear() {
        return wear_and_tear;
    }

    public void setWear_and_tear(int wear_and_tear) {
        this.wear_and_tear = wear_and_tear;
    }



}
