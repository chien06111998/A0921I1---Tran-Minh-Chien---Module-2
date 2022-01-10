package access_modifier.thuc_hanh.bai_tap.xay_dung_lop_chi_ghi;

public class Student {
    private String name = "Chien";
    private String classes = "CG2";

    public Student() {
    }

//    public Student(String name, String classes) {
//        this.name = name;
//        this.classes = classes;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    void display() {
        System.out.println("Name: " + name + ", classes: " + classes);
    }
}
