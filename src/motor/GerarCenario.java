/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

import janelas.TelaJogo;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import obeservadores.ComponenteCenario;

/**
 *
 * @author caique
 */
public class GerarCenario extends Thread {

    private TelaJogo telaJogo;
    private ComponenteCenario referencia;
    private ComponenteCenario novoComponente;
    private Timer timerGeraNovoComponente;
    private int tempo;
    private int x;
    private int y;
    private int camada;
    private int velocidade;
    private MoverComponenteCenario moverComponente;

    public GerarCenario(TelaJogo telaJogo, ComponenteCenario referencia, int tempo, int x, int y, int camada) {
        this.referencia = referencia;
        this.telaJogo = telaJogo;
        this.tempo = tempo;
        this.x = x;
        this.y = y;
        this.camada = camada;
        
    }

    public void run() {

        while (true) {
            try {
                sleep(tempo);
            } catch (InterruptedException ex) {
                System.getLogger(GerarCenario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        
            if (referencia.getX() <= 0) {
                novoComponente = new ComponenteCenario(referencia.getTelaJogo(), referencia.getCaminho(), x, y, referencia.getLargura(), referencia.getAltura());
                moverComponente = new MoverComponenteCenario(novoComponente, tempo);
                telaJogo.getCamada().add(novoComponente, Integer.valueOf(camada));
                referencia = novoComponente;
                moverComponente.start();
            }

        }
    }
}
