package inhertance.thuc_hanh.bai_tap.poid2d_and_poid3d;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        Poid2D poid2D = new Poid2D(2.5f, 4f);
        System.out.println(poid2D);
        System.out.println("------------------");
        Poid3D poid3D = new Poid3D(5.5f);
        System.out.println(poid3D);
    }
}
