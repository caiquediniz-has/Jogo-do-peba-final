
package obeservadores;

import janelas.MenuInicial;
import janelas.TelaJogo;
import janelas.Troll;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author caique
 */
public class ObservadorMenuInicial implements ActionListener{
    MenuInicial menuInicial;

    public ObservadorMenuInicial(MenuInicial menuInicial) {
        this.menuInicial = menuInicial;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(menuInicial.getTroll())){
            new Troll();
        }else if(e.getSource().equals(menuInicial.getIniciarJogo())){
            new TelaJogo();
    }else if (e.getSource().equals(menuInicial.getSair()))
        System.exit(0);
    }
    
}
