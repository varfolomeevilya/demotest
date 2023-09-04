package org.example;

public class Car {
    private String name;
    private  class Transmission{
        public int getWear_and_tear() {
            return wear_and_tear;
        }

        public void setWear_and_tear(int wear_and_tear) {
            this.wear_and_tear = wear_and_tear;
        }

        private int wear_and_tear;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;
    }
    private class Motor{
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        private int power;
    };
    private  class Bodywork{
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        private int size;
    };
    private  String Yearofrelease;
    private int power;
    private class Wheels{
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        private int size;

        public int getFriction_force() {
            return friction_force;
        }

        public void setFriction_force(int friction_force) {
            this.friction_force = friction_force;
        }

        private int friction_force;
    }


    public int getPower() {
        return power;
    }
    public Car(String name , int power ){
        this.name=name;
        this.power=power;
    }
    public String getYearofmanufact() {

        return Yearofrelease;
    }

    public void setYearofmanufact(String yearofmanufact) {
        this.Yearofrelease=yearofmanufact;
    }
    public Car(){
        this.name=" formyla";
        this.power=123;

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
