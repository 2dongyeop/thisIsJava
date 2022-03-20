package newCode.blog.eCommerceFlatform;

public class Member {
    private String id;
    private String password;
    private String nickname;
    private int balance = 100000;

    Member(String id, String password, String nickname) {
        this.id = id;
        this.password = password;
        this.nickname = nickname;
    }
    void minusBalance(int num) {
        if (this.balance - num < 0) {
            Page.errorMessage();
            Page.common();
        } else if (num < 0) {
            Page.errorMessage();
            Page.common();
        } else {
            this.balance -= num;
        }
    }

    void plusBalance(int num) {
        this.balance += num;
    }

    void setId(String id) {
        this.id = id;
    }

    void setPassword(String password) {
        this.password = password;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    void setBalance(int Balance) {
        this.balance = balance;
    }

    int getBalance() {
        return this.balance;
    }

    String getId() {
        return this.id;
    }

    String getPassword() {
        return this.password;
    }

    String getNickname() {
        return this.nickname;
    }
}