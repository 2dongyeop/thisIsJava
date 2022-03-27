package newCode.major.f_game;

import java.util.Scanner;

public class Farm {
    Scanner scanner = new Scanner(System.in);
    User u;
    Fruits[] fruits;

    {
        System.out.println("빵빵덕 농장에 오신걸 환영합니다..");
        System.out.print("닉네임을 설정해주세요 : ");
        String name = scanner.nextLine();
        u = new User(name);

        fruits = new Fruits[10];
        fruits[0] = new Fruits("포도", 10, 20, 15, 100);
        fruits[1] = new Fruits("사과", 5, 10, 10, 50);
        fruits[2] = new Fruits("딸기", 15, 30, 20, 150);
        fruits[3] = new Fruits("바나나", 20, 50, 25, 200);
    }

    public static void main(String[] args) {
        new Farm().start();
    }

    void start() {
        while (true) {
            System.out.println("---------------------------");
            System.out.print("1.농장  2.가게  3.내 정보  0.게임 종료 : ");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    get();
                    break;
                case 2:
                    store();
                    break;
                case 3:
                    u.userStatus();
                    break;
                case 0:
                    System.out.println("종료되었습니다.");
                    System.exit(0);
            }
        }
    }

    //랜덤으로 과일을 수확하고 물을 주며 경험치를 얻기
    void get() {
        Ground g = new Ground(new Fruits[]{fruits[0], fruits[1], fruits[2], fruits[3]});

        int input = 0;
        dig:
        while (true) {
            System.out.println("---------------------------");
            System.out.print("1.수확하기  2.물주기  : ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    u.getFruits(g.fruitsDrop());
                    break dig;
                case 2:
                    u.getEnergy(g.fruitsDrop()); //물을 줄 경우 체력 얻을 수 있음
                    break;
            }
        }
    }

    void store() {
        System.out.println("손님이 왔습니다.");
        System.out.println("어떤 과일을 구매하시겠습니까? ");

        int input = 0;
        sale:
        while (true) {
            System.out.println("---------------------------------- ");
            System.out.print("1.포도  2.사과  3.딸기  4.바나나  0.가게 나가기>");

            input = scanner.nextInt();

            switch (input) {
                case 1:
                    if (u.grapeCount > 0) {
                        u.sellFruits(fruits[0]);
                        break;
                    } else {
                        System.out.println("수확된 과일이 없어 판매할 수 없습니다.");
                        break;
                    }
                case 2:
                    if (u.appleCount > 0) {
                        u.sellFruits(fruits[1]);
                        break;
                    } else {
                        System.out.println("수확된 과일이 없어 판매할 수 없습니다.");
                        break;
                    }
                case 3:
                    if (u.strawberryCount > 0) {
                        u.sellFruits(fruits[2]);
                        break;
                    } else {
                        System.out.println("수확된 과일이 없어 판매할 수 없습니다.");
                        break;
                    }
                case 4:
                    if (u.bananaCount > 0) {
                        u.sellFruits(fruits[3]);
                        break;
                    } else {
                        System.out.println("수확된 과일이 없어 판매할 수 없습니다.");
                        break;
                    }
                case 0:
                    System.out.println("손님이 나갔습니다.");
                    break sale;
            }

        }
    }
}