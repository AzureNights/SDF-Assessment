package exam

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mail{

  public static void main(String[] args) {
      
    try{
        File obj = new File("filename.csv");
        Scanner read = new Scanner (obj);
        scanner.useDelimiter(",");

        while (read.hasNextLine()){
            String data = read.nextLine();
            System.out.println(data);
        }
        read.close();
        //close the scanner 

    } catch (FileNotFoundException e) {
        System.out.println("File not found");
        e.printStackTrace();
    }

    List<obj> what = new ArrayList<>();

    
    
  }  


}