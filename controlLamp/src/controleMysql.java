
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class controleMysql {
    
    public boolean iniciarMysql(){
        
        Runtime run = Runtime.getRuntime();
        try{
            
            String command = "service mysql start";
            run.exec(command);
            return true;
            
        }catch(IOException e){
            return false;
        }
        
    }
    public boolean desligarMysql(){
        
        Runtime run = Runtime.getRuntime();
        try{
            
            String command = "service mysql stop";
            run.exec(command);
            return true;
            
        }catch(IOException e){
            return false;
        }
        
    }
    
}
