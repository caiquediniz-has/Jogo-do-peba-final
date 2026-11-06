/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeservadores;

import janelas.TelaJogo;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import motor.Pular;

public class ObservadorTelaJogo implements KeyListener{
    private TelaJogo telaJogo;
    
    public ObservadorTelaJogo(TelaJogo telaJogo) {
        this.telaJogo = telaJogo;
    }
    
    

    @Override
    public void keyTyped(KeyEvent e) {
         if(e.getKeyChar() == ' '){
            Pular pular = new Pular(telaJogo);
            pular.start();}}

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
   
    
  
        
}
