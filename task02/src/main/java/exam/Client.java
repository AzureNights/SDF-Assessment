import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client{
    
    public static void main(String[] args) throws IOException {
        
        try{
        Socket s = new Socket("68.183.239.26", 80);
        //connect to the server
        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);

        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);

        //Console cons = System.Console();
        //String input = cons.readLine("")
        //oos.readUTF(input)

        String requestfromServer = ois.readUTF();
        //if(requestfromServer.contains("1234abcd")){
            //System.out.println 
        //}

        Console reqID = System.console();
        //String answer = cons.readLine("...")
        String requestID = reqID.readLine("Request ID: ");

        Console nam = System.console();
        String name = nam.readLine("Name (as in NRIC): ");

        Console mail = System.console();
        String email = mail.readLine("Email: ");
        //float avgnum = cons.read

        Scanner num = new Scanner(System.in);
        //float avgnum = average 



        oos.writeUTF(requestID);
        oos.writeUTF(name);
        oos.writeUTF(email);
        
        

       /* String response = ois.readUTF();
        if(response.readBoolean() == true){
            System.out.println("SUCCESS");

            
        }
        */

        
        
        if (ois.readBoolean() == true){
            System.out.println("SUCCESS");

            is.close();
            os.close();

            s.close();

        } else{

            String response = ois.readUTF();
            System.out.println("FAILED" + response);

            is.close();
            os.close();

            s.close();


        }

        

        } catch (UnknownHostException uhe){
            uhe.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }


    }
}