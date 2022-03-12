package newCode.blog.eCommerceFlatform;


import newCode.blog.eCommerceFlatform.Product.books;
import newCode.blog.eCommerceFlatform.Product.clothes;
import newCode.blog.eCommerceFlatform.Product.devices;
import java.util.Scanner;

public class Category {
    private static Scanner scanner;
    public static boolean run;

    public Category() {
    }

    public static void goToCategory() {
        run = true;

        do {
            System.out.println("상품 관련 페이지입니다. 원하시는 작업의 번호를 입력하세요.");
            System.out.println("1.상품 조회 | 2.상품 등록");
            System.out.print("선택 > ");
            int select = scanner.nextInt();
            if (select == 1) {
                LookUpProduct();
                System.out.println("추가로 원하시는 작업이 있으시면 번호를 입력하세요.");
                System.out.println("1.장바구니 담기 | 2.상품 구매 | 3.나가기");
                int addSelect = scanner.nextInt();
                if (addSelect == 1) {
                    RegisterShoppingCart();
                } else if (addSelect == 2) {
                    BuyingProduct();
                } else {
                    if (addSelect != 3) {
                        Page.errorMessage();
                        break;
                    }

                    run = false;
                }
            } else if (select == 2) {
                RegisterProduct();
            }
        } while(run);

    }

    public static void LookUpProduct() {
        String[] var10000 = new String[]{"의류", "전자기기", "도서"};
        System.out.println("조회하려는 카테고리 번호를 입력해주세요.");
        System.out.println("1.의류 | 2.전자기기 | 3.도서");
        System.out.print("입력> ");
        int inputExample = scanner.nextInt();
        int j;
        if (inputExample == 1) {
            for(j = 0; j < 10; ++j) {
                System.out.println(clothes.getClothesName());
                if (clothes.getClothesName() == null) {
                    break;
                }
            }
        } else if (inputExample == 2) {
            for(j = 0; j < 10; ++j) {
                System.out.println(devices.getDevicesName());
                if (devices.getDevicesName() == null) {
                    break;
                }
            }
        } else if (inputExample == 3) {
            for(j = 0; j < 10; ++j) {
                System.out.println(books.getBooksName());
                if (books.getBooksName() == null) {
                    break;
                }
            }
        }

        System.out.println("해당 카테고리는 존재하지 않습니다.");
        Page.errorMessage();
    }

    public static void RegisterProduct() {
        clothes[] clothes = new clothes[10];
        books[] books = new books[10];
        devices[] devices = new devices[10];
        String[] var10000 = new String[]{"의류", "전자기기", "도서"};
        System.out.println("등록할 상품의 카테고리 번호를 입력하세요");
        System.out.println("1.의류 | 2.전자기기 | 3.도서");
        System.out.print("선택 > ");
        int inputExample = scanner.nextInt();
        run = true;
        byte count = 0;

        do {
            String inputName;
            String inputIntroduce;
            int inputPrice;
            int var9;
            if (inputExample == 1) {
                if (count == 10) {
                    System.out.println("등록 가능 수량이 가득 찼습니다.");
                    Page.errorMessage();
                }

                System.out.println("상품의 이름을 입력하세요");
                inputName = scanner.next();
                Product.clothes.setClothesName(inputName);
                System.out.println("상품의 가격을 입력하세요");
                inputPrice = scanner.nextInt();
                Product.clothes.setClothesPrice(inputPrice);
                System.out.println("상품의 소개를 입력하세요");
                inputIntroduce = scanner.next();
                Product.clothes.setClothesIntroduction(inputIntroduce);
                var9 = count + 1;
                break;
            }

            if (inputExample == 2) {
                if (count == 10) {
                    System.out.println("등록 가능 수량이 가득 찼습니다.");
                    Page.errorMessage();
                }

                System.out.println("상품의 이름을 입력하세요");
                inputName = scanner.next();
                Product.devices.setDevicesName(inputName);
                System.out.println("상품의 가격을 입력하세요");
                inputPrice = scanner.nextInt();
                Product.devices.setDevicesPrice(inputPrice);
                System.out.println("상품의 소개를 입력하세요");
                inputIntroduce = scanner.next();
                Product.devices.setDevicesIntroduction(inputIntroduce);
                var9 = count + 1;
                break;
            }

            if (inputExample == 3) {
                if (count == 10) {
                    System.out.println("등록 가능 수량이 가득 찼습니다.");
                    Page.errorMessage();
                }

                System.out.println("상품의 이름을 입력하세요");
                inputName = scanner.next();
                Product.books.setBooksName(inputName);
                System.out.println("상품의 가격을 입력하세요");
                inputPrice = scanner.nextInt();
                Product.books.setBooksPrice(inputPrice);
                System.out.println("상품의 소개를 입력하세요");
                inputIntroduce = scanner.next();
                Product.books.setBooksIntroduction(inputIntroduce);
                var9 = count + 1;
                break;
            }
        } while(run);

    }

    public static void RegisterShoppingCart() {
        System.out.println("조회한 상품 중 장바구니에 추가하실 상품의 번호를 입력하세요.");
        System.out.print("입력 >");
    }

    public static void BuyingProduct() {
    }

    static {
        scanner = new Scanner(System.in);
    }
}
