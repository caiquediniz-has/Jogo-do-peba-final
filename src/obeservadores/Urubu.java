/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeservadores;

import janelas.TelaJogo;

/**
 *
 * @author caique
 */
public class Urubu extends Inimigo{
    
    public Urubu(String caminho, TelaJogo telaJogo) {
        super(caminho, telaJogo);
        setSize(220,104);
        setLocation(getX(), 300);
    }
    
    
    
}
