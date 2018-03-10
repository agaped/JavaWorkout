package com.linkedlist;

/**
 * Created by agaped on 10.03.2018.
 */
public class Main {

    public static void main(String[] args){

        MyLinkedList<String> list=new MyLinkedList<>();
        list.add(0,"Ala");
        System.out.println("Size "+list.size());
        System.out.println("0 "+list.get(0));
        list.add(0,"Ola");
        System.out.println();
        System.out.println("0 "+list.get(0));
        System.out.println("1 "+list.get(1));

        list.add(1, "Kot");
        list.add(2, "Bruno");
        System.out.println();
        System.out.println("Size "+list.size());
        System.out.println("0 "+list.get(0));
        System.out.println("1 "+list.get(1));
        System.out.println("2 "+list.get(2));
        System.out.println("3 "+list.get(3));

        list.set(1,"Pies");
        System.out.println();
        System.out.println("Size "+list.size());
        System.out.println("0 "+list.get(0));
        System.out.println("1 "+list.get(1));
        System.out.println("2 "+list.get(2));
        System.out.println("3 "+list.get(3));

        list.remove(2);
        System.out.println();
        System.out.println("Size "+list.size());
        System.out.println("0 "+list.get(0));
        System.out.println("1 "+list.get(1));
        System.out.println("2 "+list.get(2));
    }
}
