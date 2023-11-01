package org.example;

public class Car {
    private String name;
    private  Transmission transmission;
     private Motor motor
    private  Bodywork bodywork
    
    private int power;
    private Wheels wheels

    public int getPower() {
        return power;
    } 
    public Car(){
        this.name=" formyla";
        this.power=123;

    }
    public Car(String name , int power ){
        this.name=name;
        this.power=power;
    }
   
   
    public void setPower(int power) {
        this.power = power;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
