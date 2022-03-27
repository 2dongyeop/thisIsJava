package newCode.major.f_game;


public class Fruits {

    String name; // 과일네임
    int exp; // 경험치
    int energy; // 체력
    int money; // 돈
    int count; // 개수

    Fruits(String name, int count, int exp, int energy, int money) {
        this.name = name;
        this.count = count;
        this.exp = exp;
        this.energy = energy;
        this.money = count * money;
    }

}