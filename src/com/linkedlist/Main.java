package com.linkedlist;

/**
 * Created by agaped on 10.03.2018.
 */
public class Main {

    public static void main(String[] args){

        MyLinkedList<String> list=new MyLinkedList<>();
        list.add(0,"Ala");
        System.out.println("Size "+list.size());
        System.out.println(list);
        list.add(0,"Ola");
        System.out.println();
        System.out.println(list);

        list.add(1, "Kot");
        list.add(2, "Bruno");
        System.out.println();
        System.out.println("Size "+list.size());
        System.out.println(list);

        list.set(1,"Pies");
        System.out.println();
        System.out.println("Size "+list.size());
        System.out.println(list);

        list.remove(2);
        System.out.println();
        System.out.println("Size "+list.size());
        System.out.println(list);
    }
}
