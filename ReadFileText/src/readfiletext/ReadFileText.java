/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfiletext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Yui
 */
public class ReadFileText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream("d:/test.txt");
            DataInputStream dis = new DataInputStream(fis);
            //Bước 2: Đọc dữ liệu
            //int n = dis.readInt();
            //double m = dis.readDouble();
            String n = dis.readLine();
            //Bước 3: Đóng luồng
            fis.close();
            dis.close();
            //Hiển thị nội dung đọc từ file
            System.out.println("Số nguyên: " + n);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
