/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

import janelas.TelaJogo;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.Timer;
import obeservadores.Chao;

/**
 *
 * @author caique
0 */
public class GerarChao extends Thread{
    private Random random = new Random();
    private TelaJogo telaJogo;
    private ArrayList<String> chaos = new ArrayList<>();
    private String chao1 = "src/img/chao/chao1.png";
    private Chao novoChao;
    private Timer timer;
    private Chao referencia;
    private int camada;
    private int x;
    private int y;
    private int tempo;
    private int deslocamento;
    private int largura;
    private int altura;
    
    public GerarChao(TelaJogo telaJogo, Chao referencia,int deslocamento, int tempo, int camada, int largura, int altura, int x, int y){
        this.telaJogo = telaJogo;
        this.referencia = referencia;
        this.camada = camada;
        this.deslocamento = deslocamento;
        this.tempo = tempo;
        this.largura = largura;
        this.altura = altura;
        this.x = x;
        this.y = y;
    
    }
    
    public void run(){
        timer = new Timer(2, (e) -> {
        if(referencia.getX() <= 0){
            novoChao = new Chao();
            novoChao.setIcon(referencia.getIcon());
            telaJogo.getCamada().add(novoChao, Integer.valueOf(camada));
            novoChao.setLocation(x, y);
            novoChao.setSize(largura, altura);
            novoChao.setVisible(true);
            novoChao.mexer(deslocamento, tempo);
            referencia = novoChao;
        }});timer.start();
            }
           
        }
    

