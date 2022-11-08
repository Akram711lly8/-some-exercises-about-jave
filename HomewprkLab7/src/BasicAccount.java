public class BasicAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000);
        bankAccount.withdraw(5000);
        bankAccount.withdraw(5000);
        if (bankAccount.getBalance()<=0){
            System.out.println("You donot have any money " );
        }
        System.out.println(+bankAccount.getBalance());

    }
}
