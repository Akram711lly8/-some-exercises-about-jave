public class Q2L4 {



    public  static  void main(String[] args) {

        String state ="mississippi";
        state= state.replace("i","ii");
        int numberOfcharacters = state.length();

        System.out.println("The length of Mississippi whith \"ii\" is : " + numberOfcharacters + ", "+state);
        state =state.replace("ss","s");
        int legthOfcharacters=state.length();
        System.out.println ("The length of Mississippi whith \"s\"  and \"ii\" " + numberOfcharacters + ", "+state);








    }
}
