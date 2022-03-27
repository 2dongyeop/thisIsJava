package newCode.major.f_game;

public class User {

    String name; // 닉네임
    int maxEnergy; // 최대체력
    int exp; // 경험치 >>최대가 되면 레벨 증가
    int energy; // 체력
    int money; // 돈
    int level; // 레벨
    int count;//개수
    Fruits[] fruits; // 보유 과일

    int grapeCount = 0;
    int appleCount = 0;
    int bananaCount = 0;
    int strawberryCount = 0;

    User(String name) {
        this.name = name;
        maxEnergy = 1000;
        exp = 0;
        level = 1;
        energy = maxEnergy;
        money = 100000;
        fruits = new Fruits[10];
    }

    // 사용자 정보
    void userStatus() {
        System.out.println("================================");
        System.out.println("-------------- 상태 --------------");
        System.out.println("이름 : " + name);
        System.out.println("레벨 : " + level + "(" + exp + ")" + "/100");
        System.out.println("체력 : " + energy);
        System.out.println("캐시 : " + money);
        System.out.println("------------- 과일창고-------------");

        System.out.println("포도 : " + grapeCount);
        System.out.println("사과 : " + appleCount);
        System.out.println("딸기 : " + strawberryCount);
        System.out.println("바나나 : " + bananaCount);

        System.out.println("================================");
    }

    //과일 얻기
    void getFruits(Fruits fruit) {
        count = 0;
        System.out.println(name + "님이 " + fruit.name + "을(를) " + fruit.count + "개를 수확하였습니다.");
        System.out.println(fruit.exp + "의 경험치를 획득하였습니다.");
        System.out.println(fruit.money + "의 돈을 사용했습니다.");
        System.out.println(fruit.energy + "의 체력을 잃었습니다.");

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == null) {
                if (fruit.name == "포도") {
                    grapeCount += fruit.count;
                } else if (fruit.name == "사과") {
                    appleCount += fruit.count;
                } else if (fruit.name == "딸기") {
                    strawberryCount += fruit.count;
                } else if (fruit.name == "바나나") {
                    bananaCount += fruit.count;
                }
                break;
            }
        }
        exp += fruit.exp;
        while (level * 100 <= this.exp) { //100이 차면 레벨업을 여러번 할 수 있도록 while문 사용
            levUp();
            this.exp -= 100;
        }
        count += fruit.count;
        money -= fruit.money;
        energy -= fruit.energy;
    }

    //소비자에게 에너지, 돈 얻기 >> 과일 한개 에너지와 돈 2배된 값 얻기
    void sellFruits(Fruits fruit) {
        if (count > 0) {
            System.out.println(fruit.name + "를 한 개 판매하였습니다.");
            System.out.println(fruit.energy * 2 + "의 체력을 얻었습니다.");
            energy += fruit.energy * 2;
            System.out.println(fruit.money / fruit.count * 2 + "의 돈을 얻었습니다.");
            money += fruit.money / fruit.count * 2;

            for (int i = 0; i < fruits.length; i++) {
                if (fruits[i] == null) {
                    if (fruit.name == "포도") {
                        grapeCount--;
                    } else if (fruit.name == "사과") {
                        appleCount--;
                    } else if (fruit.name == "딸기") {
                        strawberryCount--;
                    } else if (fruit.name == "바나나") {
                        bananaCount--;
                    }
                    break;
                }
            }
        }
        if (count <= 0) {
            System.out.println(fruit.name + "가 모두 소진되었습니다.");
        }
    }

    //물을 줄 경우 에너지 얻기 >> 과일 한개 에너지의 2배된 에너지 얻기
    void getEnergy(Fruits fruit) {
        System.out.println(fruit.energy / 2 + "의 체력을 얻었습니다.");
        energy += fruit.energy / 2;
    }

    //레벨업 >> 레벨업하면 에너지가 가득채워지며 캐시를 얻는다.
    void levUp() {
        level++;
        energy = maxEnergy;
        money += 5000;

        System.out.println("Level Up!");
        System.out.println("에너지가 가득채워졌습니다.");
        System.out.println("5,000캐시를 얻었습니다.");
    }

}