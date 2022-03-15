package newCode.blog.eCommerceFlatform;


import newCode.blog.eCommerceFlatform.Product.books;
import newCode.blog.eCommerceFlatform.Product.clothes;
import newCode.blog.eCommerceFlatform.Product.devices;
import java.util.Scanner;

import java.util.*;

public class Category {
    private static Scanner scanner;
    public static boolean run;
    static List<Product.books> booksArrayList = new ArrayList<Product.books>();
    static List<Product.devices> devicesArrayList = new ArrayList<Product.devices>();
    static List<Product.clothes> clothesArrayList = new ArrayList<Product.clothes>();
    Product product = new Product();
    static List<Product.clothes> clothesCart = new ArrayList<Product.clothes>();
    static List<Product.devices> devicesCart = new ArrayList<Product.devices>();
    static List<Product.books> booksCart = new ArrayList<Product.books>();


    public Category() {
    }

    public static void goToCategory() {
        run = true;

        do {
            System.out.println("상품 관련 페이지입니다. 원하시는 작업의 번호를 입력하세요.");
            System.out.println("1.상품 조회 | 2.상품 등록 | 3.장바구니 및 구매페이지 이동");
            System.out.print("선택 > ");
            int select = scanner.nextInt();
            if (select == 1) {
                LookUpProduct();
            } else if (select == 2) {
                RegisterProduct();
            } else if (select == 3) {
                additionalWork();
            } else {
                Page.errorMessage();
            }
        } while (run);

    }

    //상품 조회 수정 필요
    public static void LookUpProduct() {    //상품 조회
        System.out.println("조회하려는 카테고리 번호를 입력해주세요.");
        System.out.println("1.의류 | 2.전자기기 | 3.도서");
        System.out.print("입력> ");
        int inputExample = scanner.nextInt();
        if (inputExample == 1) {
            for (int i = 0; i < clothesArrayList.size(); i++) {
                Product.clothes clo = clothesArrayList.get(i);
                System.out.println("상품 이름 : " + clothesArrayList.get(i).getClothesName());
                System.out.println("상품 가격 : " + clothesArrayList.get(i).getClothesPrice());
                System.out.println("상품 소개 : " + clothesArrayList.get(i).getClothesIntroduction());
                System.out.println();
            }
        } else if (inputExample == 2) {
            for (int i = 0; i < devicesArrayList.size(); i++) {
                Product.devices dev = devicesArrayList.get(i);
                System.out.println("상품 이름 : " + dev.getDevicesName());
                System.out.println("상품 가격 : " + dev.getDevicesPrice());
                System.out.println("상품 소개 : " + dev.getDevicesIntroduction());
                System.out.println();
                i++;
            }
        } else if (inputExample == 3) {
            for (int i = 0; i < booksArrayList.size(); i++) { //Product.books books : booksArrayList
                Product.books boo = booksArrayList.get(i);
                System.out.println("상품 이름 : " + boo.getBooksName());
                System.out.println("상품 가격 : " + boo.getBooksPrice());
                System.out.println("상품 소개 : " + boo.getBooksIntroduction());
                System.out.println();
            }
        } else {
            System.out.println("해당 카테고리는 존재하지 않습니다.");
            Page.errorMessage();
        }
    }

    public static void RegisterProduct() {
        System.out.println("등록할 상품의 카테고리 번호를 입력하세요");
        System.out.println("1.의류 | 2.전자기기 | 3.도서");
        System.out.print("선택 > ");
        int inputExample = scanner.nextInt();
        run = true;

        do {
            String inputName;
            String inputIntroduce;
            int inputPrice;
            try {
                if (inputExample == 1) {
                    System.out.println("상품의 이름을 입력하세요");
                    inputName = scanner.next();
                    System.out.println("상품의 가격을 입력하세요");
                    inputPrice = scanner.nextInt();
                    System.out.println("상품의 소개를 입력하세요");
                    inputIntroduce = scanner.next();

                    clothesArrayList.add(new Product.clothes(inputName, inputPrice, inputIntroduce));
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("입력 받고자 하는 자료형이 다릅니다.");
            }
            try {
                if (inputExample == 2) {
                    System.out.println("상품의 이름을 입력하세요");
                    inputName = scanner.next();
                    System.out.println("상품의 가격을 입력하세요");
                    inputPrice = scanner.nextInt();
                    System.out.println("상품의 소개를 입력하세요");
                    inputIntroduce = scanner.next();

                    devicesArrayList.add(new Product.devices(inputName, inputPrice, inputIntroduce));
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("입력 받고자 하는 자료형이 다릅니다.");
            }
            try {
                if (inputExample == 3) {
                    System.out.println("상품의 이름을 입력하세요");
                    inputName = scanner.next();
                    System.out.println("상품의 가격을 입력하세요");
                    inputPrice = scanner.nextInt();
                    System.out.println("상품의 소개를 입력하세요");
                    inputIntroduce = scanner.next();

                    booksArrayList.add(new Product.books(inputName, inputPrice, inputIntroduce));
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("입력 받고자 하는 자료형이 다릅니다.");
            }
        } while (run);

    }

    //장바구니 담기 선택
    public static void RegisterShoppingCart() {
        System.out.println("조회한 상품 중 장바구니에 추가하실 상품의 번호를 입력하세요.");
        System.out.println("1.의류 | 2.전자기기 | 3.도서");
        System.out.print("입력> ");
        int cartExample = scanner.nextInt();

        System.out.println("장바구니에 추가 할 품목의 번호를 입력하세요.");
        System.out.println("입력> ");
        int inPut = (scanner.nextInt() - 1);

        if (cartExample == 1) {
            Product.clothes clo = clothesArrayList.get(inPut);
            clothesCart.add(clo);
            System.out.println("장바구니에 추가되었습니다.");
        } else if (cartExample == 2) {
            Product.devices dev = devicesArrayList.get(inPut);
            devicesCart.add(dev);
            System.out.println("장바구니에 추가되었습니다.");
        } else if (cartExample == 3) {
            Product.books boo = booksArrayList.get(inPut);
            booksCart.add(boo);
            System.out.println("장바구니에 추가되었습니다.");
        } else {
            Page.errorMessage();
        }

    }

    //상품 구매 선택
    public static void BuyingProduct() {

    }

    public static void additionalWork() {
        run = true;
        do {
            System.out.println("추가로 원하시는 작업이 있으시면 번호를 입력하세요.");
            System.out.println("1.장바구니 담기 | 2.상품 구매 | 3.나가기");
            int addSelect = scanner.nextInt();
            if (addSelect == 1) {             //장바구니 담기 선택
                RegisterShoppingCart();
            } else if (addSelect == 2) {      //상품 구매 선택
                BuyingProduct();
            } else {                          //나가기 선택
                if (addSelect != 3) {
                    Page.errorMessage();
                    return;
                }
                run = false;
            }
        } while (run);
    }

    static {
        scanner = new Scanner(System.in);
    }
}