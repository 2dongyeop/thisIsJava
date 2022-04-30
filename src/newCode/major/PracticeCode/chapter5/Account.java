package src.newCode.major.PracticeCode.chapter5;

public class Account {
    private String owner;
    private long balance;

    public Account() {}
    public Account(String owner) {
        this.owner = owner;
    }
    public Account(long balance) {
        this.balance = balance;
    }
    public Account(String owner, long balance) {
        this(owner);
        this.balance = balance;
    }
    public void setOwner(String owner) {this.owner = owner;}
    public void setBalance(long balance) {this.balance = balance;}
    public String getOwner() {return this.owner;}
    public long getBalance() {return this.balance;}

    public static void main(String[] args) {
        Account acc1 = new Account("최여진");
        Account acc2 = new Account(10000000);
        acc2.owner = "홍혜빈";
    }
}
