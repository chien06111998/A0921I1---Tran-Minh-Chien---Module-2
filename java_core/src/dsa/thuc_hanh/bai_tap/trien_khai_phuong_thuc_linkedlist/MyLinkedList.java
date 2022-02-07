package dsa.thuc_hanh.bai_tap.trien_khai_phuong_thuc_linkedlist;

import dsa.thuc_hanh.thuc_hanh.trien_khai_linked_list.LinkedList;

import javax.xml.soap.Node;

public class MyLinkedList <E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            addFirst(element);
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        for (int i = 0; i < index -1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }
        numNodes--;
        return null;
    }

    public boolean remove (Object e) {
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        if (temp.next == e) {
            temp.next = temp.next.next;
        }
        numNodes--;
        return true;
    }

    public int size() {
        Node temp = head;
        int num = 0;
        while (temp.next != null) {
            temp = temp.next;
            num++;
        }
        return num;
    }

    public E clone() {
        MyLinkedList clone = new MyLinkedList(size());
        Node temp = head;
        Node copy = head;
        while (temp.next != null) {
            temp.data = copy.data;
            temp = temp.next;
            copy = copy.next;
        }
        return (E) copy;
    }

    public boolean container(E e) {
        Node temp = head;
        boolean check = false;
        for (int i = 0; i <= numNodes; i++){
            if ((temp.data).equals(e)) {
                check = true;
                break;
            } else {
                check =  false;
            }
        }
        return check;
    }

    public int indexOf(E e) {
        Node temp = head;
        int i = 0;
        for (int j = 0; j < numNodes; j++) {
            if ((temp.data).equals(3)) {
                i = j;
                break;
            }
            else {
                temp = temp.next;
            }
        }
        return i;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
        return (E) temp.data;
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println(temp.data);
        }
        return (E) temp.data;
    }

    public void clear() {
        Node temp = head;
        while (temp.next != null) {
            temp.data = null;
            temp = temp.next;
            temp.data = null;
        }
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
    }
}
