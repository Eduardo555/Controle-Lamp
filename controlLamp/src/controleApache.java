
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
            
            String command = "service apache2 start";
            run.exec(command);
            return true;
            
        }catch(IOException e){
            return false;
        }
        
    }
    public boolean desligarApache(){
        
        Runtime run = Runtime.getRuntime();
        try{
            
            String command = "service apache2 stop";
            run.exec(command);
            return true;
            
        }catch(IOException e){
            return false;
        }
        
    }
    
}
