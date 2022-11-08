public class Player {
    private String name;
     private  String position;
     private  int age;

    public Player(String n, String p, int a) {
        this.name = n;
        this.position = p;
        this.age = a;
    }

    @Override
    public String toString() {
         String s = "Name :" + name + "Position :" + position+ "Age :" + age;
         return s;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }
}
