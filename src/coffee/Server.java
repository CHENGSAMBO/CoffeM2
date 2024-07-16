//                      Server
//package coffee;
//
//import java.net.*;
//import java.io.*;
//
//public class Server {
//
//    public static void main(String args[]) throws IOException {
//        ServerSocket ss = new ServerSocket(4999);
//        Socket s = ss.accept();
//
//        System.out.println("Client Conneccted");
//
//        InputStreamReader in = new InputStreamReader(s.getInputStream());
//        BufferedReader bf = new BufferedReader(in);
//        String str = bf.readLine();
//        System.out.println("Client" + str);
//    }
//}
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            serverSocket = new ServerSocket(12345); // Port number
            System.out.println("Server is listening on port 12345");
            clientSocket = serverSocket.accept(); // Accept client connection
            System.out.println("Client connected");

            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received from client: " + inputLine);
                out.println("Echo: " + inputLine); // Echo the received message back to the client
            }
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } finally {
            try {
                if (out != null) out.close();
                if (in != null) in.close();
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                System.err.println("IOException on closing: " + e.getMessage());
            }
        }
    }
}
