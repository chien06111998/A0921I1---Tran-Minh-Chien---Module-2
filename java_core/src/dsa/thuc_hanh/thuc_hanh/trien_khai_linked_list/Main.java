package dsa.thuc_hanh.thuc_hanh.trien_khai_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.addFirst(7);
        linkedList.addFirst(8);
        linkedList.addFirst(1);
        linkedList.addFirst(3);
        linkedList.show();
        System.out.println("\n--------------");
        linkedList.add(2, 4);
        linkedList.add(4, 5);
        linkedList.show();
    }
}
