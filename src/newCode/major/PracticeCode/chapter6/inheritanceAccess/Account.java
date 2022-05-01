package src.newCode.major.PracticeCode.chapter6.inheritanceAccess;

import java.util.Date;

public class Account {
    public String name;
    protected Date open;
    /*default*/ int number;
    private long balance;

    protected Account() {}
    protected Account(String name, int number) {
        this.name = name;
        this.number = number;
        this.open = new Date();
    }
    public long deposit(long amount) {
        return balance += amount;
    }
    public long withdraw(long amount) {
        return balance -= amount;
    }
    public long checkBalance() {
        System.out.println(name + ": 계좌번호 " + number + ", 잔액 " + balance);
        return balance;
    }

}
