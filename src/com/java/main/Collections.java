package com.java.main;

import java.util.ArrayList;
import java.util.HashMap;

// JAVA의 대표적인 collection에는
// List(Stack, Vector, ArrayList, LinkedList)
// Map(HashTable, HashMap, Sortedmap, TreeMap)이 있다.
// Set(HashSet, SortedSet, TreeSet) 이 있다.
// https://gangnam-americano.tistory.com/41 정리된 내용참조
public class Collections {
    public static void main(String[] args) {
        //List는 인터페이스를 구현한 클래스로 인덱스를 이용해 데이터를 관리한다. (Vector, ArrayList, LinkedList)가 있다.
        ArrayList<String> li = new ArrayList();
        li.add("hello");
        li.add("hi");
        li.set(0, "bye"); // 첫 번째 위치에 있는 데이터를 hello에서 bye로 변경(데이터가 없을경우 add와 같음)
        System.out.println("2번째 데이터 추출" + li.get(1));
        li.remove(1); //2번째 위치에 있는 데이터 삭제
//        li.clear(); // 리스트 안의 데이터를 전체삭제
        boolean isEmpty = li.isEmpty(); // 데이터가 있는지 없는지 확인

        //Map 자료형은 key와 value를 이용하여 데이터를 관리한다. (key값은 항상 유일한 값이여야 한다 중복X)
        HashMap<String, String> mp = new HashMap<>();
        mp.put("첫번쨰", "ㅎㅇ");
        mp.put("두번쨰", "ㅎㅇ2");
        mp.put("세번쨰", "ㅎㅇ3");
        mp.remove("세번쨰"); //key를 이용해 세번째라는 키를 가진 데이터삭제
        boolean isValue = mp.containsKey("첫번쨰"); // 특정 키가 존재하는지 참 또는 거짓리턴
        boolean isValue2 =  mp.containsValue("ㅎㅇ"); // 특정 값이 존재하는지 참 또는 거짓리턴
        mp.clear(); //map의 모든데이터 삭제
    }
}
