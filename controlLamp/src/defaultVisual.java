
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class defaultVisual {
    
    public void carregaVisualSistema(){
             {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Erro Critico // não foi possivel carregar o look and fell");
            e.printStackTrace();
        }
    }
    }
    
}
