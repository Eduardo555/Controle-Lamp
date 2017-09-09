package Classes;


import java.io.IOException;

/*
 * Classe capas de executar os comandos do apache no terminal via codigo fonte java
 * 
 */

/**
 *
 * @author eduardo
 */
public class controleApache {
    
    public boolean iniciarApache(){
        
        Runtime run = Runtime.getRuntime();
        try{
            
            String command = "systemctl start httpd";
            run.exec(command);
            return true;
            
        }catch(IOException e){
            return false;
        }
        
    }
    public boolean desligarApache(){
        
        Runtime run = Runtime.getRuntime();
        try{
            
            String command = "systemctl stop httpd";
            run.exec(command);
            return true;
            
        }catch(IOException e){
            return false;
        }
        
    }
    
}
