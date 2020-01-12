/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputstreamreadfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Yui
 */
public class InputStreamReadFile {
    
    public void ghi(Object o, String name){
        try(FileOutputStream fos = new FileOutputStream(new File(name))) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
        } catch (Exception e) {
            System.out.println("Eror");
        }
    }
    
    public void ghiDS(List list, String name){
        try(FileOutputStream fos = new FileOutputStream(new File(name))) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("Eror");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList list = new ArrayList();
        list.add(new SinhVien(21, "Hoang Ba Trung", "Ha Noi", 8.54));
        list.add(new SinhVien(22, "Hoang Ba Trung 1", "Ha Noi", 8.24));
        list.add(new SinhVien(23, "Hoang Ba Trung 2", "Ha Noi", 8.34));
        list.add(new SinhVien(24, "Hoang Ba Trung 3", "Ha Noi", 8.64));
        
        InputStreamReadFile inputFile = new InputStreamReadFile();
        inputFile.ghiDS(list,"D:\\test.txt" );
    }
    
}
