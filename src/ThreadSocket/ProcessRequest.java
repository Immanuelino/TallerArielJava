package ThreadSocket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.*;

public class ProcessRequest implements Runnable{    
    Socket cliente;
    StringBuffer mensaje;
    public ProcessRequest(Socket cliente) 
    {
        this.cliente = cliente;
    }
    
    public void run() {
        int c;
        mensaje = new StringBuffer();
        try {
            BufferedInputStream bis = new BufferedInputStream(cliente.getInputStream());
            InputStreamReader isr = new InputStreamReader(bis);
            
            BufferedOutputStream bos = new BufferedOutputStream(cliente.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter(bos);
            
            while((c = isr.read())!= (char)13)
            {
                mensaje.append((char)c);                
            }
            System.out.println("cliente dice: "+mensaje);
            
            osw.write("Request accepted" + (char)13);
            osw.flush();
            cliente.close();            
        } catch (IOException ex) {
           
            
        }
        
        
        
        
        
    }
    


    
            
    
}
