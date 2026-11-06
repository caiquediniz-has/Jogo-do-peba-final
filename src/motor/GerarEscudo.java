/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

import janelas.TelaJogo;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import obeservadores.Escudo;

/**
 *
 * @author caique
 */
public class GerarEscudo extends Thread{
    private Escudo escudo;
    private MoverEscudo moverEscudo;
    private Random random = new Random();
    private TelaJogo telaJogo;
    private boolean gerar;
    private EscudoBateuNoPeba bateuNoPeba;
    
    public GerarEscudo(TelaJogo telaJogo){
         this.telaJogo = telaJogo;
         
    }
    
    public void aparecerEscudo(){
        int num = random.nextInt(30);
         if (num == 5){
             if(telaJogo.isEscudo()){
                escudo = new Escudo();
                telaJogo.getCamada().add(escudo, Integer.valueOf(10));
                moverEscudo = new MoverEscudo(escudo);
                bateuNoPeba = new EscudoBateuNoPeba(telaJogo, escudo);
                bateuNoPeba.start();
                moverEscudo.start();
             }
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                System.getLogger(GerarEscudo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
         }
    }
    
    public void run(){
      while(true){
        try {
            sleep(500);
        } catch (InterruptedException ex) {
            System.getLogger(GerarEscudo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        aparecerEscudo();
        }
    }

    public void setGerar(boolean gerar) {
        this.gerar = gerar;
    }

    
    
}
