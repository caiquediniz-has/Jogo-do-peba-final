/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

import janelas.TelaJogo;
import obeservadores.ComponenteCenario;

/**
 *
 * @author caique
 */
public class MoverComponenteCenario extends Thread{
    private ComponenteCenario componente;
    private int velocidade;

    public MoverComponenteCenario(ComponenteCenario componente, int velocidade) {
        this.componente = componente;
        this.velocidade = velocidade;
    }
    
    public void run(){
        while(true){
        try {
            sleep(velocidade);
        } catch (InterruptedException ex) {
            System.getLogger(MoverComponenteCenario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        componente.setLocation(componente.getX()-1, componente.getY());
    }}
    
}
