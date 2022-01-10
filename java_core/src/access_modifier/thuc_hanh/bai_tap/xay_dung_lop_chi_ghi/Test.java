package access_modifier.thuc_hanh.bai_tap.xay_dung_lop_chi_ghi;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
        System.out.println("Information after the change is: ");
        student.setName("Lam");
        student.setClasses("CG4");
        student.display();
    }
}
