package dsa.thuc_hanh.bai_tap.trien_khai_phuong_thuc_arraylist;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        System.out.println("Add:");
        myList.add("Chien");
        myList.add("Dep");
        myList.add("Trai");
        myList.add("Nhat");
        myList.add("Nha");
        myList.add(5, " Phai");
        myList.add("Khong?");
        myList.show();
        System.out.println("\nRemove:");
        myList.remove(2);
        myList.show();
        System.out.println("\nClone:");
        MyList<String> copyMyList = new MyList<>();
        copyMyList.clone();
        copyMyList.show();
        System.out.println("\nClear:");
        myList.clear();
        System.out.println("\nAdd: ");
        MyList<Integer> intMyList = new MyList<>();
        intMyList.add(1);
        intMyList.add(2);
        intMyList.add(3);
        intMyList.add(4);
        intMyList.show();
        System.out.println("\nSize: ");
        intMyList.size();
        System.out.println("\nContains: ");
        System.out.println(intMyList.contains(5));
        System.out.println("\nIndexOf:");
        System.out.println(intMyList.indexOf(4));
    }
}
