package newCode.blog.eCommerceFlatform;

import java.util.Scanner;

public class Page {
    public static boolean run;
    public static int memberNum = 0;
    private static Scanner scanner;
    private static String inputId;
    private static String inputPassword;
    private static String inputNickname;
    private static Member[] member;

    public Page() {
    }

    public static void common() {
        System.out.println("홈으로 돌아갑니다.");
        run = false;
    }

    public static void errorMessage() {
        System.out.println("잘못된 접근입니다. 다시 시도해주세요.");
    }

    public static void main(String[] args) {
        run = true;

        for(int i = 0; i < 10; ++i) {
            member[i] = new Member("", "", "");
        }

        Page.User var3 = new Page.User();

        do {
            System.out.println("미니 e커머스 플랫폼입니다. 원하시는 서비스를 이용하시려면 숫자를 입력해주세요.");
            System.out.println("1.로그인 | 2.회원가입 | 3.로그아웃 | 4.상품 조회 및 등록, 구매");
            System.out.print("선택 > ");
            int select = scanner.nextInt();

            if (select == 1) {
                if (Page.User.loginStatus) {
                    errorMessage();
                } else {
                    goToLogin();
                    Page.User.loginStatus = true;
                }
            } else if (select == 2) {
                if (memberNum > 10) {
                    System.out.println("회원 수용 가능 숫자를 초과");
                    errorMessage();
                } else {
                    goToSignUp();
                }
            } else if (select == 3) {
                if (Page.User.loginStatus) {
                    System.out.println("로그아웃 되었습니다.");
                    Page.User.loginStatus = false;
                } else {
                    System.out.println("비로그인 상태입니다.");
                    errorMessage();
                }
            } else if (select == 4) {
                if (!Page.User.loginStatus) {
                    System.out.println("비로그인으로 접근할 수 없는 기능입니다.");
                    errorMessage();
                } else {
                    Category.goToCategory();
                }
            }
        } while(run);

    }
    //로그인
    private static void goToLogin() {
        System.out.print("아이디를 입력하세요 : ");
        inputId = scanner.next();
        System.out.print("비밀번호를 입력하세요 : ");
        inputPassword = scanner.next();

        int i;
        for(i = 0; i < member.length; ++i) {
            if (inputId.equals(member[i].getId()) && !inputPassword.equals(member[i].getPassword())) {
                System.out.println("비밀번호 불일치");
                errorMessage();
                break;
            }
        }

        for(i = 0; i < member.length; ++i) {
            if (inputId.equals(member[i].getId()) && inputPassword.equals(member[i].getPassword())) {
                Member var10001 = member[i];
                System.out.println(var10001.getNickname() + "님 로그인");
                System.out.println("미니 e커머스 플랫폼에 오신걸 환영합니다.");
                Page.User.loginStatus = true;
                break;
            }
        }

    }

    //회원가입
    private static void goToSignUp() {
        System.out.print("아이디를 입력하세요 : ");
        inputId = scanner.next();

        for(int i = 0; i < memberNum; ++i) {
            if (inputId.equals(member[i].getId())) {
                System.out.printf("동일한 id가 있습니다.");
                errorMessage();
                break;
            }
        }

        member[memberNum].setId(inputId);
        System.out.print("비밀번호를 입력하세요 : ");
        inputPassword = scanner.next();
        member[memberNum].setPassword(inputPassword);
        System.out.print("닉네임을 입력하세요 : ");
        inputNickname = scanner.next();
        member[memberNum].setNickname(inputNickname);
        ++memberNum;
    }

    static {
        scanner = new Scanner(System.in);
        member = new Member[10];
    }
    //로그인 상태 유지를 위한 중첩 클래스
    public static class User {
        public static boolean loginStatus = false;

        public User() {
        }
    }
}