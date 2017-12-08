package finalfinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Vector;

public class MultiThreadSocket {
    public static void main(String[] args) {
        Vector<StringBuffer> v = new Vector<StringBuffer>();
        try {
            int port = 1111;
            ServerSocket server = new ServerSocket(port);
            Socket clientes;
            int i;
            for(i=0; i<10; i++)
            {
                clientes = server.accept();
                ProcessRequest other = new ProcessRequest(clientes, v);
                Thread t = new Thread(other);
                t.start();
            }for (int j = 0; j < 10; j++) {
                System.out.println(v.get(j));
            }
        } catch (IOException ex) {
            
        }
        
        
        
        
        
        
        
    }
}
