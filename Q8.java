import javax.swing.*;

public class Q8 {
    public static void main(String[] args) {
        double number,squareNum,cubeNum,quarNum;
        String strNumber;
        String result;
        strNumber = JOptionPane.showInputDialog("Enter a number \n ");

        number = Double.parseDouble(strNumber);
        squareNum =Math.pow(number,2);
        cubeNum = Math .pow(number,3);
        quarNum = Math.pow(number,4);
        result ="The square of : "+number +" is "+squareNum + "\r\n The cube of " +number+ "is"+cubeNum+
                "\r\n The 4th power of the " + number + "is" + quarNum ;
        JOptionPane.showInputDialog(null,result);
    }
}
