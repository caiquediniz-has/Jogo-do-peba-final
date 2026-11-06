/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

import javax.swing.JLabel;
import obeservadores.Escudo;

/**
 *
 * @author caique
 */
public class MoverEscudo extends Thread{
    private JLabel escudo;
    
    public MoverEscudo(JLabel escudo){
        this.escudo = escudo;
    }
    
    public void run(){
        while(true){
            try {
            sleep(2);
        } catch (InterruptedException ex) {
            System.getLogger(MoverEscudo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        escudo.setLocation(escudo.getX()-1, escudo.getY());
        
        }
    }
}
