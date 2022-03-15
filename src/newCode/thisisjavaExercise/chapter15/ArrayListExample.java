package thisisjava.chapter15;

import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("jdbc");
        list.add("servlet/jsp");
        list.add(2, "database");
        list.add("ibatis");

        int size = list.size();           //총 객체 수 얻기
        System.out.println("총 객체수: " + size);
        System.out.println();

        String skill = list.get(2);       //2번 인덱스의 객체 얻기
        System.out.println("2: " + skill);
        System.out.println();

        for(int i=0;i<list.size();i++) {  //저장된 총 객체 수만큼 루핑
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        list.remove(2);             //2번 인덱스 객체(database) 삭제
        list.remove(2);             //2번 인덱스 객체(servlet/jsp) 삭제
        list.remove("ibatis");

        for(int i=0;i<list.size();i++) { //저장된 총 객체 수만큼 루핑
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
    }
}
