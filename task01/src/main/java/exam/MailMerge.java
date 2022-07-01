package exam;
    
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MailMerge {

    public static void main(String[] args) {
        
        //args 0 - alr what is entered in command line 
        //so what to do with it next 



        //if (0<args.length){
            //why ??
            //File inFile = new File(args[0]);
            //csv file
            //File template = new File(args[1]);
            //text file - template 

        //}

        try{
            File inFile = new File(args[0]);
            //reading csv file
            Scanner read = new Scanner (inFile);
            read.useDelimiter(",");

            while (read.hasNextLine()){
                String data = read.nextLine();
                System.out.println(data);
                //now need to input into the text file 
            }
            read.close();
            //close the scanner 

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }


        function csvtoArray(str, delimiter = ","){
            
            
        }




    }
    
}


    

