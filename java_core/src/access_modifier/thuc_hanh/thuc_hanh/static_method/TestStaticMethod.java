package access_modifier.thuc_hanh.thuc_hanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(123, " Chien");
        Student s2 = new Student(234, "Hoang");
        Student s3 = new Student(345, "Lam");
        s1.display();
        s2.display();
        s3.display();
    }
}
