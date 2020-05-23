package academy.learnprogramming;

class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;
    private int velocity;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.engine = true;
        this.wheels = 4;
        this.velocity = 0;
    }

    public void startEngine() {
        System.out.println("Engine has been started");
    }

    public int accelerate(int speed) {
        if (speed < 0) {
            return this.velocity;
        } else {
            this.velocity += speed;
        }
        System.out.println("The car's velocity was added by " +
                speed + " and now become " + this.velocity);
        return this.velocity;
    }

    public int brake (int speed) {
        if (speed < 0) {
            return this.velocity;
        } else {
            this.velocity -= speed;
        }
        System.out.println("The car's velocity was reduced by " +
                speed + " and now become " + this.velocity);
        return this.velocity;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheels() {
        return wheels;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}

class Fortuner extends Car{
    public Fortuner(String name, int cylinder) {
        super("Fortuner", 6);
    }

    public int accelerate(int speed) {

    }

    public int brake(int speed) {
        
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
