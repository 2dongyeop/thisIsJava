package newCode.major.assignment.week7;

public class Account {
    private String owner;
    private long balance;

    //getter
    public String getOwner() {
        return owner;
    }
    public long getBalance() {
        return balance;
    }

    //setter
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    //모든 필드를 사용하는 생성자 구현
    public Account(String owner, long balance) {
        this.setOwner(owner);
        this.setBalance(balance);
    }

    //7번
    public long deposit(long amount) {
        this.balance += amount;
        return getBalance();
    }
    public long withdraw(long amount) {
        if (amount > this.balance) {
            System.out.println("인출 상한 금액은 잔액보다 클 수 없습니다.");
        } else {
            this.balance -= amount;
        }
        return getBalance();
    }

    public static void main(String[] args) {
        Account account = new Account("leedongyeop", 50000);
        account.deposit(10000);
        account.withdraw(5000);

        System.out.println("잔금 : " + account.getBalance());
    }
}
