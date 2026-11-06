/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeservadores;

import janelas.TelaJogo;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author caique
 */
public class Chao extends JLabel{
    private Timer timer;
    
       
    public Chao(){
        
        setIcon(new ImageIcon("src/img/chao/chao1.png"));
        setBounds(0, 530, 1024, 128);
        setVisible(true);       
    }
        public void mexer(int deslocamento, int tempo){
            timer = new Timer(tempo, (e) -> {
                setLocation(getX()-deslocamento, getY());
            }); timer.start();
        }
    
}
