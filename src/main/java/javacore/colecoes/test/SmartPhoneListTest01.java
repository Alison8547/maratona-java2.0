package javacore.colecoes.test;

import javacore.colecoes.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("11AB", "Iphone");
        SmartPhone s2 = new SmartPhone("22222", "Pixel");
        SmartPhone s3 = new SmartPhone("33333", "Samsung");

        List<SmartPhone> smartPhoneList = new ArrayList<>(6);
        smartPhoneList.add(s1);
        smartPhoneList.add(s2);
        smartPhoneList.add(0,s3);

        for (SmartPhone list : smartPhoneList){
            System.out.println(list);
        }

        SmartPhone s4 = new SmartPhone("22222", "Pixel");
        System.out.println(smartPhoneList.contains(s4));
        int indexPhone = smartPhoneList.indexOf(s4);
        System.out.println(smartPhoneList.get(indexPhone));


    }
}
