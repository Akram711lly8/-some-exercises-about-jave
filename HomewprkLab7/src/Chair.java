public class Chair {
    protected  int gear;
    protected int speed;

    public Chair(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    public void applybrake(int decrement){
        speed -= decrement;
    }
    public  void  speedUp(int increment){
        speed += increment;
    }
    public String toString(){
        return (+ gear + "\n" + speed);
    }
}
