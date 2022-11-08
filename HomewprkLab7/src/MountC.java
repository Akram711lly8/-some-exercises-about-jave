public class MountC  extends Chair{
    public int seatHeight;
    public MountC(int gear , int speed , int sertHeight){

        super(gear ,speed);
        seatHeight =sertHeight;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public String toString(){
        return (+ gear + "\n" + speed);
    }
}
