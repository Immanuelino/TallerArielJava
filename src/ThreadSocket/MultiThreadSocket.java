package ThreadSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Vector;

public class MultiThreadSocket {
    public static void main(String[] args) {
        try {
            int port = 1111;
            ServerSocket server = new ServerSocket(port);
            Socket clientes;
            while(true)
            {
                clientes = server.accept();
                ProcessRequest other = new ProcessRequest(clientes);
                Thread t = new Thread(other);
                t.start();
            }
        } catch (IOException ex) {
            
        }
        
        
    }
}
