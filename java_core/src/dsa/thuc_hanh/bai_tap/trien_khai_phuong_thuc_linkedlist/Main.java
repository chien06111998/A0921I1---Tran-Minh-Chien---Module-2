package dsa.thuc_hanh.bai_tap.trien_khai_phuong_thuc_linkedlist;

import dsa.thuc_hanh.thuc_hanh.trien_khai_linked_list.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList: ");
        MyLinkedList myList = new MyLinkedList(3);
        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);
        myList.add(3,4);
        myList.show();
        System.out.println("\nAdd first: ");
        myList.addFirst(6);
        myList.show();
        System.out.println("\nAdd last: ");
        myList.addLast(8);
        myList.show();
//        System.out.println("\nRemove: ");
//        myList.remove(2);
//        myList.show();
//        System.out.println("\nRemove: ");
//        myList.remove(3);
//        myList.show();
//        System.out.println("\nSize: ");
//        myList.show();
//        System.out.println("\nClone: ");
//        myList.clone();
//        myList.show();
//        System.out.println("\nContain: ");
//        myList.container(11);
//        System.out.println("\nIndexOf: ");
//        myList.indexOf(2);
        System.out.println("\nGet: ");
        myList.get(2);
        System.out.println("\nGet last: ");
        myList.getLast();
        System.out.println("\nClear: ");
        myList.clear();
        myList.show();
    }
}
