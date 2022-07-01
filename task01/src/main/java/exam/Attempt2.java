package exam;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Attempt2 {

    public static void main(String[] args) {
        
        List<String> datafromcsv = new LinkedList<>();
        File csv = new File(args[0]);
        Scanner scn = new Scanner(csv);

        int lineNumber = 1;
        while(scn.hasNextLine()){
            String line = scn.nextLine();
            datafromcsv.add(line);  

            
            
        }




    }


    
}
