//                      Client
//package coffee;
//import java.io.*;
//import java.net.*;
//public class Client{
//    public static void main(String args[]) throws IOException {
//        Socket s=new Socket("localhost",4999);
//        
//        PrintWriter pr=new PrintWriter(s.getOutputStream());
//        pr.println("Hello");
//        pr.flush();
//
//        InputStreamReader in=new InputStreamReader(s.getInputStream());
//        BufferedReader bf=new BufferedReader(in);
//        String str=bf.readLine();
//        System.out.println("Client" +str);
//    }
//}
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            socket = new Socket("localhost", 12345); // Connect to the server on localhost at port 12345
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            System.out.println("Enter messages to send to the server. Type 'bye' to exit.");
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("Server response: " + in.readLine());
                if ("bye".equals(userInput)) {
                    break;
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } finally {
            try {
                if (out != null) out.close();
                if (in != null) in.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                System.err.println("IOException on closing: " + e.getMessage());
            }
        }
    }
}
