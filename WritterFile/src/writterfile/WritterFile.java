/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writterfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Yui
 */
public class WritterFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("D:\\OUTPUT.txt");
        try (FileWriter fw = new FileWriter(file, true);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf)) {
            pw.println("Hello, World");
            pw.println("Hello, World 123");

        } catch (Exception e) {
            System.out.println("Error");
        }

//        try (PrintWriter pw = new PrintWriter(file)){
//            pw.println("Hello World");
//            pw.println("WeLL come to tutorial 123");
//            
//        } catch (Exception e) {
//        }
    }

}
