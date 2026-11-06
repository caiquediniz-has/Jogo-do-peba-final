/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

import janelas.TelaJogo;
import java.util.ArrayList;
import java.util.Random;
import obeservadores.Cacto;
import obeservadores.Inimigo;
import obeservadores.Urubu;

public class GerarInimigo extends Thread{
    private Cacto cacto;
    private Cacto cacto2;
    private TelaJogo telaJogo;
    private Urubu urubu;
    private Cacto cacto3;
    private Random random = new Random();
    private boolean mover = true;
    private int camada = 5;

    public GerarInimigo(TelaJogo telaJogo) {
        this.telaJogo = telaJogo;
    }
    
    
    public void run(){
        while(true){
            int num = random.nextInt(4);
            
            if(num == 0){
                urubu = new Urubu("src/img/urubus/urubuVoando.gif",telaJogo);
                telaJogo.getInimigos().add(urubu);
                urubu.andar();
                urubu.verSeBateuNoPeba();
                telaJogo.getCamada().add(urubu, Integer.valueOf(camada) );
                urubu.verSeSaiuDaJanela();
            }else if(num == 1){
                cacto = new Cacto("src/img/cactos/cacto1.png",telaJogo);
                telaJogo.getInimigos().add(cacto);
                telaJogo.getCamada().add(cacto, Integer.valueOf(camada) );
                cacto.andar();
                cacto.verSeBateuNoPeba();
                cacto.verSeSaiuDaJanela();
            }else if(num == 2){
                cacto2 = new Cacto("src/img/cactos/cacto2.png",telaJogo);
                cacto2.setLocation(cacto2.getX(), cacto2.getY()+20);
                telaJogo.getInimigos().add(cacto2);
                telaJogo.getCamada().add(cacto2, Integer.valueOf(camada) );                
                cacto2.andar();
                cacto2.verSeBateuNoPeba();
                cacto2.verSeSaiuDaJanela();
            }else if(num == 3){
                cacto3 = new Cacto("src/img/cactos/cacto3.png",telaJogo);
                cacto3.setSize(124,181);
                cacto3.setLocation(cacto3.getX(), 380);
                telaJogo.getInimigos().add(cacto3);
                telaJogo.getCamada().add(cacto3 , Integer.valueOf(camada) );
                cacto3.andar();
                cacto3.verSeBateuNoPeba();
                cacto3.verSeSaiuDaJanela();
            }


            try {
                sleep(3000);
            } catch (InterruptedException ex) {
                System.getLogger(GerarInimigo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        
        }
    }

    
}
