/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author flavi
 */
public class Quadrado extends Forma {

    public Quadrado(Cor cor) {
        super(cor);
    }

    @Override
    public String desenhar() {
        return "Quadrado desenhado. " + this.cor.pintar();
    }
}
