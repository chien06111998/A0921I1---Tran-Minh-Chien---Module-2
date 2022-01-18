package io_test_file.thuc_hanh.thuc_hanh.tinh_tong_cac_so_trong_file_test;

import java.io.*;

public class ReadFileExample {
    public void readFileTest(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.out.println("File khong ton tai hoac noi dung co loi");
        }
    }
}
