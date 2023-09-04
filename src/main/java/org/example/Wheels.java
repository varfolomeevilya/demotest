package org.example;

public class Wheels {
    private String name;
    private int size;
    private int friction_force;
    public Wheels(String name, int size, int friction_force){
        this.name=name;
        this.size=size;
        this.friction_force=friction_force;
    }
    public Wheels(){
        this.name="zero";
        this.size= 330 - 450;
        this.friction_force=900;
    }
    public int getFriction_force() {
        return friction_force;
    }

    public void setFriction_force(int friction_force) {
        this.friction_force = friction_force;
    }



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
