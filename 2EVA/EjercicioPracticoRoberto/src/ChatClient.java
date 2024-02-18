import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int PORT = 12345;
    
    private static  String username = "Roberto";

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, PORT);
             BufferedReader serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Introduce tu nombre de usuario: ");
            username = consoleIn.readLine();
            
            System.out.println("Connected to Chat Server");

            Thread receivingThread = new Thread(() -> {
                String message;
                try {
                    while ((message = serverIn.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receivingThread.start();

            String userInput;
            while ((userInput = consoleIn.readLine()) != null) {
                out.println(username+": "+userInput);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

