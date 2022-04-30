package src.newCode.major.PracticeCode.chapter4;

public class Command {
    public static void main(String[] args) {
        int num = args.length;
        for (int i = 0; i < num; i++) {
            System.out.println(args[i]);
        }
        for (String a : args){
            System.out.println(a);
        }
    }
}
