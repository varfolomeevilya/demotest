package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1= new Car();
        car.setName("Niva");
        car1.setName("Fiat");
        Motor motor=new Motor();
        motor.setName("v250");
        motor.setPower(2400);
        Transmission transmission = new Transmission();
        transmission.setName("BAR40078");
        transmission.setWear_and_tear(1);
        Wheels wheels = new Wheels();
        wheels.setName("zero");
        wheels.setFriction_force(900);
        wheels.setSize(330 - 450);
        car.setPower(2500);
        car1.setPower(1900);
        car.setYearofmanufact("2019");
        car1.setYearofmanufact("2025");
      System.out.prilntln( car.getName);
        System.out.println(car1.getName);
        System.out.println(transmission.getName);
        System.out.println(transmission. getWear_and_tear);
        System.out.println(wheels.getName);
        System.out.println(whells.getFraction_force);
            System.out.println(wheels.getSize);
            System.out.println(car.getPower);
        System.out.println(car1.getPower);
        System.out.println(car.getYearofmanufact);
        System.out.println(car1.getYearofmanufact)
    }
}
