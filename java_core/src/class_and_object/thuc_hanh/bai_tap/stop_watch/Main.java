package class_and_object.thuc_hanh.bai_tap.stop_watch;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] num = new int[100000000];
        for (int i = 0; i < num.length; i++){
            num[i] = (int) (Math.random() * 10000000);
        }
        StopWatch st = new StopWatch();
        Arrays.sort(num);
        st.end();
        System.out.println("Milisecond: " + st.getElapsedTime());
    }
}
