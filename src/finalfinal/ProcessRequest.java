package finalfinal;

import static com.sun.jmx.snmp.ThreadContext.push;
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
    Vector v;
    StringBuffer mensaje;
    
    public ProcessRequest(Socket cliente, Vector v) 
    {
        
        this.cliente = cliente;
        this.v = v;
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
            
            v.add(mensaje);
            
            
            
            
            osw.write("Request accepted" + (char)13);
            osw.flush();
            cliente.close();            
        } catch (IOException ex) {
           
            
        }
        
        
        
        
        
    }
    


    
            
    
}
