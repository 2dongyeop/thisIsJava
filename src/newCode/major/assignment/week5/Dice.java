package src.newCode.major.assignment.week5;

public class Dice {
    public static void main(String[] args) {
        int hCount1 = 0;
        int hCount2 = 0;
        int hCount3 = 0;
        int hCount4 = 0;
        int hCount5 = 0;
        int hCount6 = 0;

        for (int i = 0; i < 100; i++){
            double res = (Math.random() * 6 + 1);
            switch ((int) res) {
                case 1:
                    hCount1++;
                    break;
                case 2:
                    hCount2++;
                    break;
                case 3:
                    hCount3++;
                    break;
                case 4:
                    hCount4++;
                    break;
                case 5:
                    hCount5++;
                    break;
                case 6:
                    hCount6++;
                    break;
            }
        }
        System.out.println("1이 나온 횟수 : " + hCount1);
        System.out.println("2이 나온 횟수 : " + hCount2);
        System.out.println("3이 나온 횟수 : " + hCount3);
        System.out.println("4이 나온 횟수 : " + hCount4);
        System.out.println("5이 나온 횟수 : " + hCount5);
        System.out.println("6이 나온 횟수 : " + hCount6);
    }
}
