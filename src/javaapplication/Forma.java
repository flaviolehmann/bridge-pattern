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
public abstract class Forma {
    
    protected Cor cor;

    public Forma(Cor cor) {
        this.cor = cor;
    }
    
    abstract public String desenhar();

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
