package abstractclass_and_interface.thuc_hanh.thuc_hanh.interface_comparable_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Comparator;

public class CircleComparable implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius()  < o2.getRadius()) return -1;
        else return 0;
    }
}
