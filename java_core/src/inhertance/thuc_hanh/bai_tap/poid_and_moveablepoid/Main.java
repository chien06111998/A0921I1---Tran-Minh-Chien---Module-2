package inhertance.thuc_hanh.bai_tap.poid_and_moveablepoid;

public class Main {
    public static void main(String[] args) {
        Poid poid = new Poid(3.5f, 4.2f);
        System.out.println(poid);
        System.out.println("--------------------------");
        MoveablePoid moveablePoid = new MoveablePoid(2.5f, 3.0f);
        System.out.println(moveablePoid);
        moveablePoid.move();
        System.out.println(moveablePoid);
    }
}
