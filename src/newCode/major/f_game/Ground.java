package newCode.major.f_game;


public class Ground {
    Fruits[] fruits;

    Ground(Fruits[] fruits) {
        this.fruits = fruits;
    }

    //과일 랜덤
    Fruits fruitsDrop() {
        return fruits[(int) (Math.random() * fruits.length)];
    }


}
