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
        int velocity = this.getVelocity();
        if (speed < 0) {
            System.out.println("The car is moving constantly at " + velocity);
        } else {
            this.velocity += speed;
            System.out.println("The car's velocity was added by " +
                    speed + " and now become " + this.velocity);
        }
        return velocity;
    }

    public int brake (int speed) {
        int velocity = this.getVelocity();
        if (speed < 0) {
            System.out.println("The car speed is moving constantly at " + velocity);
        } else {
            this.velocity -= speed;
            System.out.println("The car's velocity was reduced by " +
                    speed + " and now become " + velocity);
        }
        return velocity;
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
    public Fortuner() {
        super("Fortuner", 6);
    }

    public int accelerate(int speed) {
        int velocity = this.getVelocity();
        if (speed < 0) {
            System.out.println("The car " + getName() + " is moving constantly at " + velocity);
        } else {
            if (speed < 5) {
                velocity += 5;
            } else {
                velocity += (speed - 5);
            }
            System.out.println("The car " + getName() + " velocity was added by " +
                    speed + " and now become " + velocity);
        }
        return velocity;
    }

    public int brake(int speed) {
        int velocity = this.getVelocity();
        if (speed < 0) {
            System.out.println("The car " + getName() + " is moving constantly at " + velocity);
        } else {
            if (speed < 5) {
                velocity -= speed;
            } else {
                velocity -= (speed - 5);
            }
            System.out.println("The car " + getName() + " velocity was reduced by " +
                    speed + " and now become " + velocity);
        }
        return velocity;
    }
}

class Ertiga extends Car {
    public Ertiga() {
        super("Ertiga", 3);
    }

    public int accelerate(int speed) {
        int velocity = this.getVelocity();
        if (speed < 0) {
            System.out.println("The car " + getName() + " is moving constantly at " + velocity);
        } else {
            velocity += speed;
            System.out.println("The car " + getName() + " velocity was added by " +
                    speed + " and now become " + velocity);
        }
        return velocity;
    }

    public int brake(int speed) {
        int velocity = this.getVelocity();
        if (speed < 0) {
            System.out.println("The car " + getName() + " is moving constantly at " + velocity);
        } else {
            velocity -= speed;
            System.out.println("The car " + getName() + " velocity was reduced by " +
                    speed + " and now become " + velocity);
        }
        return velocity;
    }
}

class LandCruise extends Car {
    public LandCruise() {
        super("Land Cruiser", 8);
    }

    public int accelerate(int speed) {
        int velocity = this.getVelocity();
        if (speed < 0) {
            System.out.println("The car " + getName() + " is moving constantly at " + velocity);
        } else {
            if (speed < 10) {
                velocity += speed;
            } else {
                velocity += (speed - 10);
            }
            System.out.println("The car " + getName() + " velocity was added by " +
                    speed + " and now become " + velocity);
        }
        return velocity;
    }

    public int brake(int speed) {
        int velocity = this.getVelocity();
        if (speed < 0) {
            System.out.println("The car " + getName() + " is moving constantly at " + velocity);
        } else {
            if (speed < 10) {
                velocity -= speed;
            } else {
                velocity -= (speed - 10);
            }
            System.out.println("The car " + getName() + " velocity was reduced by " +
                    speed + " and now become " + velocity);
        }
        return velocity;
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<5; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i +
                    " : " + car.getName() + "\n" +
                    car.accelerate(20) + "\n" +
                    car.brake(15));
        }
    }

    public static Car randomCar() {
        int randomNumber =(int) (Math.random() * 3) + 1;
        System.out.println("Car selection = ");
        switch (randomNumber) {
            case 1:
                return new Fortuner();
            case 2:
                return new Ertiga();
            case 3:
                return new LandCruise();
        }
        return null;
    }
}
