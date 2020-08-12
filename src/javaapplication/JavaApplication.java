package javaapplication;

public class JavaApplication {

    // O padrão de projeto estrutual Bridge se torna útil quando se faz necessário
    // a troca da implementação de um método em tempo de execução dentro de uma
    // não instanciável.
    public static void main(String[] args) {
        Forma quadrado = new Quadrado(new Azul());
        System.out.println(quadrado.desenhar());
        
        // Nesse ponto do código podemos trocar a implementação do método
        // da classe Cor que é chamado dentro da classe Forma.
        quadrado.setCor(() -> "A cor é vermelha!");
        System.out.println(quadrado.desenhar());
    }
}
