package finalfinal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 *
 * @author administrador1
 */
public class Cliente {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1111;
        StringBuffer mensaje = new StringBuffer();        
        try {
            InetAddress add = InetAddress.getByName(host);
            Socket cliente = new Socket(add, port);
            
            BufferedInputStream bis = new BufferedInputStream(cliente.getInputStream());
            InputStreamReader isr = new InputStreamReader(bis);
            
            BufferedOutputStream bos = new BufferedOutputStream(cliente.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter(bos);
        
            osw.write("soy un cliente"+((char)13));
            osw.flush();
            
            int c;
            while((c = isr.read()) != 13)
            {
                mensaje.append((char)c);
            }            
            System.out.println(mensaje);
            cliente.close();
        } catch (UnknownHostException ex) {
            
        } catch (IOException ex) {
            
        }
        
         
    }
    
    
    
    
    
}
