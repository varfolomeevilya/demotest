package org.example;

public class Motor {

    private String name;
    private int power;
    public Motor(String name, int power){
        this.name=name;
        this.power=power;
    }
    public Motor(){
        this.name="V16";
        this.power=1300;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
