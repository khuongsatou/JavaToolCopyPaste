/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfilescanner;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Yui
 */
public class ReadFileScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("D:\\OUTPUT.txt");
        //Không cần quan tâm đến việc Close Scanner
        try(Scanner sc = new Scanner(file)){
            String str = null;
            //check exist row: true/false
            while(sc.hasNext()){
                str=sc.nextLine();
                System.out.println("Noi Dung dọc tu File: "+str);
            }
            
        }catch(Exception e){
            
        }
        
    }
    
}
