package src.newCode.major.PracticeCode.chapter6.inheritanceControl;


import src.newCode.major.PracticeCode.chapter6.inheritanceAccess.Account;
import src.newCode.major.PracticeCode.chapter6.inheritanceAccess.SavingAccount;

public class CheckAccount extends Account {
    long minimum; //최소 잔액 금액

    public CheckAccount(String name, int number, long minimum) {
        super(name, number);
        this.minimum = minimum;
        super.deposit(minimum);
    }

    public static void main(String[] args) {
        SavingAccount myAccount = new SavingAccount("김태희", 234567654, 0.34);
        myAccount.deposit(250000);
        myAccount.withdraw(50000);
        myAccount.checkBalance();

        System.out.println(myAccount.name);
//        System.out.println(myAccount.open);
//        System.out.println(myAccount.number);
//        System.out.println(myAccount.balance); 접근 불가

        CheckAccount cAccount = new CheckAccount("이민정", 876542356, 500000);
        //cAccount.deposit()
    }
}
