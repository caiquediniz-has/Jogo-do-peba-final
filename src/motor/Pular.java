/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

import janelas.TelaJogo;
import java.time.Duration;

/**
 *
 * @author caique
 */
public class Pular extends Thread{
    private TelaJogo telaJogo;
    private static boolean pulando = false;

    public Pular(TelaJogo telaJogo) {
        this.telaJogo = telaJogo;
    }
    
    public void run(){
        if(pulando){
            return;
        }
        pulando = true;
        telaJogo.getPebaViado().setLocation(telaJogo.getPebaViado().getX(),telaJogo.getPebaViado().getY()-160);
       
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            System.getLogger(Pular.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        telaJogo.getPebaViado().setLocation(telaJogo.getPebaViado().getX(),telaJogo.getPebaViado().getY()+160);
        pulando = false;
    }
    }
