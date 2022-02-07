package dsa.thuc_hanh.bai_tap.trien_khai_phuong_thuc_arraylist;

import com.sun.scenario.effect.impl.prism.PrImage;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    private void ensureCapa() {
        int newSize = size * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        element = new Object[capacity];
    }
    public void add(int index, E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    private void check(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index = " + index + " không hợp lệ");
        }
    }

    public E remove(int index) {
        check(index);
        E e = (E) element[index];
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size-1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public E clone() {
        MyList<E> clone = new MyList<>(element.length);
        for (Object e : element) {
            clone.add(e);
        }
        return (E) clone;
    }

    public boolean add(Object e) {
        size += 1;
        ensureCapa();
        element[size - 1] = e;
        return true;
    }

    public boolean contains (E e) {
        for (Object x : element) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e){
        for (int i = 0; i < size; i++) {
            if (element[i].equals(e))
                return i;
        }
        return -1;
    }

    public E get(int i) {
        if (i >= size || i == 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", size : " +size);
        }
        return (E) element[i];
    }

    public void clear() {
        element = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void show() {
        for (Object o : element) {
            System.out.print(o + " ");
        }
    }
}
