package newCode.blog.eCommerceFlatform;

public class Member {
    private String id;
    private String password;
    private String nickname;
    private int balance = 100000;

    Member() {
    }

    Member(String id, String password, String nickname) {
        this.id = id;
        this.password = password;
        this.nickname = nickname;
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

    void minusBalance(int num) {
        if (this.balance - num < 0) {
            Page.errorMessage();
        } else {
            this.balance -= num;
        }

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