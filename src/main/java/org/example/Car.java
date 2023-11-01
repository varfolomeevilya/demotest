package org.example;

public class Car {
    private String name;
    private  Transmission transmission;
     private Motor motor
    private  Bodywork bodywork
    
    private int power;
    private Wheels wheels

   
    public Car(){
        this.name=" formyla";
        this.power=123;

    }
    public Car(String name , int power ){
        this.name=name;
        this.power=power;
    }
    public int getPower() {
        return motor.getPower + bodywork.getPower + transmission.getPower + wheels.getPower;
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
