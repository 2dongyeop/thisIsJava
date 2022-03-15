package thisisjava.chapter15;

import java.util.*;
public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("jdbc");
        set.add("servlet/jsp");
        set.add("java"); //java는 한번만 저장된다.
        set.add("ibatis");

        int size = set.size();
        System.out.println("총 객체수: " + size);

        Iterator<String> iterator = set.iterator();  //반복자 얻기
        while(iterator.hasNext()) {                  //객체 수만큼 루핑
            String element = iterator.next();        //한 개의 객체를 가져옴
            System.out.println("\t" + element);
        }

        set.remove("jdbc");                       //한 개의 객체 삭제
        set.remove("ibatis");                     //한 개의 객체 삭제
        System.out.println("총 객체수: " + set.size());

        iterator = set.iterator();
        while(iterator.hasNext()) {                  //객체 수만큼 루핑
            String element = iterator.next();        //한 개의 객체를 가져옴
            System.out.println("\t" + element);
        }

        set.clear();                                 //모든 객체를 제거하고 비움
        if (set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }
}
