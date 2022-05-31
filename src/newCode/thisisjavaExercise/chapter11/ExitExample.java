package src.newCode.thisisjavaExercise.chapter11;

public class ExitExample {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkExit(int status) {
                if (status != 5) {
                    throw new SecurityException();
                }
            }
        });

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                //JVM 종료 요청
                System.exit(i);
            } catch (SecurityException e) {}
        }
    }
}
