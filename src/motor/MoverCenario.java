/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

import janelas.TelaJogo;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author caique
 */
public class MoverCenario extends Thread{
    private TelaJogo telaJogo;
    private JLabel componente;
    private Timer timer;
    private int tempo;
    private int deslocamento;

    public MoverCenario(TelaJogo telaJogo, JLabel componente, int tempo, int deslocamento) {
        this.telaJogo = telaJogo;
        this.componente = componente;
        this.tempo = tempo;
        this.deslocamento = deslocamento;
    }
    
    public void moverComponente(){
        timer = new Timer(tempo, (e) -> {
            componente.setLocation(componente.getX()-deslocamento, componente.getY());
        });
        timer.start();
       
    }
    public void pararComponente(JLabel componente){
        timer.stop();
    }
}
