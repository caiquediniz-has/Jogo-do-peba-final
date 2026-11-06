/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

import janelas.TelaJogo;
import javax.swing.ImageIcon;
import obeservadores.Escudo;

/**
 *
 * @author caique
 */
public class EscudoBateuNoPeba extends Thread{
    private TelaJogo telaJogo;
    private Escudo escudo;

    public EscudoBateuNoPeba(TelaJogo telaJogo, Escudo escudo) {
        this.telaJogo = telaJogo;
        this.escudo = escudo;
    }
    
    public void run(){
        while(true){
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                System.getLogger(EscudoBateuNoPeba.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            if(telaJogo.getPebaViado().getBounds().intersects(escudo.getBounds())){
                telaJogo.getPebaViado().setIcon(new ImageIcon("src/img/peba/pebaAndandoEscudado (2).gif"));
                escudo.setVisible(false);
                telaJogo.setEscudo(false);
            }}
    }
}
