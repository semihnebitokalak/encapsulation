public class Car {
    private int speed = 0;
    private String model;

    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        // Hızın negatif olmaması için bir kontrol ekliyoruz
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }
}
